package org.umeframework.quickstart.uac.entity.crud.impl;

import java.util.List;
import java.util.Map;
import org.umeframework.quickstart.uac.entity.UmeUserRoleDto;
import org.umeframework.quickstart.uac.entity.crud.UmeUserRoleCrudService;

/**
 * UME用户角色关系表:UME_USER_ROLE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeUserRoleCrudServiceImpl extends org.umeframework.dora.service.BaseDBComponent implements UmeUserRoleCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#create
     */
    @Override
    public Integer create(UmeUserRoleDto entity) {
        validate(entity);
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
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeUserRoleDto entity) {
        UmeUserRoleDto existed = getDao().queryForObject(UmeUserRoleDto.SQLID.FIND, entity, UmeUserRoleDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#update
     */
    @Override
    public Integer update(UmeUserRoleDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeUserRoleDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#delete
     */
    @Override
    public Integer delete(UmeUserRoleDto entity) {
        int result = getDao().update(UmeUserRoleDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeUserRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeUserRoleDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#find
     */
    @Override
    public UmeUserRoleDto find(UmeUserRoleDto queryParam) {
        return getDao().queryForObject(UmeUserRoleDto.SQLID.FIND, queryParam, UmeUserRoleDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#findList
     */
    @Override
    public List<UmeUserRoleDto> findList(UmeUserRoleDto condition) {
        return getDao().queryForObjectList(UmeUserRoleDto.SQLID.FIND_LIST, condition, UmeUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService#findListLike
     */
    @Override
    public List<UmeUserRoleDto> findListLike(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeUserRoleDto.SQLID.FIND_LIST_LIKE, condition, UmeUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeUserRoleCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UmeUserRoleDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeUserRoleDto entity) {
        // Here invoke the default entity check logic
        org.umeframework.dora.bean.BeanValidator beanValidator = new org.umeframework.dora.bean.BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
