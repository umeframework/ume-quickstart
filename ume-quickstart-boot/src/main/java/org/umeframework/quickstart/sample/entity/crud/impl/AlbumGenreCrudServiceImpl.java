package org.umeframework.quickstart.sample.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.quickstart.sample.entity.AlbumGenreDto;
import org.umeframework.quickstart.sample.entity.crud.AlbumGenreCrudService;

/**
 * 唱片风格分类描述表:ALBUM_GENRE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class AlbumGenreCrudServiceImpl extends BaseDBComponent implements AlbumGenreCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(AlbumGenreDto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(AlbumGenreDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(AlbumGenreDto entity) {
        AlbumGenreDto existed = super.getDao().queryForObject(AlbumGenreDto.SQLID.FIND, entity, AlbumGenreDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(AlbumGenreDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(AlbumGenreDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(AlbumGenreDto entity) {
        int result = super.getDao().update(AlbumGenreDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#find
     */
    @Override
    public AlbumGenreDto find(AlbumGenreDto queryParam) {
        return super.getDao().queryForObject(AlbumGenreDto.SQLID.FIND, queryParam, AlbumGenreDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#findList
     */
    @Override
    public List<AlbumGenreDto> findList(AlbumGenreDto condition) {
        return super.getDao().queryForObjectList(AlbumGenreDto.SQLID.FIND_LIST, condition, AlbumGenreDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService#findListLike
     */
    @Override
    public List<AlbumGenreDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(AlbumGenreDto.SQLID.FIND_LIST_LIKE, condition, AlbumGenreDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumGenreCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(AlbumGenreDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumGenreDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
