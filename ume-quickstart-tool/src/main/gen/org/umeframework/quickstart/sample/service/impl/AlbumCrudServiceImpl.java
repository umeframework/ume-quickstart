package org.umeframework.quickstart.sample.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.sample.entity.AlbumDto;
import org.umeframework.quickstart.sample.service.AlbumCrudService;

/**
 * 唱片基本信息表:ALBUM CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class AlbumCrudServiceImpl implements AlbumCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#create
     */
    @Override
	public Integer create(AlbumDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumDto entity) {
        AlbumDto existed = getDao().queryForObject(AlbumDto.SQLID.FIND, entity, AlbumDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#update
     */
    @Override
    public Integer update(AlbumDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#delete
     */
    @Override
    public Integer delete(AlbumDto entity) {
        int result = getDao().update(AlbumDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#find
     */
    @Override
    public AlbumDto find(AlbumDto criteria) {
        return getDao().queryForObject(AlbumDto.SQLID.FIND, criteria, AlbumDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#findList
     */
    @Override
    public List<AlbumDto> findList(AlbumDto criteria) {
        return getDao().queryForObjectList(AlbumDto.SQLID.FIND_LIST, criteria, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService#findListLike
     */
    @Override
    public List<AlbumDto> findListLike(AlbumDto criteria) {
        return getDao().queryForObjectList(AlbumDto.SQLID.FIND_LIST_LIKE, criteria, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumCrudService
     */
    @Override
    public Integer count(AlbumDto criteria) {
        return getDao().count(AlbumDto.SQLID.COUNT, criteria);
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
