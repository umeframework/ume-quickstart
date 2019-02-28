package org.umeframework.quickstart.sample.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.sample.entity.AlbumContributorDto;
import org.umeframework.quickstart.sample.service.AlbumContributorCrudService;

/**
 * 参加该唱片录音的艺术家信息管理表:ALBUM_CONTRIBUTOR CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class AlbumContributorCrudServiceImpl implements AlbumContributorCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#create
     */
    @Override
	public Integer create(AlbumContributorDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumContributorDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumContributorDto entity) {
        AlbumContributorDto existed = getDao().queryForObject(AlbumContributorDto.SQLID.FIND, entity, AlbumContributorDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#update
     */
    @Override
    public Integer update(AlbumContributorDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumContributorDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#delete
     */
    @Override
    public Integer delete(AlbumContributorDto entity) {
        int result = getDao().update(AlbumContributorDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#find
     */
    @Override
    public AlbumContributorDto find(AlbumContributorDto criteria) {
        return getDao().queryForObject(AlbumContributorDto.SQLID.FIND, criteria, AlbumContributorDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#findList
     */
    @Override
    public List<AlbumContributorDto> findList(AlbumContributorDto criteria) {
        return getDao().queryForObjectList(AlbumContributorDto.SQLID.FIND_LIST, criteria, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService#findListLike
     */
    @Override
    public List<AlbumContributorDto> findListLike(AlbumContributorDto criteria) {
        return getDao().queryForObjectList(AlbumContributorDto.SQLID.FIND_LIST_LIKE, criteria, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumContributorCrudService
     */
    @Override
    public Integer count(AlbumContributorDto criteria) {
        return getDao().count(AlbumContributorDto.SQLID.COUNT, criteria);
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
