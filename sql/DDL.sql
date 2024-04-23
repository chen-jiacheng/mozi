-- Create DOMAIN_SEED
CREATE TABLE IF NOT EXISTS `domain_seed`
(
    `id`             bigint(20)                              NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `domain_name`    varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '域名',
    `domain_desc`    varchar(255) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '描述',
    `domain_type`    int(10)                                 NOT NULL DEFAULT 0 COMMENT '域名类型:1.种子类型 2.普通类型',
    `domain_status`  int(10)                                 NOT NULL DEFAULT 0 COMMENT '域名状态:0.正常 1.网络不可达',
    `process_status` int(10)                                 NOT NULL DEFAULT 0 COMMENT '处理状态:0.初始化 1.受理 2.处理中 3.处理成功 4.处理失败',
    `created_at`     timestamp                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`     timestamp                               NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='域名种子表';

-- Create DOMAIN_NODE
CREATE TABLE IF NOT EXISTS `domain_node`
(
    `id`             bigint(20)                              NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `domain_name`    varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '域名',
    `domain_desc`    varchar(255) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '描述',
    `domain_type`    int(10)                                 NOT NULL DEFAULT 0 COMMENT '域名类型:0.种子类型 1.普通类型',
    `domain_status`  int(10)                                 NOT NULL DEFAULT 0 COMMENT '域名状态:0.正常 1.网络不可达',
    `process_status` int(10)                                 NOT NULL DEFAULT 0 COMMENT '处理状态:0.初始化 1.受理 2.处理中 3.处理成功 4.处理失败',
    `created_at`     timestamp                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`     timestamp                               NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='域名节点表';

-- Create domain_relation
CREATE TABLE `domain_relation`
(
    `id`            bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `sid`           bigint(20) NOT NULL COMMENT '源节点ID',
    `tid`           bigint(20) NOT NULL COMMENT '目标节点ID',
    `relation_type` int(10)    NOT NULL COMMENT '关系类型: 0.内链 1.外链',
    `created_at`    timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`    timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `UK_SID_TID` (`sid`, `tid`) USING BTREE COMMENT '节点关系唯一索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='域名节点关系表';
