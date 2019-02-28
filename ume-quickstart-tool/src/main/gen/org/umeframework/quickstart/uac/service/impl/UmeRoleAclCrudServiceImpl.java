package org.umeframework.quickstart.uac.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.uac.entity.UmeRoleAclDto;
import org.umeframework.quickstart.uac.service.UmeRoleAclCrudService;

/**
 * UME角色资源访问权限关系表:UME_ROLE_ACL CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class UmeRoleAclCrudServiceImpl implements UmeRoleAclCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#create
     */
    @Override
	public Integer create(UmeRoleAclDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeRoleAclDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeRoleAclDto entity) {
        UmeRoleAclDto existed = getDao().queryForObject(UmeRoleAclDto.SQLID.FIND, entity, UmeRoleAclDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#update
     */
    @Override
    public Integer update(UmeRoleAclDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeRoleAclDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#delete
     */
    @Override
    public Integer delete(UmeRoleAclDto entity) {
        int result = getDao().update(UmeRoleAclDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#find
     */
    @Override
    public UmeRoleAclDto find(UmeRoleAclDto criteria) {
        return getDao().queryForObject(UmeRoleAclDto.SQLID.FIND, criteria, UmeRoleAclDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#findList
     */
    @Override
    public List<UmeRoleAclDto> findList(UmeRoleAclDto criteria) {
        return getDao().queryForObjectList(UmeRoleAclDto.SQLID.FIND_LIST, criteria, UmeRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService#findListLike
     */
    @Override
    public List<UmeRoleAclDto> findListLike(UmeRoleAclDto criteria) {
        return getDao().queryForObjectList(UmeRoleAclDto.SQLID.FIND_LIST_LIKE, criteria, UmeRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.service.impl.UmeRoleAclCrudService
     */
    @Override
    public Integer count(UmeRoleAclDto criteria) {
        return getDao().count(UmeRoleAclDto.SQLID.COUNT, criteria);
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
