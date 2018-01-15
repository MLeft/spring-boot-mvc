/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 100119
Source Host           : localhost:3306
Source Database       : yys-yuhun

Target Server Type    : MYSQL
Target Server Version : 100119
File Encoding         : 65001

Date: 2018-01-15 23:50:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yuhun_type
-- ----------------------------
DROP TABLE IF EXISTS `yuhun_type`;
CREATE TABLE `yuhun_type` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '御魂名称',
  `buff2` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '二属性',
  `buff4` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '待补充' COMMENT '四属性',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of yuhun_type
-- ----------------------------
INSERT INTO `yuhun_type` VALUES ('1', '蝠翼', '2|15', '造成伤害的20%转化为自身生命');
INSERT INTO `yuhun_type` VALUES ('10', '破势', '3|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('11', '针女', '3|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('12', '伤魂鸟', '3|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('13', '木魅', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('14', '镇墓兽', '3|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('15', '雪幽魂', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('16', '日女巳时', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('17', '反枕', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('18', '薙魂', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('19', '钟灵', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('2', '阴摩罗', '2|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('20', '返魂香', '11|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('21', '魅妖', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('22', '魍魉之匣', '11|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('23', '招财猫', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('24', '火灵', '10|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('25', '骰子鬼', '11|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('26', '树妖', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('27', '蚌精', '10|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('28', '地藏像', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('29', '涅槃之火', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('3', '轮入道', '2|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('30', '被服', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('31', '镜姬', '8|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('32', '珍珠', '6|30', '待补充');
INSERT INTO `yuhun_type` VALUES ('4', '狰', '2|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('5', '心眼', '2|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('6', '鸣屋', '2|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('7', '天邪', '2|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('8', '网切', '3|15', '待补充');
INSERT INTO `yuhun_type` VALUES ('9', '三味', '3|15', '待补充');
