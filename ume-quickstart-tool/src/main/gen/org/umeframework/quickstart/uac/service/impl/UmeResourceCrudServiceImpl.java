package org.umeframework.quickstart.uac.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.uac.entity.UmeResourceDto;
import org.umeframework.quickstart.uac.service.UmeResourceCrudService;

/**
 * UME资源管理表:UME_RESOURCE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class UmeResourceCrudServiceImpl implements UmeResourceCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#create
     */
    @Override
	public Integer create(UmeResourceDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeResourceDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeResourceDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeResourceDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeResourceDto entity) {
        UmeResourceDto existed = getDao().queryForObject(UmeResourceDto.SQLID.FIND, entity, UmeResourceDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeResourceDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeResourceDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#update
     */
    @Override
    public Integer update(UmeResourceDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeResourceDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeResourceDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeResourceDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#delete
     */
    @Override
    public Integer delete(UmeResourceDto entity) {
        int result = getDao().update(UmeResourceDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeResourceDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeResourceDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#find
     */
    @Override
    public UmeResourceDto find(UmeResourceDto criteria) {
        return getDao().queryForObject(UmeResourceDto.SQLID.FIND, criteria, UmeResourceDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#findList
     */
    @Override
    public List<UmeResourceDto> findList(UmeResourceDto criteria) {
        return getDao().queryForObjectList(UmeResourceDto.SQLID.FIND_LIST, criteria, UmeResourceDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService#findListLike
     */
    @Override
    public List<UmeResourceDto> findListLike(UmeResourceDto criteria) {
        return getDao().queryForObjectList(UmeResourceDto.SQLID.FIND_LIST_LIKE, criteria, UmeResourceDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeResourceCrudService
     */
    @Override
    public Integer count(UmeResourceDto criteria) {
        return getDao().count(UmeResourceDto.SQLID.COUNT, criteria);
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
