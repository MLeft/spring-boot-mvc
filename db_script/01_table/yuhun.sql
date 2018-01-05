/*
Navicat MySQL Data Transfer

Source Server         : local-mysql
Source Server Version : 100206
Source Host           : localhost:3306
Source Database       : boot-mvc

Target Server Type    : MYSQL
Target Server Version : 100206
File Encoding         : 65001

Date: 2018-01-05 16:25:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yuhun
-- ----------------------------
DROP TABLE IF EXISTS `yuhun`;
CREATE TABLE `yuhun` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `position` int(11) NOT NULL COMMENT '几号位',
  `type` varchar(255) NOT NULL COMMENT '御魂类型',
  `buffAttack` varchar(255) DEFAULT NULL COMMENT '攻击',
  `buffAttackAddition` varchar(255) DEFAULT NULL COMMENT '攻击加成',
  `buffCritRate` varchar(255) DEFAULT NULL COMMENT '暴击率',
  `buffCriticalDamage` varchar(255) DEFAULT NULL COMMENT '暴击伤害',
  `planId` int(11) DEFAULT NULL COMMENT '组合ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
