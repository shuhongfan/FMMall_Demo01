package com.qfedu.fmmall;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.fmmall.dao.ProductMapper;
import com.qfedu.fmmall.entity.Product4ES;
import com.qfedu.fmmall.entity.ProductSku;
import com.qfedu.fmmall.entity.ProductVO;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ApiApplication.class)
public class ImportProductInfoIntoES {

    @Autowired
    private RestHighLevelClient restHighLevelClient;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateIndex() throws IOException {
        //创建索引
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("fmmallproductsindex");
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse.isAcknowledged());
    }

    @Test
    public void testImportData() throws IOException {
        //1.从数据库查询数据
        List<ProductVO> productVOS = productMapper.selectProducts();
        System.out.println(productVOS.size());

        //2.将查询到数据写入到ES
        for (int i = 0; i <productVOS.size() ; i++) {
            ProductVO productVO = productVOS.get(i);

            String productId = productVO.getProductId();
            String productName = productVO.getProductName();
            Integer soldNum = productVO.getSoldNum();

            List<ProductSku> skus = productVO.getSkus();

            String skuName = skus.size()==0?"": skus.get(0).getSkuName();
            String skuImg = skus.size()==0?"":skus.get(0).getSkuImg();
            Integer sellPrice = skus.size()==0?0:skus.get(0).getSellPrice();

            Product4ES product = new Product4ES(productId,productName,skuImg,soldNum,skuName,sellPrice);

            IndexRequest request = new IndexRequest("fmmallproductsindex");
            request.id(productId);
            request.source(objectMapper.writeValueAsString(product), XContentType.JSON);
            IndexResponse indexResponse = restHighLevelClient.index(request, RequestOptions.DEFAULT);
            System.out.println((i+1)+"---"+indexResponse);
        }

    }

}
