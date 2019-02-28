
/* ALBUM_TRACK : 唱片曲目信息表 */
DROP TABLE IF EXISTS `ALBUM_TRACK` ;
CREATE TABLE `ALBUM_TRACK` (
    `ALBUM_ID` INT NOT NULL	 COMMENT '所属唱片'
    ,`TRACK_NO` INT NOT NULL	 COMMENT '曲目编号'
    ,`TRACK_NAME` VARCHAR(128) BINARY NOT NULL	 COMMENT '曲目名称'
    ,`PLAY_TIME` DECIMAL(4,2) 	 COMMENT '播放时间'
    ,`CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者'
    ,`CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
    ,`UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者'
    ,`UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '唱片曲目信息表' ;
ALTER TABLE `ALBUM_TRACK` ADD CONSTRAINT `PK_ALBUM_TRACK` PRIMARY KEY ( ALBUM_ID ,TRACK_NO ) ;

