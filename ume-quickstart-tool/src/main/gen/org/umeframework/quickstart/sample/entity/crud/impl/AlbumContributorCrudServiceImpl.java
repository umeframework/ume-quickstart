package org.umeframework.quickstart.sample.entity.crud.impl;

import java.util.List;
import java.util.Map;
import org.umeframework.quickstart.sample.entity.AlbumContributorDto;
import org.umeframework.quickstart.sample.entity.crud.AlbumContributorCrudService;

/**
 * 参加该唱片录音的艺术家信息管理表:ALBUM_CONTRIBUTOR CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class AlbumContributorCrudServiceImpl extends org.umeframework.dora.service.BaseDBComponent implements AlbumContributorCrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#create
     */
    @Override
    public Integer create(AlbumContributorDto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(AlbumContributorDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumContributorDto entity) {
        AlbumContributorDto existed = super.getDao().queryForObject(AlbumContributorDto.SQLID.FIND, entity, AlbumContributorDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#update
     */
    @Override
    public Integer update(AlbumContributorDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(AlbumContributorDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#delete
     */
    @Override
    public Integer delete(AlbumContributorDto entity) {
        int result = super.getDao().update(AlbumContributorDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#find
     */
    @Override
    public AlbumContributorDto find(AlbumContributorDto queryParam) {
        return super.getDao().queryForObject(AlbumContributorDto.SQLID.FIND, queryParam, AlbumContributorDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#findList
     */
    @Override
    public List<AlbumContributorDto> findList(AlbumContributorDto condition) {
        return super.getDao().queryForObjectList(AlbumContributorDto.SQLID.FIND_LIST, condition, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService#findListLike
     */
    @Override
    public List<AlbumContributorDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(AlbumContributorDto.SQLID.FIND_LIST_LIKE, condition, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(AlbumContributorDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumContributorDto entity) {
        // Here invoke the default entity check logic
        org.umeframework.dora.bean.BeanValidator beanValidator = new org.umeframework.dora.bean.BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
