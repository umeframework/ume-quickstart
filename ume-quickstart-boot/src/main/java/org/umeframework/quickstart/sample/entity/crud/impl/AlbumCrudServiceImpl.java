package org.umeframework.quickstart.sample.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.quickstart.sample.entity.AlbumDto;
import org.umeframework.quickstart.sample.entity.crud.AlbumCrudService;

/**
 * 唱片基本信息表:ALBUM CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class AlbumCrudServiceImpl extends BaseDBComponent implements AlbumCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(AlbumDto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(AlbumDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<AlbumDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
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
    @TransactionRequired
    public Integer createOrUpdate(AlbumDto entity) {
        AlbumDto existed = super.getDao().queryForObject(AlbumDto.SQLID.FIND, entity, AlbumDto.class);
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
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<AlbumDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
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
    @TransactionRequired
    public Integer update(AlbumDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(AlbumDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<AlbumDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
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
    @TransactionRequired
    public Integer delete(AlbumDto entity) {
        int result = super.getDao().update(AlbumDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<AlbumDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
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
        return super.getDao().queryForObject(AlbumDto.SQLID.FIND, queryParam, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#findList
     */
    @Override
    public List<AlbumDto> findList(AlbumDto condition) {
        return super.getDao().queryForObjectList(AlbumDto.SQLID.FIND_LIST, condition, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService#findListLike
     */
    @Override
    public List<AlbumDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(AlbumDto.SQLID.FIND_LIST_LIKE, condition, AlbumDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(AlbumDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
