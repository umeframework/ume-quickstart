package org.umeframework.quickstart.uac.entity.crud.impl;

import java.util.List;
import java.util.Map;
import org.umeframework.quickstart.uac.entity.UmeRoleDto;
import org.umeframework.quickstart.uac.entity.crud.UmeRoleCrudService;

/**
 * UME角色定义表:UME_ROLE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeRoleCrudServiceImpl extends org.umeframework.dora.service.BaseDBComponent implements UmeRoleCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#create
     */
    @Override
    public Integer create(UmeRoleDto entity) {
        validate(entity);
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
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeRoleDto entity) {
        UmeRoleDto existed = getDao().queryForObject(UmeRoleDto.SQLID.FIND, entity, UmeRoleDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#update
     */
    @Override
    public Integer update(UmeRoleDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeRoleDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#delete
     */
    @Override
    public Integer delete(UmeRoleDto entity) {
        int result = getDao().update(UmeRoleDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeRoleDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#find
     */
    @Override
    public UmeRoleDto find(UmeRoleDto queryParam) {
        return getDao().queryForObject(UmeRoleDto.SQLID.FIND, queryParam, UmeRoleDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#findList
     */
    @Override
    public List<UmeRoleDto> findList(UmeRoleDto condition) {
        return getDao().queryForObjectList(UmeRoleDto.SQLID.FIND_LIST, condition, UmeRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService#findListLike
     */
    @Override
    public List<UmeRoleDto> findListLike(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeRoleDto.SQLID.FIND_LIST_LIKE, condition, UmeRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UmeRoleDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeRoleDto entity) {
        // Here invoke the default entity check logic
        org.umeframework.dora.bean.BeanValidator beanValidator = new org.umeframework.dora.bean.BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
