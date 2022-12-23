/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost:3306
 Source Schema         : fmmall2

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : 65001

 Date: 12/05/2021 23:16:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `category_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 分类id主键',
  `category_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称 分类名称',
  `category_level` int(11) NOT NULL COMMENT '分类层级 分类得类型，\n1:一级大分类\n2:二级分类\n3:三级小分类',
  `parent_id` int(11) NOT NULL COMMENT '父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级',
  `category_icon` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标 logo',
  `category_slogan` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '口号',
  `category_pic` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类图',
  `category_bg_color` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '背景颜色',
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品分类' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '点心/蛋糕', 1, 0, 'cake.png', '每一道甜品都有一个故事', 'act1.png', 'black');
INSERT INTO `category` VALUES (2, '饼干/膨化', 1, 0, 'cookies.png', '健康饮食远离我', 'act2.png', 'black');
INSERT INTO `category` VALUES (3, '熟食/肉类', 1, 0, 'meat.png', 'nice！nice！nice！', 'act3.png', 'black');
INSERT INTO `category` VALUES (4, '素食/卤味', 1, 0, 'bamboo.png', NULL, 'act1.png', 'black');
INSERT INTO `category` VALUES (5, '坚果/炒货', 1, 0, 'nut.png', '酥酥脆脆，回味无穷', 'act2.png', 'black');
INSERT INTO `category` VALUES (6, '糖果/蜜饯', 1, 0, 'candy.png', NULL, 'act3.png', 'black');
INSERT INTO `category` VALUES (7, '巧克力', 1, 0, 'chocolate.png', NULL, 'act1.png', 'black');
INSERT INTO `category` VALUES (8, '海味/河鲜', 1, 0, 'fish.png', NULL, 'act2.png', 'black');
INSERT INTO `category` VALUES (9, '花茶/果茶', 1, 0, 'tea.png', '健康快乐每一天', 'act3.png', 'black');
INSERT INTO `category` VALUES (10, '品牌/礼包', 1, 0, 'package.png', '每日一个小惊喜', 'act1.png', 'black');
INSERT INTO `category` VALUES (11, '蛋糕', 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (12, '点心', 2, 1, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (13, '饼干', 2, 2, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (14, '薯片', 2, 2, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (15, '虾条', 2, 2, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (16, '猪肉脯', 2, 3, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (17, '牛肉丝', 2, 3, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (18, '小香肠', 2, 3, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (19, '豆干', 2, 4, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (20, '干笋', 2, 4, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (21, '鸭脖', 2, 4, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (22, '坚果', 2, 5, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (23, '锅巴', 2, 5, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (24, '糖果', 2, 6, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (25, '蜜饯', 2, 6, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (26, '巧克力', 2, 7, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (27, '果冻', 2, 7, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (28, '海带丝', 2, 8, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (29, '小鱼干', 2, 8, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (30, '鱿鱼丝', 2, 8, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (31, '花茶', 2, 9, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (32, '果茶', 2, 9, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (33, '品牌套餐', 2, 10, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (34, '活动礼包', 2, 10, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (35, '蒸蛋糕', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (36, '脱水蛋糕', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (37, '瑞士卷', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (38, '软面包', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (39, '马卡龙', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (40, '千层饼', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (41, '甜甜圈', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (42, '蒸三明治', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (43, '铜锣烧', 3, 11, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (44, '华夫饼', 3, 12, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (45, '老婆饼', 3, 12, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (46, '奥利奥', 3, 13, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (47, '粤利粤', 3, 13, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (49, '膨化虾条', 3, 15, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (50, '油炸虾条', 3, 15, NULL, NULL, NULL, NULL);
INSERT INTO `category` VALUES (51, '海鲜虾条', 3, 15, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for index_img
-- ----------------------------
DROP TABLE IF EXISTS `index_img`;
CREATE TABLE `index_img`  (
  `img_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `img_url` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片 图片地址',
  `img_bg_color` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '背景色 背景颜色',
  `prod_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品id 商品id',
  `category_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品分类id 商品分类id',
  `index_type` int(11) NOT NULL COMMENT '轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类',
  `seq` int(11) NOT NULL COMMENT '轮播图展示顺序 轮播图展示顺序，从小到大',
  `status` int(11) NOT NULL COMMENT '是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间 创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间 更新',
  PRIMARY KEY (`img_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '轮播图 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of index_img
-- ----------------------------
INSERT INTO `index_img` VALUES ('1', 'ad1.jpg', 'green', '101', NULL, 1, 1, 1, '2021-04-14 17:21:13', '2021-04-14 17:21:18');
INSERT INTO `index_img` VALUES ('2', 'ad2.jpg', 'pink', NULL, '1', 2, 2, 1, '2021-04-14 17:21:49', '2021-04-14 17:21:52');
INSERT INTO `index_img` VALUES ('3', 'ad3.jpg', 'black', '103', NULL, 1, 3, 1, '2021-04-14 17:22:23', '2021-04-14 17:22:27');
INSERT INTO `index_img` VALUES ('4', 'ad4.jpg', 'orange', NULL, '2', 2, 4, 1, '2021-04-14 17:23:06', '2021-04-14 17:23:08');
INSERT INTO `index_img` VALUES ('5', 'ad5.jpg', 'yellow', '101', NULL, 1, 2, 0, '2021-04-24 09:34:01', '2021-04-25 09:34:05');

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item`  (
  `item_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单项ID',
  `order_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单ID',
  `product_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品ID',
  `product_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `product_img` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
  `sku_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'skuID',
  `sku_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sku名称',
  `product_price` decimal(32, 8) NOT NULL COMMENT '商品价格',
  `buy_counts` int(11) NOT NULL COMMENT '购买数量',
  `total_amount` decimal(32, 8) NULL DEFAULT NULL COMMENT '商品总金额',
  `basket_date` datetime(0) NULL DEFAULT NULL COMMENT '加入购物车时间',
  `buy_time` datetime(0) NULL DEFAULT NULL COMMENT '购买时间',
  `is_comment` int(11) NULL DEFAULT NULL COMMENT '评论状态： 0 未评价  1 已评价',
  PRIMARY KEY (`item_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单项/快照 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of order_item
-- ----------------------------
INSERT INTO `order_item` VALUES ('162035224946053220', 'd1dd179a0d194351b7bfa658f3d86579', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 09:50:49', '2021-05-07 09:50:49', 0);
INSERT INTO `order_item` VALUES ('162035224946331626', 'd1dd179a0d194351b7bfa658f3d86579', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 1, 5.00000000, '2021-05-07 09:50:49', '2021-05-07 09:50:49', 0);
INSERT INTO `order_item` VALUES ('162035239193969518', 'f67b950e78ae45ee8bae922e8dab6ddc', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 09:53:12', '2021-05-07 09:53:12', 0);
INSERT INTO `order_item` VALUES ('162035239194391040', 'f67b950e78ae45ee8bae922e8dab6ddc', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 09:53:12', '2021-05-07 09:53:12', 0);
INSERT INTO `order_item` VALUES ('162035244829784296', '1384c48a7ac846919dd8ca67209ff3eb', '3', '咪咪虾条', 'mmxt_1.png', '3', '咪咪虾条 整箱50包', 40.00000000, 1, 40.00000000, '2021-05-07 09:54:08', '2021-05-07 09:54:08', 0);
INSERT INTO `order_item` VALUES ('162035363560419828', '93b67b8122284b2fabd28c2e5d1c9914', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 2, 16.00000000, '2021-05-07 10:13:56', '2021-05-07 10:13:56', 0);
INSERT INTO `order_item` VALUES ('162035363560786072', '93b67b8122284b2fabd28c2e5d1c9914', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 2, 2.00000000, '2021-05-07 10:13:56', '2021-05-07 10:13:56', 0);
INSERT INTO `order_item` VALUES ('162035369543491781', '2edae7d9f94e42dd87841e3fb625976b', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 10:14:55', '2021-05-07 10:14:55', 0);
INSERT INTO `order_item` VALUES ('162035393785519495', '71ac3b8e8d5e4b79a60cb5777b9a71b3', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 10:18:58', '2021-05-07 10:18:58', 0);
INSERT INTO `order_item` VALUES ('162035925277726911', 'f9743ec166de4e8f9bce8a2510b6cf54', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 11:47:33', '2021-05-07 11:47:33', 0);
INSERT INTO `order_item` VALUES ('162036003915252536', 'ca364a09c3b04cf881e0944ede34563b', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 12:00:39', '2021-05-07 12:00:39', 0);
INSERT INTO `order_item` VALUES ('162036018493853367', '966b276ac926447295e66b077c607f27', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 1, 5.00000000, '2021-05-07 12:03:05', '2021-05-07 12:03:05', 0);
INSERT INTO `order_item` VALUES ('162036062141658185', 'c2efcd6725174b7fa27829382fd89e6a', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 12:10:21', '2021-05-07 12:10:21', 0);
INSERT INTO `order_item` VALUES ('162036952987560822', '2133a588a8e0455ba063065cc5337610', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 14:38:50', '2021-05-07 14:38:50', 0);
INSERT INTO `order_item` VALUES ('162036975185215005', 'e7f3a0d3fccf40a88d05f7b1ca7e1700', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 14:42:32', '2021-05-07 14:42:32', 0);
INSERT INTO `order_item` VALUES ('162037097271483830', 'e863aeb9da464367bf3b4c5f35d0a31a', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 1, 5.00000000, '2021-05-07 15:02:53', '2021-05-07 15:02:53', 0);
INSERT INTO `order_item` VALUES ('162037120901316335', '5a718a72fe0945dda48a8d23cbf5ce0a', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 15:06:49', '2021-05-07 15:06:49', 0);
INSERT INTO `order_item` VALUES ('162037132177612607', '0ac64e4b59744e0a9576c9d18ef064bf', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 15:08:42', '2021-05-07 15:08:42', 0);
INSERT INTO `order_item` VALUES ('162037140215198256', '7fd895de83fa4de7a63f04c90b533bfa', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 15:10:02', '2021-05-07 15:10:02', 0);
INSERT INTO `order_item` VALUES ('162037373127956965', '0b2dbc2ad85e4520974c9e42ce8472a5', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 15:48:51', '2021-05-07 15:48:51', 0);
INSERT INTO `order_item` VALUES ('162037376667659948', '952751f3426f4e47bf26a181a15548b2', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 15:49:27', '2021-05-07 15:49:27', 0);
INSERT INTO `order_item` VALUES ('162037384437627755', '3995d67937ba434aa2c0fc66bfd88cfe', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 15:50:44', '2021-05-07 15:50:44', 0);
INSERT INTO `order_item` VALUES ('162037389382996880', '35ec6155dd104a36bc621b31636b9184', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 15:51:34', '2021-05-07 15:51:34', 0);
INSERT INTO `order_item` VALUES ('162037396115692154', 'a8a619e81d5042aaad1975da52ce6ee5', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-07 15:52:41', '2021-05-07 15:52:41', 0);
INSERT INTO `order_item` VALUES ('162037456196979919', 'a5e54d2af3e347ddaa2efc0e31160ffa', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-07 16:02:42', '2021-05-07 16:02:42', 0);
INSERT INTO `order_item` VALUES ('162043632418153562', 'ea4e4918a7dc4ec3acfecaa7d5a2ae51', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 2, 10.00000000, '2021-05-08 09:12:04', '2021-05-08 09:12:04', 0);
INSERT INTO `order_item` VALUES ('162044049434687767', 'fb6e252e26c94935b3ce8a7b7bb82ddd', '3', '咪咪虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-08 10:21:34', '2021-05-08 10:21:34', 0);
INSERT INTO `order_item` VALUES ('162045603664274927', 'f1d426615dc84e4abb37974ae25c1cd9', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 4, 32.00000000, '2021-05-08 14:40:37', '2021-05-08 14:40:37', 0);
INSERT INTO `order_item` VALUES ('162045622247254235', '456ab37f8ba04739b4cdf47afa4a2096', '1', '奥利奥小饼干', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 2, 16.00000000, '2021-05-08 14:43:42', '2021-05-08 14:43:42', 0);
INSERT INTO `order_item` VALUES ('162045622247324200', '456ab37f8ba04739b4cdf47afa4a2096', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 2, 10.00000000, '2021-05-08 14:43:42', '2021-05-08 14:43:42', 0);
INSERT INTO `order_item` VALUES ('162046467128490816', '194591690fee43eda20b85f35d71a376', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 2, 10.00000000, '2021-05-08 17:04:31', '2021-05-08 17:04:31', 0);
INSERT INTO `order_item` VALUES ('162046484862056903', 'dd4b131a6bcc46b1a7c266423ee04a29', '3', '咪咪虾条', 'mmxt_1.png', '2', '咪咪虾条 6连包', 5.00000000, 1, 5.00000000, '2021-05-08 17:07:29', '2021-05-08 17:07:29', 0);
INSERT INTO `order_item` VALUES ('162070057695451341', '0bdf74d7cb584011a205cb6255dc3810', '3', '咪咪小虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-11 10:36:17', '2021-05-11 10:36:17', 0);
INSERT INTO `order_item` VALUES ('162070062023433211', '1e6557bf82c04fd28032c1ca56a77a84', '1', '奥利奥小饼干666', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 2, 16.00000000, '2021-05-11 10:37:00', '2021-05-11 10:37:00', 0);
INSERT INTO `order_item` VALUES ('162070067082231040', 'b670af2c2779449cbe16ec5b021fdd25', '1', '奥利奥小饼干666', 'ala_1.png', '4', '奥利奥分享装', 8.00000000, 1, 8.00000000, '2021-05-11 10:37:51', '2021-05-11 10:37:51', 0);
INSERT INTO `order_item` VALUES ('162070067082334244', 'b670af2c2779449cbe16ec5b021fdd25', '3', '咪咪小虾条', 'mmxt_1.png', '1', '咪咪虾条 单包 50g', 1.00000000, 1, 1.00000000, '2021-05-11 10:37:51', '2021-05-11 10:37:51', 0);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单ID 同时也是订单编号',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `untitled` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品名称（多个产品用,隔开）',
  `receiver_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人快照',
  `receiver_mobile` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人手机号快照',
  `receiver_address` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货地址快照',
  `total_amount` decimal(32, 8) NULL DEFAULT NULL COMMENT '订单总价格',
  `actual_amount` int(11) NULL DEFAULT NULL COMMENT '实际支付总价格',
  `pay_type` int(11) NULL DEFAULT NULL COMMENT '支付方式 1:微信 2:支付宝',
  `order_remark` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单备注',
  `status` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭',
  `delivery_type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送方式',
  `delivery_flow_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物流单号',
  `order_freight` decimal(32, 8) NULL DEFAULT 0.00000000 COMMENT '订单运费 默认可以为零，代表包邮',
  `delete_status` int(11) NULL DEFAULT 0 COMMENT '逻辑删除状态 1: 删除 0:未删除',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间（成交时间）',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `pay_time` datetime(0) NULL DEFAULT NULL COMMENT '付款时间',
  `delivery_time` datetime(0) NULL DEFAULT NULL COMMENT '发货时间',
  `flish_time` datetime(0) NULL DEFAULT NULL COMMENT '完成时间',
  `cancel_time` datetime(0) NULL DEFAULT NULL COMMENT '取消时间',
  `close_type` int(11) NULL DEFAULT NULL COMMENT '订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('0ac64e4b59744e0a9576c9d18ef064bf', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 15:08:42', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('0b2dbc2ad85e4520974c9e42ce8472a5', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 15:48:51', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('0bdf74d7cb584011a205cb6255dc3810', '6', '咪咪小虾条,', '韩梅梅', '13232323322', '湖南 长沙 岳麓区 淅沥淅沥', 1.00000000, 1, 1, '', '1', NULL, NULL, NULL, NULL, '2021-05-11 10:36:17', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('1384c48a7ac846919dd8ca67209ff3eb', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 40.00000000, 40, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 09:54:08', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('194591690fee43eda20b85f35d71a376', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 10.00000000, 10, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-08 17:04:31', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('1e6557bf82c04fd28032c1ca56a77a84', '6', '奥利奥小饼干666,', '韩梅梅', '13232323322', '湖南 长沙 岳麓区 淅沥淅沥', 16.00000000, 16, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-11 10:37:00', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('2133a588a8e0455ba063065cc5337610', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 14:38:50', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('2edae7d9f94e42dd87841e3fb625976b', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 8.00000000, 8, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 10:14:55', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('35ec6155dd104a36bc621b31636b9184', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 8.00000000, 8, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 15:51:34', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('3995d67937ba434aa2c0fc66bfd88cfe', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 15:50:44', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('456ab37f8ba04739b4cdf47afa4a2096', '1', '奥利奥小饼干,咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 26.00000000, 26, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-08 14:13:42', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('5a718a72fe0945dda48a8d23cbf5ce0a', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 15:06:49', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('71ac3b8e8d5e4b79a60cb5777b9a71b3', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 10:18:58', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('7fd895de83fa4de7a63f04c90b533bfa', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 8.00000000, 8, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 15:10:02', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('93b67b8122284b2fabd28c2e5d1c9914', '1', '奥利奥小饼干,咪咪虾条,', '小丽', '13131313311', '湖北 宜昌 夷陵区 巴拉巴拉', 18.00000000, 18, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 10:13:56', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('952751f3426f4e47bf26a181a15548b2', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 15:49:27', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('966b276ac926447295e66b077c607f27', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 5.00000000, 5, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 12:03:05', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('a5e54d2af3e347ddaa2efc0e31160ffa', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 16:02:42', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('a8a619e81d5042aaad1975da52ce6ee5', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 8.00000000, 8, 1, '', '4', NULL, NULL, NULL, NULL, '2021-05-07 15:52:41', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('b670af2c2779449cbe16ec5b021fdd25', '6', '奥利奥小饼干666,咪咪小虾条,', '韩梅梅', '13232323322', '湖南 长沙 岳麓区 淅沥淅沥', 9.00000000, 9, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-11 10:37:51', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('c2efcd6725174b7fa27829382fd89e6a', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 12:10:21', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('ca364a09c3b04cf881e0944ede34563b', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 8.00000000, 8, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 12:00:39', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('d1dd179a0d194351b7bfa658f3d86579', '1', '奥利奥小饼干,咪咪虾条,', '小丽', '13131313311', '湖北 宜昌 夷陵区 巴拉巴拉', 13.00000000, 13, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 09:50:49', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('dd4b131a6bcc46b1a7c266423ee04a29', '1', '咪咪虾条,', '小丽', '13131313311', '湖北 宜昌 夷陵区 巴拉巴拉', 5.00000000, 5, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-08 17:07:29', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('e7f3a0d3fccf40a88d05f7b1ca7e1700', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 8.00000000, 8, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 14:42:32', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('e863aeb9da464367bf3b4c5f35d0a31a', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 5.00000000, 5, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 15:02:53', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('ea4e4918a7dc4ec3acfecaa7d5a2ae51', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 10.00000000, 10, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-08 09:12:04', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('f1d426615dc84e4abb37974ae25c1cd9', '1', '奥利奥小饼干,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 32.00000000, 32, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-08 14:10:37', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('f67b950e78ae45ee8bae922e8dab6ddc', '1', '奥利奥小饼干,咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 9.00000000, 9, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-07 09:53:12', NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `orders` VALUES ('f9743ec166de4e8f9bce8a2510b6cf54', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '2', NULL, NULL, NULL, NULL, '2021-05-07 11:47:33', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `orders` VALUES ('fb6e252e26c94935b3ce8a7b7bb82ddd', '1', '咪咪虾条,', '张三', '13030303300', '湖北 武汉 江夏区 光谷大道77号', 1.00000000, 1, 1, '', '6', NULL, NULL, NULL, NULL, '2021-05-08 09:51:34', NULL, NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `product_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品主键id',
  `product_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称 商品名称',
  `category_id` int(11) NOT NULL COMMENT '分类外键id 分类id',
  `root_category_id` int(11) NOT NULL COMMENT '一级分类外键id 一级分类id，用于优化查询',
  `sold_num` int(11) NOT NULL COMMENT '销量 累计销售',
  `product_status` int(11) NOT NULL COMMENT '默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品内容 商品内容',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`product_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '奥利奥小饼干666', 46, 2, 196, 1, '<label style=\"color:red;font-size:18px\">1.全新包装</label><br/><img src=\"static/pimgs/ala_desc1.png\"/><br/><label style=\"color:green;font-size:18px\">2.全新口味</label><br/><img src=\"static/pimgs/ala_desc2.png\"/><label style=\"color:blue;font-size:18px\">3.全新体验</label><br/><img src=\"static/pimgs/ala_desc3.png\"/>', '2021-04-26 15:20:51', '2021-04-23 15:20:58');
INSERT INTO `product` VALUES ('10', '商品10', 10, 1, 127, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('11', '商品11', 10, 1, 128, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('12', '商品12', 46, 2, 122, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('13', '商品13', 46, 2, 123, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('14', '商品14', 46, 2, 124, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('15', '商品15', 46, 2, 125, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('16', '商品16', 46, 2, 126, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('17', '商品17', 46, 2, 127, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('18', '商品18', 46, 2, 128, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('19', '加力加小虾条1', 49, 2, 111, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('2', '旺旺华夫饼', 22, 1, 202, 1, '旺旺华夫饼商品内容', '2021-04-26 15:27:22', '2021-04-25 15:27:25');
INSERT INTO `product` VALUES ('20', '加力加虾条2', 49, 2, 199, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('21', '加力加虾条3', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('22', '加力加虾条4', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('23', '加力加虾条5', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('24', '加力加虾条6', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('25', '加力加虾条7', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('26', '加力加虾条8', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('27', '加力加虾条9', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('28', '加力加虾条10', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('29', '加力加虾条11', 49, 2, 168, 1, '加力加虾条说明', '2021-03-04 09:53:14', '2021-05-10 09:53:20');
INSERT INTO `product` VALUES ('3', '咪咪小虾条', 50, 2, 199, 1, '<img src=\"static/pimgs/mmxt_desc.jpg\"/>', '2021-04-26 15:58:09', '2021-04-25 15:58:11');
INSERT INTO `product` VALUES ('4', '旺旺雪饼', 46, 2, 201, 1, '旺旺雪饼商品内容', '2021-04-25 15:58:59', '2021-04-25 15:59:03');
INSERT INTO `product` VALUES ('5', '商品5', 10, 1, 122, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('6', '商品6', 10, 1, 123, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('7', '商品7', 10, 1, 124, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('8', '商品8', 10, 1, 125, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product` VALUES ('9', '商品9', 10, 1, 126, 1, '商品说明', '2021-04-26 11:11:11', '2021-04-26 11:11:11');

-- ----------------------------
-- Table structure for product_comments
-- ----------------------------
DROP TABLE IF EXISTS `product_comments`;
CREATE TABLE `product_comments`  (
  `comm_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `product_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
  `product_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `order_item_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单项(商品快照)ID 可为空',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论用户id 用户名须脱敏',
  `is_anonymous` int(11) NULL DEFAULT NULL COMMENT '是否匿名（1:是，0:否）',
  `comm_type` int(11) NULL DEFAULT NULL COMMENT '评价类型（1好评，0中评，-1差评）',
  `comm_level` int(11) NOT NULL COMMENT '评价等级 1：好评 2：中评 3：差评',
  `comm_content` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评价内容',
  `comm_imgs` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价晒图(JSON {img1:url1,img2:url2}  )',
  `sepc_name` datetime(0) NULL DEFAULT NULL COMMENT '评价时间 可为空',
  `reply_status` int(11) NULL DEFAULT NULL COMMENT '是否回复（0:未回复，1:已回复）',
  `reply_content` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '回复内容',
  `reply_time` datetime(0) NULL DEFAULT NULL COMMENT '回复时间',
  `is_show` int(11) NULL DEFAULT NULL COMMENT '是否显示（1:是，0:否）',
  PRIMARY KEY (`comm_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品评价 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product_comments
-- ----------------------------
INSERT INTO `product_comments` VALUES ('1', '3', '咪咪虾条', '10000001', '4', 1, 1, 1, '我买这不是来吃的，就是玩儿', '{}', '2021-04-27 14:51:10', 0, NULL, '2021-04-27 14:51:32', 1);
INSERT INTO `product_comments` VALUES ('2', '3', '咪咪虾条', '10000002', '5', 0, 1, 1, 'nice', '{img1:“mmxt2.png”}', '2021-04-27 14:53:20', 1, '你好我也好', '2021-04-27 14:53:37', 1);
INSERT INTO `product_comments` VALUES ('3', '3', '咪咪虾条', '10000003', '1', 1, 1, 1, '评价内容3', '{}', '2021-04-27 09:36:36', 0, NULL, NULL, 1);
INSERT INTO `product_comments` VALUES ('4', '3', '咪咪虾条', '10000004', '2', 1, 1, 1, '评价内容3', '{}', '2021-04-28 09:37:28', 0, NULL, NULL, 1);
INSERT INTO `product_comments` VALUES ('5', '3', '咪咪虾条', '10000005', '2', 1, 0, 1, '评价内容5', '{}', '2021-04-28 09:38:13', 0, NULL, NULL, 1);
INSERT INTO `product_comments` VALUES ('6', '3', '咪咪虾条', '10000006', '3', 1, 0, 1, '评价内容6', '{}', '2021-04-21 09:39:16', 0, NULL, NULL, 1);
INSERT INTO `product_comments` VALUES ('7', '3', '咪咪虾条', '10000007', '4', 0, -1, 1, '评价内容7', '{}', '2021-04-06 09:40:01', 0, NULL, NULL, 1);

-- ----------------------------
-- Table structure for product_img
-- ----------------------------
DROP TABLE IF EXISTS `product_img`;
CREATE TABLE `product_img`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片主键',
  `item_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品外键id 商品外键id',
  `url` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片地址 图片地址',
  `sort` int(11) NOT NULL COMMENT '顺序 图片顺序，从小到大',
  `is_main` int(11) NOT NULL COMMENT '是否主图 是否主图，1：是，0：否',
  `created_time` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_time` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品图片 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product_img
-- ----------------------------
INSERT INTO `product_img` VALUES ('1', '1', 'ala_1.png', 1, 1, '2021-04-22 15:25:08', '2021-04-22 15:25:15');
INSERT INTO `product_img` VALUES ('10', '6', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('11', '7', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('12', '8', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('13', '9', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('14', '10', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('15', '11', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('16', '12', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('17', '13', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('18', '14', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('19', '15', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('2', '1', 'ala_2.png', 2, 0, '2021-04-22 15:25:39', '2021-04-22 15:25:44');
INSERT INTO `product_img` VALUES ('20', '16', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('21', '17', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('22', '18', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');
INSERT INTO `product_img` VALUES ('23', '19', 'jlj_1.png', 1, 1, '2021-05-10 09:54:10', '2021-05-10 09:54:12');
INSERT INTO `product_img` VALUES ('3', '2', 'hfb_1.png', 1, 1, '2021-04-24 15:30:09', '2021-04-25 15:30:19');
INSERT INTO `product_img` VALUES ('4', '2', 'hfb_2.png', 2, 0, '2021-04-25 15:30:45', '2021-04-25 15:30:48');
INSERT INTO `product_img` VALUES ('5', '3', 'mmxt_1.png', 1, 1, '2021-04-25 15:59:28', '2021-04-25 15:59:31');
INSERT INTO `product_img` VALUES ('6', '3', 'mmxt_2.png', 2, 0, '2021-04-25 15:59:51', '2021-04-25 15:59:54');
INSERT INTO `product_img` VALUES ('7', '4', 'wwxb_1.png', 1, 1, '2021-04-25 16:00:12', '2021-04-25 16:00:17');
INSERT INTO `product_img` VALUES ('8', '4', 'wwxb_2.png', 2, 0, '2021-04-25 16:00:36', '2021-04-25 16:00:39');
INSERT INTO `product_img` VALUES ('9', '5', 'wwxb_1.png', 1, 1, '2021-04-26 11:11:11', '2021-04-26 11:11:11');

-- ----------------------------
-- Table structure for product_params
-- ----------------------------
DROP TABLE IF EXISTS `product_params`;
CREATE TABLE `product_params`  (
  `param_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品参数id',
  `product_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
  `product_place` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产地 产地，例：中国江苏',
  `foot_period` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '保质期 保质期，例：180天',
  `brand` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌名 品牌名，例：三只大灰狼',
  `factory_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '生产厂名 生产厂名，例：大灰狼工厂',
  `factory_address` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '生产厂址 生产厂址，例：大灰狼生产基地',
  `packaging_method` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '包装方式 包装方式，例：袋装',
  `weight` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '规格重量 规格重量，例：35g',
  `storage_method` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '存储方法 存储方法，例：常温5~25°',
  `eat_method` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '食用方式 食用方式，例：开袋即食',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`param_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品参数 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product_params
-- ----------------------------
INSERT INTO `product_params` VALUES ('1', '3', '中国湖北武汉', '12个月', '咪咪', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('2', '19', '中国湖北武汉', '12个月', '卫龙', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('3', '20', '中国湖北武汉', '12个月', '威龙', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('4', '21', '中国湖北武汉', '12个月', '卫龙', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('5', '22', '中国湖北武汉', '12个月', '威龙', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('6', '23', '中国湖北武汉', '12个月', '老干妈', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('7', '24', '中国湖北武汉', '12个月', '卫龙', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');
INSERT INTO `product_params` VALUES ('8', '1', '中国湖北武汉', '12个月', '良品铺子', '贤磊咪咪虾条有限责任公司', '湖北武汉江夏区光谷大道77号', '袋装', '50g', '常温保存', '开袋即食', '2021-04-27 11:53:20', '2021-04-27 11:53:35');

-- ----------------------------
-- Table structure for product_sku
-- ----------------------------
DROP TABLE IF EXISTS `product_sku`;
CREATE TABLE `product_sku`  (
  `sku_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sku编号',
  `product_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
  `sku_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sku名称',
  `sku_img` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'sku图片',
  `untitled` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性组合（格式是p1:v1;p2:v2）',
  `original_price` int(11) NOT NULL COMMENT '原价',
  `sell_price` int(11) NOT NULL COMMENT '销售价格',
  `discounts` decimal(4, 2) NOT NULL COMMENT '折扣力度',
  `stock` int(11) NOT NULL COMMENT '库存',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `status` int(11) NULL DEFAULT NULL COMMENT 'sku状态(1启用，0禁用，-1删除)',
  PRIMARY KEY (`sku_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product_sku
-- ----------------------------
INSERT INTO `product_sku` VALUES ('1', '3', '咪咪虾条 单包 50g', 'mmxt_1.png', '{口味:[\"原味\",\"烧烤\",\"芥末\"],包装:[\"盒装\",\"袋装\"]}', 2, 1, 0.70, 316, '2021-04-26 15:58:00', '2021-04-25 15:58:00', 1);
INSERT INTO `product_sku` VALUES ('10', '24', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('11', '25', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('12', '26', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('13', '27', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('14', '28', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('15', '29', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('2', '3', '咪咪虾条 6连包', 'mmxt_1.png', '{口味:[\"原味\",\"烧烤\"],包装:[\"新包装\",\"老包装\"]}', 6, 5, 0.60, 171, '2021-04-26 14:48:21', '2021-04-26 14:48:25', 1);
INSERT INTO `product_sku` VALUES ('3', '3', '咪咪虾条 整箱50包', 'mmxt_1.png', '{口味:[\"原味\",\"烧烤\",\"孜然\"]}', 50, 40, 0.50, 37, '2021-04-26 14:49:20', '2021-04-26 14:49:23', 1);
INSERT INTO `product_sku` VALUES ('4', '1', '奥利奥分享装', 'ala_1.png', '{口味:[\"草莓\",\"巧克力\",\"牛奶\",\"原味\"]}', 10, 8, 0.80, 137, '2021-04-27 11:38:55', '2021-04-27 11:39:00', 1);
INSERT INTO `product_sku` VALUES ('5', '19', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('6', '20', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('7', '21', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('8', '22', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);
INSERT INTO `product_sku` VALUES ('9', '23', '加力加 100g', 'jlj_1.png', '{口味:[\"原味\",\"微辣\",\"BT\"]}', 3, 2, 0.50, 999, '2021-05-10 09:56:09', '2021-05-10 09:56:12', 1);

-- ----------------------------
-- Table structure for shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `shopping_cart`;
CREATE TABLE `shopping_cart`  (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品ID',
  `sku_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'skuID',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `cart_num` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '购物车商品数量',
  `cart_time` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '添加购物车时间',
  `product_price` decimal(32, 8) NULL DEFAULT NULL COMMENT '添加购物车时商品价格',
  `sku_props` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择的套餐的属性',
  PRIMARY KEY (`cart_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shopping_cart
-- ----------------------------
INSERT INTO `shopping_cart` VALUES (5, '3', '1', '6', '1', '2021-05-12 09:18:35', 1.00000000, '口味:原味;包装:盒装;');
INSERT INTO `shopping_cart` VALUES (6, '1', '4', '6', '1', '2021-05-12 09:18:47', 8.00000000, '口味:草莓;');
INSERT INTO `shopping_cart` VALUES (7, '3', '1', '1', '1', '2021-05-12 09:37:15', 1.00000000, '口味:原味;包装:盒装;');

-- ----------------------------
-- Table structure for user_addr
-- ----------------------------
DROP TABLE IF EXISTS `user_addr`;
CREATE TABLE `user_addr`  (
  `addr_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址主键id',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `receiver_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件人姓名',
  `receiver_mobile` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件人手机号',
  `province` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份',
  `city` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '城市',
  `area` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区县',
  `addr` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '详细地址',
  `post_code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮编',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态,1正常，0无效',
  `common_addr` int(11) NULL DEFAULT NULL COMMENT '是否默认地址 1是 1:是  0:否',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`addr_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户地址 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_addr
-- ----------------------------
INSERT INTO `user_addr` VALUES ('1', '1', '张三', '13030303300', '湖北', '武汉', '江夏区', '光谷大道77号', '421000', 1, 1, '2021-04-30 09:33:30', '2021-04-28 09:33:37');
INSERT INTO `user_addr` VALUES ('2', '1', '小丽', '13131313311', '湖北', '宜昌', '夷陵区', '巴拉巴拉', '410000', 1, 0, '2021-04-30 09:34:41', '2021-04-30 09:34:44');
INSERT INTO `user_addr` VALUES ('3', '6', '韩梅梅', '13232323322', '湖南', '长沙', '岳麓区', '淅沥淅沥', '430000', 1, 1, '2021-04-30 09:35:49', '2021-04-30 09:35:53');

-- ----------------------------
-- Table structure for user_login_history
-- ----------------------------
DROP TABLE IF EXISTS `user_login_history`;
CREATE TABLE `user_login_history`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `AREA` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地区',
  `COUNTRY` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家',
  `USER_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `IP` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'IP',
  `LOGIN_TIME` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '时间',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '登录历史表 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int(64) NOT NULL AUTO_INCREMENT COMMENT '主键id 用户id',
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名 用户名',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码 密码',
  `nickname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称 昵称',
  `realname` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名 真实姓名',
  `user_img` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '头像 头像',
  `user_mobile` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号 手机号',
  `user_email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱地址 邮箱地址',
  `user_sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别 M(男) or F(女)',
  `user_birth` date NULL DEFAULT NULL COMMENT '生日 生日',
  `user_regtime` datetime(0) NOT NULL COMMENT '注册时间 创建时间',
  `user_modtime` datetime(0) NOT NULL COMMENT '更新时间 更新时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'zhangsan', 'f379eaf3c831b04de153469d1bec345e', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-15 16:10:53', '2021-04-15 16:10:53');
INSERT INTO `users` VALUES (2, 'aaaa', '1111', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-16 11:10:01', '2021-04-16 11:10:01');
INSERT INTO `users` VALUES (3, 'wahaha', '4297f44b13955235245b2497399d7a93', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-16 15:36:52', '2021-04-16 15:36:52');
INSERT INTO `users` VALUES (4, 'heihei', '4297f44b13955235245b2497399d7a93', '二狗', NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-16 15:38:49', '2021-04-16 15:38:49');
INSERT INTO `users` VALUES (5, 'Tony', '4297f44b13955235245b2497399d7a93', '托尼', NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:25:04', '2021-04-23 10:25:04');
INSERT INTO `users` VALUES (6, 'hanmeimei', 'f379eaf3c831b04de153469d1bec345e', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:30:52', '2021-04-23 10:30:52');
INSERT INTO `users` VALUES (7, 'lilei123', '4297f44b13955235245b2497399d7a93', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:33:03', '2021-04-23 10:33:03');
INSERT INTO `users` VALUES (8, 'tom123123', '4297f44b13955235245b2497399d7a93', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:34:49', '2021-04-23 10:34:49');

SET FOREIGN_KEY_CHECKS = 1;
