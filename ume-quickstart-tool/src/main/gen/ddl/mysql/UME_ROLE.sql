
/* UME_ROLE : UME角色定义表 */
DROP TABLE IF EXISTS `UME_ROLE` ;
CREATE TABLE `UME_ROLE` (
    `ROLE_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '角色ID'
    ,`ROLE_NAME` VARCHAR(64) BINARY 	 COMMENT '角色名称'
    ,`ROLE_DESC` VARCHAR(128) BINARY 	 COMMENT '角色描述'
    ,`CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者'
    ,`CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
    ,`UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者'
    ,`UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME角色定义表' ;
ALTER TABLE `UME_ROLE` ADD CONSTRAINT `PK_UME_ROLE` PRIMARY KEY ( ROLE_ID ) ;

