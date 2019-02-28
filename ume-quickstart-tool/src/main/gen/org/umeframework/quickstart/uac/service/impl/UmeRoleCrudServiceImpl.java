package org.umeframework.quickstart.uac.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.uac.entity.UmeRoleDto;
import org.umeframework.quickstart.uac.service.UmeRoleCrudService;

/**
 * UME角色定义表:UME_ROLE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class UmeRoleCrudServiceImpl implements UmeRoleCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#create
     */
    @Override
	public Integer create(UmeRoleDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeRoleDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeRoleDto entity) {
        UmeRoleDto existed = getDao().queryForObject(UmeRoleDto.SQLID.FIND, entity, UmeRoleDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#update
     */
    @Override
    public Integer update(UmeRoleDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeRoleDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#delete
     */
    @Override
    public Integer delete(UmeRoleDto entity) {
        int result = getDao().update(UmeRoleDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#find
     */
    @Override
    public UmeRoleDto find(UmeRoleDto criteria) {
        return getDao().queryForObject(UmeRoleDto.SQLID.FIND, criteria, UmeRoleDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#findList
     */
    @Override
    public List<UmeRoleDto> findList(UmeRoleDto criteria) {
        return getDao().queryForObjectList(UmeRoleDto.SQLID.FIND_LIST, criteria, UmeRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService#findListLike
     */
    @Override
    public List<UmeRoleDto> findListLike(UmeRoleDto criteria) {
        return getDao().queryForObjectList(UmeRoleDto.SQLID.FIND_LIST_LIKE, criteria, UmeRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleCrudService
     */
    @Override
    public Integer count(UmeRoleDto criteria) {
        return getDao().count(UmeRoleDto.SQLID.COUNT, criteria);
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
