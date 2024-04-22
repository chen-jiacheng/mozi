CREATE TABLE `DOMAIN_RELATION`
(
    `ID`            bigint(20)    NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `SID`           bigint(20)    NOT NULL COMMENT '源节点ID',
    `TID`           bigint(20)    NOT NULL COMMENT '目标节点ID',
    `RELATION_TYPE` int(10)       NOT NULL COMMENT '关系类型',
    `CREATED_AT`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATED_AT`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`ID`),
    UNIQUE KEY `UNIQUE_NODE` (`SID`, `TID`) USING BTREE COMMENT '节点关系唯一索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='域名节点关系表';