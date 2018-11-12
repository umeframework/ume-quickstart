package org.umeframework.quickstart.sample.service;

import java.util.Map;

import org.umeframework.quickstart.sample.service.dto.AlbumManageDto;

/**
 * 唱片信息管理服务组件 <br>
 * <br>
 *
 * @author DORA.Generator
 */
public interface CloudAlbumManageService {

    /**
     * 模拟HTTP调用云服务ws003，返回AlbumManageDto对象列表<br>
     * 
     * @param queryParam
     * @return
     */
    AlbumManageDto[] queryAlbumList(Map<String,String> queryParam);

}