package org.umeframework.quickstart.sample.service;

import java.util.List;

import org.umeframework.quickstart.sample.entity.AlbumDto;
import org.umeframework.quickstart.sample.service.dto.AlbumManageDto;

/**
 * 唱片信息管理服务组件 <br>
 * <br>
 *
 * @author DORA.Generator
 */
public interface AlbumManageService {

	/**
	 * 根据唱片编号查询唱片信息 <br>
	 * <br>
	 *
	 * @param id
	 *            - 唱片编号
	 * @return AlbumManageDto 唱片总括信息描述对象
	 */
	AlbumManageDto queryAlbum(Long id);

	/**
	 * 根据复合结构'AlbumDto'查询唱片列表 <br>
	 * <br>
	 *
	 * @param artist
	 *            - 艺术家
	 * @return List<AlbumManageDto> 唱片总括信息描述列表
	 */
	List<AlbumManageDto> queryAlbumList(AlbumDto queryParam);

	/**
	 * 根据艺术家和唱片标题查询唱片列表 <br>
	 * <br>
	 *
	 * @param artist
	 *            - 艺术家
	 * @param title
	 *            - 唱片标题
	 * @return List<AlbumManageDto> 唱片总括信息描述列表
	 */

	List<AlbumManageDto> queryAlbumListByArtistTitle(String artist, String title);

	/**
	 * 根据艺术家和复合结构'AlbumDto'查询唱片列表 <br>
	 * <br>
	 *
	 * @param artist
	 *            - 艺术家
	 * @param album
	 *            - 唱片查询条件
	 * @return List<AlbumManageDto> 唱片总括信息描述列表
	 */
	List<AlbumManageDto> queryAlbumListByArtistAlbum(String artist, AlbumDto album);

	/**
	 * 更新唱片基础信息及详细信息 <br>
	 * <br>
	 *
	 * @param albumManage
	 *            - 唱片总括信息描述对象
	 */
	void updateAlbum(AlbumManageDto albumManage);

}