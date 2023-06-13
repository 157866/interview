/*
Navicat MySQL Data Transfer

Source Server         : MySQL 5.7
Source Server Version : 50741
Source Host           : localhost:13306
Source Database       : interview

Target Server Type    : MYSQL
Target Server Version : 50741
File Encoding         : 65001

Date: 2023-06-13 21:38:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mydiary
-- ----------------------------
DROP TABLE IF EXISTS `mydiary`;
CREATE TABLE `mydiary` (
  `did` varchar(50) NOT NULL COMMENT 'MyDiary的id',
  `uid` varchar(50) NOT NULL COMMENT '用户id',
  `ddate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '写日记保存时间',
  `dtitle` varchar(50) NOT NULL COMMENT '日记标题',
  `diary` text COMMENT '日记',
  `dstate` int(11) NOT NULL DEFAULT '1' COMMENT '1 是正常 0是删除',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mydiary
-- ----------------------------
INSERT INTO `mydiary` VALUES ('04976468a63f48a6ac421545b27a07ae', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:15:08', '测试', '1111', '1');
INSERT INTO `mydiary` VALUES ('0552f760f005418998c383998549479b', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:15:05', '不想写前端', '前端真的多', '1');
INSERT INTO `mydiary` VALUES ('276a16718cb14cec8e1f68d374a17260', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 22:01:53', '测试22222222222222', ' System.out.println(\"did为空\" + myDiary);', '1');
INSERT INTO `mydiary` VALUES ('43e8344ac0184f14a1a4a982b341e1fa', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:46:33', '测试3', '测试3', '1');
INSERT INTO `mydiary` VALUES ('6401caefbf684855be286da37bf4eed8', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:45:04', '测试2', '测试2', '0');
INSERT INTO `mydiary` VALUES ('8365d917f7b241d7af1bea75a9451957', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:11:42', '前端怎么把数据放进cookie呢', '<script>\n    let data = new Date().getTime()   //先将此时的时间转化为毫秒\n    let new_data = new Date(data + 7*24*60*60*1000)  //将过期时间设置为7天后\n    //设置第一条 cookie\n    document.cookie = \'name=张三;\' + \'expires=\' + new_data.toUTCString()\n    //设置第二条 cookie\n    document.cookie = \'age=19;\' + \'expires=\' + new_data.toUTCString()\n</script>\n', '1');
INSERT INTO `mydiary` VALUES ('a0ec803a70354f82be4ff5d9ccf5d29d', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:15:12', '不想写前端', '前端真的多', '1');
INSERT INTO `mydiary` VALUES ('a6cacd7777ae452380af0bd29069173b', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:43:22', ' System.out.println(\"did为空\" + myDiary);', ' System.out.println(\"did为空\" + myDiary);', '1');
INSERT INTO `mydiary` VALUES ('c58ae28ae82c4539b9881c8f3f6b18fd', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 18:15:14', '不想写前端', '前端真的多', '1');
INSERT INTO `mydiary` VALUES ('dfc828eb0de9497ea840cab3431896fb', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-13 11:40:19', '测试11111111111111', '1111', '0');
INSERT INTO `mydiary` VALUES ('e2a296373a9d4842aa73e669eb8b804e', 'd41cf794ba6d433284b2ca15850858b8', '2023-06-12 21:54:04', '前端怎么把数据放进cookie呢？', '<script>\n    let data = new Date().getTime()   //先将此时的时间转化为毫秒\n    let new_data = new Date(data + 7*24*60*60*1000)  //将过期时间设置为7天后\n    //设置第一条 cookie\n    document.cookie = \'name=张三;\' + \'expires=\' + new_data.toUTCString()\n    //设置第二条 cookie\n    document.cookie = \'age=19;\' + \'expires=\' + new_data.toUTCString()\n</script>\n', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(255) NOT NULL COMMENT '用户id',
  `uname` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名称',
  `account_number` varchar(11) NOT NULL COMMENT '用户账号',
  `upassword` varchar(20) DEFAULT '123456' COMMENT '用户密码',
  `ustate` int(11) DEFAULT '1' COMMENT '1正常 0删除',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '123456', '1');
INSERT INTO `user` VALUES ('11123123', 'wmt', '111', '1111', '1');
INSERT INTO `user` VALUES ('aba5d94d4665c1b6e851a9fab26af79c', 'wmt', '111', '1111', '1');
INSERT INTO `user` VALUES ('d41cf794ba6d433284b2ca15850858b8', '王孟涛', '123456', '123456', '1');
INSERT INTO `user` VALUES ('e120ea280aa50693d5568d0071456460', 'f1290186a5d0b1ceab27f4e77c0c5d68', '1', '1111', '1');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `info_id` varchar(255) NOT NULL COMMENT 'userinfo表id',
  `uid` varchar(255) NOT NULL COMMENT 'user表的uid',
  `info_type` varchar(20) DEFAULT NULL COMMENT '消息类型',
  `info_message` varchar(255) DEFAULT NULL COMMENT '保存消息',
  `istate` int(255) NOT NULL DEFAULT '1' COMMENT '1正常 0删除',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('14a86e9b6f8445a39759f7bc8841a7e0', 'd41cf794ba6d433284b2ca15850858b8', '农业银行密码', '123456', '1');
INSERT INTO `userinfo` VALUES ('18f4d9b920f142449cb57685eaf40841', 'd41cf794ba6d433284b2ca15850858b8', 'orgies', '123456', '1');
INSERT INTO `userinfo` VALUES ('42414f8d20e8447b91acdf136e74572a', 'd41cf794ba6d433284b2ca15850858b8', 'epic', '12321312321', '1');
INSERT INTO `userinfo` VALUES ('4cd4f32a8e454c53932050c943a69c8e', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', 'wmt1232131232', '1');
INSERT INTO `userinfo` VALUES ('68590428b483471ba29f1e0fe60c802a', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', '12321qwe', '1');
INSERT INTO `userinfo` VALUES ('6d5f721a6b6b4bf58e152b020b5b7976', 'eeef7486e2ff4f45af810914177af87f', 'QQ密码', 'wmt2849569455', '1');
INSERT INTO `userinfo` VALUES ('7dda48d08f3444dbba0c6d3cd1e9755a', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', 'wmt2849569455', '1');
INSERT INTO `userinfo` VALUES ('82a976b4ec004eb68cb08fb33058f576', 'd41cf794ba6d433284b2ca15850858b8', 'epic密码', '111111111111111111111', '1');
INSERT INTO `userinfo` VALUES ('844e754c2092409e97557a876b9663f4', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', '12321d', '1');
INSERT INTO `userinfo` VALUES ('953531cdd23440f7820a7a7c059b37db', 'd41cf794ba6d433284b2ca15850858b8', '工商银行密码', '123456', '1');
INSERT INTO `userinfo` VALUES ('99097548b70f48b29a80042e144b82fe', 'd41cf794ba6d433284b2ca15850858b8', '学习通密码', '1234123', '1');
INSERT INTO `userinfo` VALUES ('c79cb67be63a486a808c9e432858e177', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', '12321qwe', '1');
INSERT INTO `userinfo` VALUES ('cf7faf275409463c8603683ec787d167', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', 'wmt1232131232', '1');
INSERT INTO `userinfo` VALUES ('d9c102ceefc34dd3bad898a3f78ec1f3', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', 'wmt2849569455', '1');
INSERT INTO `userinfo` VALUES ('ef244fc5bb9e425e89a9f97027ab7d57', 'd41cf794ba6d433284b2ca15850858b8', '测试', '123321', '1');
INSERT INTO `userinfo` VALUES ('f34a78e448ea4b398ecf8e2079df62f3', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', 'wmt1232131232', '1');
INSERT INTO `userinfo` VALUES ('fce65b98cca14e86b4b0e6e7e676a0e1', 'd41cf794ba6d433284b2ca15850858b8', '微信密码', 'wmt2849569455', '1');
