package org.umeframework.quickstart.uac.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.uac.entity.UmeUserRoleDto;
import org.umeframework.quickstart.uac.service.UmeUserRoleCrudService;

/**
 * UME用户角色关系表:UME_USER_ROLE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class UmeUserRoleCrudServiceImpl implements UmeUserRoleCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#create
     */
    @Override
	public Integer create(UmeUserRoleDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeUserRoleDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeUserRoleDto entity) {
        UmeUserRoleDto existed = getDao().queryForObject(UmeUserRoleDto.SQLID.FIND, entity, UmeUserRoleDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#update
     */
    @Override
    public Integer update(UmeUserRoleDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeUserRoleDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#delete
     */
    @Override
    public Integer delete(UmeUserRoleDto entity) {
        int result = getDao().update(UmeUserRoleDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#find
     */
    @Override
    public UmeUserRoleDto find(UmeUserRoleDto criteria) {
        return getDao().queryForObject(UmeUserRoleDto.SQLID.FIND, criteria, UmeUserRoleDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#findList
     */
    @Override
    public List<UmeUserRoleDto> findList(UmeUserRoleDto criteria) {
        return getDao().queryForObjectList(UmeUserRoleDto.SQLID.FIND_LIST, criteria, UmeUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService#findListLike
     */
    @Override
    public List<UmeUserRoleDto> findListLike(UmeUserRoleDto criteria) {
        return getDao().queryForObjectList(UmeUserRoleDto.SQLID.FIND_LIST_LIKE, criteria, UmeUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeUserRoleCrudService
     */
    @Override
    public Integer count(UmeUserRoleDto criteria) {
        return getDao().count(UmeUserRoleDto.SQLID.COUNT, criteria);
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
