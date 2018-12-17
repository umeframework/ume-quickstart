package org.umeframework.quickstart.sample.entity.crud.impl;

import java.util.List;
import java.util.Map;
import org.umeframework.quickstart.sample.entity.AlbumTrackDto;
import org.umeframework.quickstart.sample.entity.crud.AlbumTrackCrudService;

/**
 * 唱片曲目信息表:ALBUM_TRACK CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class AlbumTrackCrudServiceImpl extends org.umeframework.dora.service.BaseDBComponent implements AlbumTrackCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#create
     */
    @Override
    public Integer create(AlbumTrackDto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumTrackDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumTrackDto entity) {
        AlbumTrackDto existed = getDao().queryForObject(AlbumTrackDto.SQLID.FIND, entity, AlbumTrackDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#update
     */
    @Override
    public Integer update(AlbumTrackDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumTrackDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#delete
     */
    @Override
    public Integer delete(AlbumTrackDto entity) {
        int result = getDao().update(AlbumTrackDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#find
     */
    @Override
    public AlbumTrackDto find(AlbumTrackDto queryParam) {
        return getDao().queryForObject(AlbumTrackDto.SQLID.FIND, queryParam, AlbumTrackDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#findList
     */
    @Override
    public List<AlbumTrackDto> findList(AlbumTrackDto condition) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.FIND_LIST, condition, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService#findListLike
     */
    @Override
    public List<AlbumTrackDto> findListLike(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.FIND_LIST_LIKE, condition, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(AlbumTrackDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumTrackDto entity) {
        // Here invoke the default entity check logic
        org.umeframework.dora.bean.BeanValidator beanValidator = new org.umeframework.dora.bean.BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
