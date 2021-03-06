-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
                        `id` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键id',
                        `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '姓名',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='测试';

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', 'test');
INSERT INTO `test` VALUES ('2', 'test2');

-- 大章
drop table if exists `chapter`;
create table `chapter` (
                           `id` char(8) not null comment 'id',
                           `course_id` char(8) comment '课程id',
                           `name` varchar(50) comment '名称',
                           primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='大章';

insert into `chapter` (id, course_id, name) values ('00000001', '00000000', '测试大章01');
insert into `chapter` (id, course_id, name) values ('00000002', '00000000', '测试大章02');
insert into `chapter` (id, course_id, name) values ('00000003', '00000000', '测试大章03');
insert into `chapter` (id, course_id, name) values ('00000004', '00000000', '测试大章04');
insert into `chapter` (id, course_id, name) values ('00000005', '00000000', '测试大章05');
insert into `chapter` (id, course_id, name) values ('00000006', '00000000', '测试大章06');
insert into `chapter` (id, course_id, name) values ('00000007', '00000000', '测试大章07');
insert into `chapter` (id, course_id, name) values ('00000008', '00000000', '测试大章08');
insert into `chapter` (id, course_id, name) values ('00000009', '00000000', '测试大章09');
insert into `chapter` (id, course_id, name) values ('00000010', '00000000', '测试大章10');
insert into `chapter` (id, course_id, name) values ('00000011', '00000000', '测试大章11');
insert into `chapter` (id, course_id, name) values ('00000012', '00000000', '测试大章12');
insert into `chapter` (id, course_id, name) values ('00000013', '00000000', '测试大章13');
insert into `chapter` (id, course_id, name) values ('00000014', '00000000', '测试大章14');

-- 小节
drop table if exists `section`;
create table `section` (
                           `id` char(8) not null default '' comment 'id',
                           `title` varchar(50) not null comment '标题',
                           `course_id` char(8) comment '课程|course.id',
                           `chapter_id` char(8) comment '大章|chapter.id',
                           `video` varchar(200) comment '视频',
                           `time` int comment '时长|单位秒',
                           `charge` char(1) comment '收费|C 收费；F 免费',
                           `sort` int comment '顺序',
                           `created_at` datetime(3) comment '创建时间',
                           `updated_at` datetime(3) comment '修改时间',
                           primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='小节';

insert into `section` (id, title, course_id, chapter_id, video, time, charge, sort, created_at, updated_at)
values ('00000001', '测试小节01', '00000001', '00000000', '', 500, 'f', 1, now(), now());