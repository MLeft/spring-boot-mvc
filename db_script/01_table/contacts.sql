/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : boot-mvc

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-03-07 23:59:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contacts
-- ----------------------------
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `card_name` varchar(255) DEFAULT NULL COMMENT '名片显示名',
  `email` varchar(255) DEFAULT NULL COMMENT '支持逗号分隔',
  `mobile` varchar(18) DEFAULT NULL COMMENT '支持逗号分隔',
  `wechat` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `weibo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户联系方式表';

-- ----------------------------
-- Records of contacts
-- ----------------------------
