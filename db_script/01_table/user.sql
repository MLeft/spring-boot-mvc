/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : boot-mvc

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-03-07 23:59:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_no` varchar(30) DEFAULT NULL COMMENT '用户号，全局唯一，只允许字母和数字',
  `login_name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_name` varchar(100) NOT NULL COMMENT '用于显示的用户名',
  `birthday` timestamp NOT NULL DEFAULT '2016-04-11 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `is_lunar` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否农历生日',
  `avatar` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `bound_mobile` varchar(18) DEFAULT NULL,
  `bound_email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
