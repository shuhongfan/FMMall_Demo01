package com.qfedu.fmmall.service.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.fmmall.dao.ProductImgMapper;
import com.qfedu.fmmall.dao.ProductMapper;
import com.qfedu.fmmall.dao.ProductParamsMapper;
import com.qfedu.fmmall.dao.ProductSkuMapper;
import com.qfedu.fmmall.entity.*;
import com.qfedu.fmmall.service.ProductService;
import com.qfedu.fmmall.utils.PageHelper;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.io.IOException;
import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductImgMapper productImgMapper;
    @Autowired
    private ProductSkuMapper productSkuMapper;
    @Autowired
    private ProductParamsMapper productParamsMapper;

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private ObjectMapper objectMapper = new ObjectMapper();

    public ResultVO listRecommendProducts() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", productVOS);
        return resultVO;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO getProductBasicInfo(String productId) {
        try{
            // ①根据商品id查询redis
            String productInfo = (String) stringRedisTemplate.boundHashOps("products").get(productId);

            // ②如果reids中查询到了商品信息，则直接返回给控制器
            if(productInfo != null){
                Product product =objectMapper.readValue(productInfo, Product.class);
                //从redis中查询此商品的图片
                String imgsStr = (String) stringRedisTemplate.boundHashOps("productImgs").get(productId);
                JavaType javaType1 = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, ProductImg.class);
                List<ProductImg> productImgs = objectMapper.readValue(imgsStr, javaType1);
                //从redis中查询此商品的套餐
                String skusStr = (String) stringRedisTemplate.boundHashOps("productSkus").get(productId);
                JavaType javaType2 = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, ProductSku.class);
                List<ProductSku> productSkus = objectMapper.readValue(skusStr, javaType2);
                //封装商品、图片及套餐
                HashMap<String,Object> basicInfo = new HashMap<>();
                basicInfo.put("product",product);
                basicInfo.put("productImgs",productImgs);
                basicInfo.put("productSkus",productSkus);
                return new ResultVO(ResStatus.OK,"success",basicInfo);
            }else{
                //③如果redis中没有查询到商品信息，则查询数据库
                //商品基本信息
                Example example = new Example(Product.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andEqualTo("productId",productId);
                criteria.andEqualTo("productStatus",1);//状态为1表示上架商品
                List<Product> products = productMapper.selectByExample(example);
                if(products.size() > 0 ){
                    //④ 将从数据库查询的数据写入到redis
                    Product product = products.get(0);
                    String jsonStr = objectMapper.writeValueAsString(product);
                    stringRedisTemplate.boundHashOps("products").put(productId,jsonStr);

                    //根据商品id查询商品图片
                    Example example1 = new Example(ProductImg.class);
                    Example.Criteria criteria1 = example1.createCriteria();
                    criteria1.andEqualTo("itemId",productId);
                    List<ProductImg> productImgs = productImgMapper.selectByExample(example1);
                    stringRedisTemplate.boundHashOps("productImgs").put(productId, objectMapper.writeValueAsString(productImgs) );

                    //根据商品id查询商品套餐
                    Example example2 = new Example(ProductSku.class);
                    Example.Criteria criteria2 = example2.createCriteria();
                    criteria2.andEqualTo("productId",productId);
                    criteria2.andEqualTo("status",1);
                    List<ProductSku> productSkus = productSkuMapper.selectByExample(example2);
                    stringRedisTemplate.boundHashOps("productSkus").put(productId,objectMapper.writeValueAsString(productSkus));

                    HashMap<String,Object> basicInfo = new HashMap<>();
                    basicInfo.put("product",products.get(0));
                    basicInfo.put("productImgs",productImgs);
                    basicInfo.put("productSkus",productSkus);
                    return new ResultVO(ResStatus.OK,"success",basicInfo);
                }
            }
        }catch (Exception e){
        }
        return new ResultVO(ResStatus.NO,"fail",null);
    }

    @Override
    public ResultVO getProductParamsById(String productId) {
        Example example = new Example(ProductParams.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("productId",productId);
        List<ProductParams> productParams = productParamsMapper.selectByExample(example);
        if(productParams.size()>0){
            return new ResultVO(ResStatus.OK,"success",productParams.get(0));
        }else{
            return new ResultVO(ResStatus.NO,"此商品可能为三无产品",null);
        }
    }

    @Override
    public ResultVO getProductsByCategoryId(int categoryId, int pageNum, int limit) {
        //1.查询分页数据
        int start = (pageNum-1)*limit;
        List<ProductVO> productVOS = productMapper.selectProductByCategoryId(categoryId, start, limit);
        //2.查询当前类别下的商品的总记录数
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("categoryId",categoryId);
        int count = productMapper.selectCountByExample(example);
        //3.计算总页数
        int pageCount = count%limit==0? count/limit : count/limit+1;
        //4.封装返回数据
        PageHelper<ProductVO> pageHelper = new PageHelper<>(count, pageCount, productVOS);
        return new ResultVO(ResStatus.OK,"SUCCESS",pageHelper);
    }

    @Override
    public ResultVO listBrands(int categoryId) {
        List<String> brands = productMapper.selectBrandByCategoryId(categoryId);
        return new ResultVO(ResStatus.OK,"success",brands);
    }

    @Override
    public ResultVO searchProduct(String kw, int pageNum, int limit) {
        ResultVO resultVO = null;
        try {
            //1.查询搜索结果
            int start = (pageNum-1)*limit;
            //从ES查询数据
            SearchRequest searchRequest = new SearchRequest("fmmallproductsindex");
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            //查询条件
            searchSourceBuilder.query(QueryBuilders.multiMatchQuery(kw,"productName","productSkuName"));
            //分页条件
            searchSourceBuilder.from(start);
            searchSourceBuilder.size(limit);
            //高亮显示
            HighlightBuilder highlightBuilder = new HighlightBuilder();
            HighlightBuilder.Field field1 = new HighlightBuilder.Field("productName");
            HighlightBuilder.Field field2 = new HighlightBuilder.Field("productSkuName");
            highlightBuilder.field(field1);
            highlightBuilder.field(field2);
            highlightBuilder.preTags("<label style='color:red'>");
            highlightBuilder.postTags("</label>");
            searchSourceBuilder.highlighter(highlightBuilder);
            searchRequest.source(searchSourceBuilder);
            //执行检索
            SearchResponse searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);

            //封裝查詢結果
            SearchHits hits = searchResponse.getHits();
            //获取总记录数
            int count = (int)(hits.getTotalHits().value);
            //计算总页数
            int pageCount = count%limit==0? count/limit:count/limit+1;

            Iterator<SearchHit> iterator = hits.iterator();
            List<Product4ES> products = new ArrayList<>();
            while(iterator.hasNext()){
                SearchHit searchHit = iterator.next();
                Product4ES product4ES = objectMapper.readValue(searchHit.getSourceAsString(), Product4ES.class);
                //获取高亮字段
                Map<String, HighlightField> highlightFields = searchHit.getHighlightFields();
                //productName
                HighlightField highlightField1 = highlightFields.get("productName");
                if(highlightField1!=null){
                    String highLightProductName = Arrays.toString(highlightField1.fragments());
                    product4ES.setProductName(highLightProductName);
                }
                products.add(product4ES);
            }

            //4.封装，返回数据
            PageHelper<Product4ES> pageHelper = new PageHelper<>(count, pageCount, products);
            resultVO = new ResultVO(ResStatus.OK, "SUCCESS", pageHelper);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultVO;
    }

    @Override
    public ResultVO listBrands(String kw) {
        kw = "%"+kw+"%";
        List<String> brands = productMapper.selectBrandByKeyword(kw);
        return new ResultVO(ResStatus.OK,"SUCCESS",brands);
    }
}
