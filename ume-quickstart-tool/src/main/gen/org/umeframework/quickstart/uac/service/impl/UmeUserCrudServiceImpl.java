package org.umeframework.quickstart.uac.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.uac.entity.UmeUserDto;
import org.umeframework.quickstart.uac.service.UmeUserCrudService;

/**
 * UME用户表:UME_USER CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class UmeUserCrudServiceImpl implements UmeUserCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#create
     */
    @Override
	public Integer create(UmeUserDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeUserDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeUserDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeUserDto entity) {
        UmeUserDto existed = getDao().queryForObject(UmeUserDto.SQLID.FIND, entity, UmeUserDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeUserDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#update
     */
    @Override
    public Integer update(UmeUserDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeUserDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeUserDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#delete
     */
    @Override
    public Integer delete(UmeUserDto entity) {
        int result = getDao().update(UmeUserDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeUserDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#find
     */
    @Override
    public UmeUserDto find(UmeUserDto criteria) {
        return getDao().queryForObject(UmeUserDto.SQLID.FIND, criteria, UmeUserDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#findList
     */
    @Override
    public List<UmeUserDto> findList(UmeUserDto criteria) {
        return getDao().queryForObjectList(UmeUserDto.SQLID.FIND_LIST, criteria, UmeUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService#findListLike
     */
    @Override
    public List<UmeUserDto> findListLike(UmeUserDto criteria) {
        return getDao().queryForObjectList(UmeUserDto.SQLID.FIND_LIST_LIKE, criteria, UmeUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserCrudService
     */
    @Override
    public Integer count(UmeUserDto criteria) {
        return getDao().count(UmeUserDto.SQLID.COUNT, criteria);
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
