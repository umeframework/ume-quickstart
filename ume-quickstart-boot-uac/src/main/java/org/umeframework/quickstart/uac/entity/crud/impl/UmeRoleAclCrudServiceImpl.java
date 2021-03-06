package org.umeframework.quickstart.uac.entity.crud.impl;

import java.util.List;
import java.util.Map;
import org.umeframework.quickstart.uac.entity.UmeRoleAclDto;
import org.umeframework.quickstart.uac.entity.crud.UmeRoleAclCrudService;

/**
 * UME角色资源访问权限关系表:UME_ROLE_ACL CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeRoleAclCrudServiceImpl extends org.umeframework.dora.service.BaseDBComponent implements UmeRoleAclCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#create
     */
    @Override
    public Integer create(UmeRoleAclDto entity) {
        validate(entity);
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
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#createList
     */
    @Override
    public List<Integer> createList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(UmeRoleAclDto entity) {
        UmeRoleAclDto existed = getDao().queryForObject(UmeRoleAclDto.SQLID.FIND, entity, UmeRoleAclDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#update
     */
    @Override
    public Integer update(UmeRoleAclDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(UmeRoleAclDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#delete
     */
    @Override
    public Integer delete(UmeRoleAclDto entity) {
        int result = getDao().update(UmeRoleAclDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<UmeRoleAclDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (UmeRoleAclDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#find
     */
    @Override
    public UmeRoleAclDto find(UmeRoleAclDto queryParam) {
        return getDao().queryForObject(UmeRoleAclDto.SQLID.FIND, queryParam, UmeRoleAclDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#findList
     */
    @Override
    public List<UmeRoleAclDto> findList(UmeRoleAclDto condition) {
        return getDao().queryForObjectList(UmeRoleAclDto.SQLID.FIND_LIST, condition, UmeRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService#findListLike
     */
    @Override
    public List<UmeRoleAclDto> findListLike(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeRoleAclDto.SQLID.FIND_LIST_LIKE, condition, UmeRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.uac.entity.crud.impl.UmeRoleAclCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UmeRoleAclDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeRoleAclDto entity) {
        // Here invoke the default entity check logic
        org.umeframework.dora.bean.BeanValidator beanValidator = new org.umeframework.dora.bean.BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
