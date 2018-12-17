package org.umeframework.quickstart.uac.user.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.stereotype.Service;
import org.umeframework.dora.exception.ApplicationException;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.quickstart.sample.entity.AlbumContributorDto;
import org.umeframework.quickstart.sample.entity.AlbumDto;
import org.umeframework.quickstart.sample.entity.AlbumTrackDto;
import org.umeframework.quickstart.sample.entity.crud.AlbumContributorCrudService;
import org.umeframework.quickstart.sample.entity.crud.AlbumCrudService;
import org.umeframework.quickstart.sample.entity.crud.AlbumTrackCrudService;
import org.umeframework.quickstart.sample.message.MessageConst;
import org.umeframework.quickstart.sample.service.AlbumManageService;
import org.umeframework.quickstart.sample.service.dto.AlbumManageDto;

/**
 * 唱片信息管理服务组件的业务实现。<br>
 * 该组件继承自UME框架的"BaseDBComponent"组件并实现业务接口"AlbumService"中定义的全部功能。<br>
 * 
 * @author ume-team
 */
@Service
public class AlbumManageServiceImpl extends BaseDBComponent implements AlbumManageService, MessageConst {
	/**
	 * 唱片基本信息实体组件。<br>
	 */
	@Resource
	private AlbumCrudService albumService;
	/**
	 * 唱片曲目信息实体组件。<br>
	 */
	@Resource
	private AlbumTrackCrudService albumTrackService;
	/**
	 * 唱片参与表演者信息实体组件。<br>
	 */
	@Resource
	private AlbumContributorCrudService albumContributorService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ume.sample.service.AlbumService#findAlbumByCode(java.lang.Long)
	 */
	@Override
	public AlbumManageDto queryAlbum(Long id) {
		// 根据传入的唱片编号，主键查询唱片基础信息
		AlbumDto albumBasicParam = new AlbumDto();
		albumBasicParam.setId(id);
		AlbumDto albumBasic = albumService.find(albumBasicParam);
		// AlbumDto albumBasic = getDao().queryForObject(AlbumDto.SQLID.FIND, albumCode, AlbumDto.class);
		if (albumBasic == null) {
		    getLogger().info(SAMPLE_MSG_002, id);
			return null;
		}
		// 返回结果唱片信息的描述对象
		AlbumManageDto album = new AlbumManageDto();
		// 进行业务加工处理
		albumBasic.clearDefaultProperties();
		album.setAlbum(albumBasic);
		// 根据传入的唱片编号，查询唱片参与者信息
		AlbumContributorDto contributorParam = new AlbumContributorDto();
		contributorParam.setAlbumId(id);
		List<AlbumContributorDto> contributorList = albumContributorService.findList(contributorParam);
		// List<AlbumContributorDto> contributorList = getDao().queryForObjectList(AlbumContributorDto.SQLID.SEARCH, contributorParam, AlbumContributorDto.class);
		// 进行业务加工处理
		for (AlbumContributorDto contributor : contributorList) {
			contributor.clearDefaultProperties();
		}
		album.setContributorList(contributorList);
		// 查询唱片曲目信息
		AlbumTrackDto trackParam = new AlbumTrackDto();
		trackParam.setAlbumId(id);
		List<AlbumTrackDto> trackList = albumTrackService.findList(trackParam);
		// List<AlbumTrackDto> trackList = getDao().queryForObjectList(AlbumTrackDto.SQLID.SEARCH, trackParam, AlbumTrackDto.class);
		// 进行业务加工处理
		for (AlbumTrackDto track : trackList) {
			track.clearDefaultProperties();
		}
		album.setTrackList(trackList);
		return album;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ume.sample.service.AlbumService#findAlbumByArtist(java.lang.String)
	 */
	@Override
	public List<AlbumManageDto> queryAlbumListByArtistTitle(String artist, String title) {
		Map<String, String> queryParam = new HashedMap<String, String>();
		if (artist != null) {
			queryParam.put(AlbumDto.Property.artist, artist);
		}
		if (title != null) {
			queryParam.put(AlbumDto.Property.title, title);
		}
		List<AlbumDto> albumBasicList = albumService.findListLike(queryParam);
		List<AlbumManageDto> albumList = new ArrayList<AlbumManageDto>(albumBasicList.size());
		if (albumBasicList.size() == 0) {
		    getLogger().info(SAMPLE_MSG_008, artist);
			return albumList;
		}
		for (AlbumDto albumBasic : albumBasicList) {
			AlbumManageDto e = queryAlbum(albumBasic.getId());
			albumList.add(e);
		}
		return albumList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ume.sample.service.AlbumService#queryAlbumList(AlbumDto)
	 */
	@Override
	public List<AlbumManageDto> queryAlbumList(AlbumDto queryParam) {
		List<AlbumDto> albumBasicList = albumService.findList(queryParam);
		if (albumBasicList.size() == 0) {
		    getLogger().info(SAMPLE_MSG_008, queryParam);
			return null;
		}
		List<AlbumManageDto> albumList = new ArrayList<AlbumManageDto>(albumBasicList.size());
		for (AlbumDto albumBasic : albumBasicList) {
			AlbumManageDto e = queryAlbum(albumBasic.getId());
			albumList.add(e);
		}
		return albumList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ume.sample.service.AlbumService#getAlbumsByMultiCondition(java.lang.String, com.ume.sample.entity.AlbumDto)
	 */
	@Override
	public List<AlbumManageDto> queryAlbumListByArtistAlbum(String artist, AlbumDto album) {
		List<AlbumManageDto> albumList = new ArrayList<AlbumManageDto>();

		List<AlbumManageDto> result = queryAlbumListByArtistTitle(artist, null);
		if (result != null) {
			albumList.addAll(result);
		}

		if (album != null) {
			List<AlbumDto> albumBasicList = albumService.findList(album);
			for (AlbumDto albumBasic : albumBasicList) {
				AlbumManageDto e = queryAlbum(albumBasic.getId());
				albumList.add(e);
			}
		}
		return albumList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.umeframework.quickstart.sample.service.AlbumAccessService#updateAlbum(org.umeframework.quickstart.sample.service.dto.AlbumDto)
	 */
	@Override
	public void updateAlbum(AlbumManageDto param) {
		AlbumDto album = param.getAlbum();
		// 更新前基础校验
		if (album.getId() == null || album.getId() < 0) {
			throw new ApplicationException(SAMPLE_MSG_001, new Object[] {album.getId()});
		}
		// 更新前业务校验
		AlbumDto exist = albumService.find(album);
		if (exist == null) {
			throw new ApplicationException(SAMPLE_MSG_002, new Object[] {album.getId()});
		}

		// 更新曲目列表
		List<AlbumTrackDto> trackList = param.getTrackList();
		if (trackList != null) {
			for (AlbumTrackDto track : trackList) {
				albumTrackService.update(track);
			}
		}
		// 更新参与者列表
		List<AlbumContributorDto> contributorList = param.getContributorList();
		if (contributorList != null) {
			for (AlbumContributorDto contributor : contributorList) {
				albumContributorService.update(contributor);
			}
		}
		// 更新唱片基础信息
		albumService.update(exist);
		getLogger().info(SAMPLE_MSG_003, exist.getId() + ":" + exist.getArtist() + "-" + exist.getTitle());
		    
	}

}
