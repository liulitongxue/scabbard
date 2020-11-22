/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : scabbard

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 16/09/2020 01:38:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_my_batis
-- ----------------------------
DROP TABLE IF EXISTS `test_my_batis`;
CREATE TABLE `test_my_batis`  (
  `id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `is_del` tinyint(1) UNSIGNED NOT NULL COMMENT '思否逻辑删除',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '测试MyBatis表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_my_batis_generator
-- ----------------------------
DROP TABLE IF EXISTS `test_my_batis_generator`;
CREATE TABLE `test_my_batis_generator`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `is_del` tinyint(1) UNSIGNED NULL DEFAULT NULL COMMENT '是否逻辑删除',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '测试MyBatisGenerator表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_my_batis_plus
-- ----------------------------
DROP TABLE IF EXISTS `test_my_batis_plus`;
CREATE TABLE `test_my_batis_plus`  (
  `id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `is_del` tinyint(1) UNSIGNED NOT NULL COMMENT '思否逻辑删除',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '测试MyBatisPlus表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
