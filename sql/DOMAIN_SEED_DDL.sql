CREATE TABLE IF NOT EXISTS `DOMAIN_SEED`
(
    `ID`             bigint                                  NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `DOMAIN_NAME`    varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '域名',
    `DOMAIN_DESC`    varchar(255) COLLATE utf8mb4_general_ci          DEFAULT NULL COMMENT '描述',
    `DOMAIN_TYPE`    int(10)                                     NOT NULL COMMENT '域名类型',
    `DOMAIN_STATUS`  int(10)                                     NOT NULL COMMENT '域名状态',
    `PROCESS_STATUS` int(10)                                     NOT NULL COMMENT '处理状态',
    `CREATED_AT`     timestamp                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATED_AT`     timestamp                               NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='域名节点表';

