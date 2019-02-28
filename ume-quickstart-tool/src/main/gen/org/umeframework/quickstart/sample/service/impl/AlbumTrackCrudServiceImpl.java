package org.umeframework.quickstart.sample.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.sample.entity.AlbumTrackDto;
import org.umeframework.quickstart.sample.service.AlbumTrackCrudService;

/**
 * 唱片曲目信息表:ALBUM_TRACK CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class AlbumTrackCrudServiceImpl implements AlbumTrackCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#create
     */
    @Override
	public Integer create(AlbumTrackDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumTrackDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumTrackDto entity) {
        AlbumTrackDto existed = getDao().queryForObject(AlbumTrackDto.SQLID.FIND, entity, AlbumTrackDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#update
     */
    @Override
    public Integer update(AlbumTrackDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumTrackDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#delete
     */
    @Override
    public Integer delete(AlbumTrackDto entity) {
        int result = getDao().update(AlbumTrackDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#find
     */
    @Override
    public AlbumTrackDto find(AlbumTrackDto criteria) {
        return getDao().queryForObject(AlbumTrackDto.SQLID.FIND, criteria, AlbumTrackDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#findList
     */
    @Override
    public List<AlbumTrackDto> findList(AlbumTrackDto criteria) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.FIND_LIST, criteria, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService#findListLike
     */
    @Override
    public List<AlbumTrackDto> findListLike(AlbumTrackDto criteria) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.FIND_LIST_LIKE, criteria, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumTrackCrudService
     */
    @Override
    public Integer count(AlbumTrackDto criteria) {
        return getDao().count(AlbumTrackDto.SQLID.COUNT, criteria);
    }

	/**
	 * @return the uid
	 */
	public String getUid() {
		return RequestContext.getCurrentContext().get("UID");
	}
	
	/**
	 * @return the dao
	 */
	public RdbDao getDao() {
		return dao;
	}

}
