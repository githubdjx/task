/*
MySQL Data Transfer
Source Host: localhost
Source Database: ko_games
Target Host: localhost
Target Database: ko_games
Date: 2016/10/6 10:05:28
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for campaign
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `name` varchar(256) NOT NULL COMMENT '任务名称',
  `image` varchar(256) default NULL COMMENT '任务图片',
  `remark` varchar(4096) default NULL COMMENT '任务说明',
  `category` bigint(20) NOT NULL COMMENT '任务分类',
  `status` int(11) NOT NULL COMMENT '任务状态',
  `regist_max` int(11) default NULL COMMENT '最大参加人数',
  `regist_is_charge` decimal(10,0) default NULL COMMENT '报名是否收费',
  `regist_fee` decimal(10,0) default NULL COMMENT '报名费用',
  `regist_end_time` datetime default NULL COMMENT '报名截至时间',
  `is_can_cancel` int(11) default NULL COMMENT '是否允许取消',
  `can_cancel_time` datetime default NULL COMMENT '消取截至时间',
  `is_pay` int(11) default NULL COMMENT '是否支付',
  `pay_time` datetime default NULL COMMENT '支付时间',
  `is_online` int(11) default NULL COMMENT '否是线上活动',
  `is_live` int(11) default NULL COMMENT '是否直播',
  `live_url` varchar(256) default NULL COMMENT '直播地址',
  `create_time` datetime default NULL COMMENT '建创时间',
  `update_time` datetime default NULL COMMENT '新更时间',
  `create_by` varchar(32) default NULL COMMENT '创建人(qqid)',
  `update_by` varchar(32) default NULL COMMENT '更新人(qqid)',
  `is_delete` int(11) NOT NULL default '0' COMMENT '是否删除0未删除，1已删除',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动表';

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id',
  `name` varchar(100) default NULL COMMENT '类别名称',
  `code` varchar(200) default NULL COMMENT '类别代码',
  `parent_id` bigint(20) default NULL COMMENT '父类别',
  `create_time` datetime default NULL COMMENT '发布时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动类别表';

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `qq_id` varchar(32) default '' COMMENT 'qq登录ID',
  `nick_name` varchar(32) default '' COMMENT '称昵',
  `mobile` varchar(12) default '' COMMENT '手机',
  `email` varchar(320) default '' COMMENT '邮箱',
  `qq` varchar(320) default '' COMMENT 'qq',
  `wechat` varchar(320) default '' COMMENT '微信',
  `last_login_time` datetime default NULL COMMENT '最后一次登录时间',
  `last_update_time` datetime default NULL COMMENT '最后次一更新时间',
  `register_time` timestamp NULL default CURRENT_TIMESTAMP COMMENT '注册时间',
  `alipay_account` varchar(255) default NULL COMMENT '支付宝账号',
  `wechat_account` varchar(255) default NULL COMMENT '微信账号',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `index_member_qqid_unique` (`qq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成员表';

-- ----------------------------
-- Table structure for member_pay_record
-- ----------------------------
DROP TABLE IF EXISTS `member_pay_record`;
CREATE TABLE `member_pay_record` (
  `id` int(11) NOT NULL,
  `t_id` int(11) default NULL COMMENT '任务ID',
  `record_date` datetime default NULL COMMENT '记录时间',
  `payer_qq_id` int(11) default NULL COMMENT '付款人ID',
  `payer_account` varchar(255) default NULL COMMENT '付款账号',
  `payee_qq_id` int(11) default NULL COMMENT '收款人ID',
  `payee_account` varchar(255) default NULL COMMENT '收款账号',
  `pay_status` varchar(255) default NULL COMMENT '支付状态',
  `pay_type` varchar(255) default NULL COMMENT '支付类型（付款 或 退款）',
  `pay_mode` varchar(255) default NULL COMMENT '付款方式（微信 或 支付宝）',
  `pay_money` int(11) default NULL COMMENT '支付金额（付款金额）',
  `apply_pay_time` datetime default NULL COMMENT '申请支付时间',
  `finish_pay_time` datetime default NULL COMMENT '完成支付时间',
  `pay_serial_no` varchar(255) default NULL COMMENT '支付流水号',
  `remark` varchar(255) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成员支付记录表';

-- ----------------------------
-- Table structure for play_room
-- ----------------------------
DROP TABLE IF EXISTS `play_room`;
CREATE TABLE `play_room` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `t_id` bigint(20) default NULL COMMENT '任务ID',
  `p_index` int(11) default NULL COMMENT '场次序号',
  `p_count` int(11) default NULL COMMENT '玩家数量',
  `create_time` datetime default NULL COMMENT '创建时间',
  `update_time` datetime default NULL COMMENT '更新时间',
  `create_by` varchar(32) default NULL COMMENT '创建人',
  `update_by` varchar(32) default NULL COMMENT '更新人',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='场次表';

-- ----------------------------
-- Table structure for players
-- ----------------------------
DROP TABLE IF EXISTS `players`;
CREATE TABLE `players` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `t_id` bigint(20) default NULL COMMENT '任务ID',
  `pr_id` bigint(20) default NULL COMMENT '场次ID',
  `play_nick` varchar(128) default NULL COMMENT '游戏昵称',
  `qq_id` varchar(32) default NULL COMMENT '参赛人（登录qqId）',
  `seat_index` int(11) default NULL COMMENT '座位号',
  `is_win` int(11) default NULL COMMENT '是否胜利',
  `create_time` datetime default NULL COMMENT '创建时间',
  `update_time` datetime default NULL COMMENT '更新时间',
  `update_by` varchar(32) default NULL COMMENT '更新人',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参赛人员表';

-- ----------------------------
-- Table structure for registration
-- ----------------------------
DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `t_id` bigint(20) NOT NULL COMMENT '任务ID',
  `qq_id` varchar(32) NOT NULL COMMENT '报名人',
  `status` int(11) NOT NULL COMMENT '状态',
  `regist_fee` decimal(10,0) default NULL COMMENT '报名费用',
  `is_need_pay` int(11) default NULL COMMENT '否是需要支付',
  `is_pay` int(11) default NULL COMMENT '是否已付款',
  `pay_time` datetime default NULL COMMENT '支付完成时间',
  `regist_time` datetime default NULL COMMENT '报名时间',
  `cancel_time` datetime default NULL COMMENT '取消报名时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报名表';

-- ----------------------------
-- Table structure for sysitemvalue
-- ----------------------------
DROP TABLE IF EXISTS `sysitemvalue`;
CREATE TABLE `sysitemvalue` (
  `id` bigint(20) NOT NULL auto_increment,
  `item_key` varchar(255) default NULL,
  `item_key_des` varchar(255) default NULL,
  `item_name` varchar(255) default NULL,
  `item_value` varchar(255) default NULL,
  `order_num` int(11) default NULL COMMENT '显示排序',
  `type` varchar(255) default '1' COMMENT '类型；1公用、2私人',
  `remark` varchar(255) default NULL COMMENT '备注',
  `enable` varchar(255) default '1' COMMENT '是否生效；默认生效',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `task` VALUES ('1', '三国杀Online冬季赛-海选', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('2', '三国杀Online冬季赛-海选2', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('3', '三国杀Online冬季赛-海选3', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('4', '三国杀Online冬季赛-海选4', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('5', '三国杀Online冬季赛-海选5', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('6', '三国杀Online冬季赛-海选6', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('7', '三国杀Online冬季赛-海选7', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('8', '三国杀Online冬季赛-海选8', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('9', '三国杀Online冬季赛-海选9', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('10', '三国杀Online冬季赛-海选10', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('11', '三国杀Online冬季赛-海选11', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('12', '三国杀Online冬季赛-海选12', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('13', '三国杀Online冬季赛-海选13', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('14', '三国杀Online冬季赛-海选14', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('15', '三国杀Online冬季赛-海选15', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('16', '三国杀Online冬季赛-海选16', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('17', '三国杀Online冬季赛-海选17', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('18', '三国杀Online冬季赛-海选18', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('19', '三国杀Online冬季赛-海选19', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('20', '三国杀Online冬季赛-海选20', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('21', '三国杀Online冬季赛-海选21', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('22', '三国杀Online冬季赛-海选22', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('23', '三国杀Online冬季赛-海选23', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('24', '三国杀Online冬季赛-海选24', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');
INSERT INTO `task` VALUES ('25', '三国杀Online冬季赛-海选25', null, '12', '1', '1', '9999999', '1', '5', '2016-11-01 11:00:47', '1', '2016-11-01 11:01:29', '0', null, '1', '1', 'https://www.zhanqi.tv/11496606', '2016-10-05 11:07:17', '2016-10-05 11:07:21', '123123', '123123', '0');

INSERT INTO `member` VALUES ('1', '123123', '简三', '13683564125', 'redmatch@qq.com', '296749970', '296749970', '2016-10-02 10:34:29', '2016-10-02 10:34:34', '2016-10-02 11:36:33', null, null);
INSERT INTO `sysitemvalue` VALUES ('1', 'PAYSTATUS', '支付状态', '成功', '0', '1', '1', null, '1');
INSERT INTO `sysitemvalue` VALUES ('2', 'PAYSTATUS', '支付状态', '取消', '-1', '2', '1', null, '1');
INSERT INTO `sysitemvalue` VALUES ('3', 'PAYSTATUS', '支付状态', '失败', '-2', '3', '1', null, '1');
INSERT INTO `sysitemvalue` VALUES ('4', 'PAYTYPE', '支付类型', '付款', 'fk', '1', '1', null, '1');
INSERT INTO `sysitemvalue` VALUES ('5', 'PAYTYPE', '支付类型', '退款', 'tk', '2', '1', '', '1');
INSERT INTO `sysitemvalue` VALUES ('6', 'PAYMODE', '支付方式', '微信', 'wechat', '1', '1', null, '1');
INSERT INTO `sysitemvalue` VALUES ('7', 'PAYMODE', '支付方式', '支付宝', 'aipay', '2', '1', null, '1');
