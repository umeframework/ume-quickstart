package org.umeframework.quickstart.sample.entity.crud.impl;

import java.util.List;
import java.util.Map;
import org.umeframework.quickstart.sample.entity.AlbumDto;
import org.umeframework.quickstart.sample.entity.crud.AlbumCrudService;

/**
 * 唱片基本信息表:ALBUM CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class AlbumCrudServiceImpl extends org.umeframework.dora.service.BaseDBComponent implements AlbumCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#create
     */
    @Override
    public Integer create(AlbumDto entity) {
        validate(entity);
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
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumDto entity) {
        AlbumDto existed = getDao().queryForObject(AlbumDto.SQLID.FIND, entity, AlbumDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#update
     */
    @Override
    public Integer update(AlbumDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#delete
     */
    @Override
    public Integer delete(AlbumDto entity) {
        int result = getDao().update(AlbumDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#find
     */
    @Override
    public AlbumDto find(AlbumDto queryParam) {
        return getDao().queryForObject(AlbumDto.SQLID.FIND, queryParam, AlbumDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#findList
     */
    @Override
    public List<AlbumDto> findList(AlbumDto condition) {
        return getDao().queryForObjectList(AlbumDto.SQLID.FIND_LIST, condition, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#findListLike
     */
    @Override
    public List<AlbumDto> findListLike(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumDto.SQLID.FIND_LIST_LIKE, condition, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(AlbumDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumDto entity) {
        // Here invoke the default entity check logic
        org.umeframework.dora.bean.BeanValidator beanValidator = new org.umeframework.dora.bean.BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
