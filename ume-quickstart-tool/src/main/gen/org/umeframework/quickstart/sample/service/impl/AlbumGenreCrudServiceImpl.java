package org.umeframework.quickstart.sample.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.umeframework.dora.context.RequestContext;
import org.umeframework.dora.dao.RdbDao;
import org.umeframework.quickstart.sample.entity.AlbumGenreDto;
import org.umeframework.quickstart.sample.service.AlbumGenreCrudService;

/**
 * 唱片风格分类描述表:ALBUM_GENRE CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@Service
public class AlbumGenreCrudServiceImpl implements AlbumGenreCrudService {
    /**
     * RdbDao
     */
    @Resource
    private RdbDao dao;


    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#create
     */
    @Override
	public Integer create(AlbumGenreDto entity) {
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumGenreDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#createList
     */
    @Override
    public List<Integer> createList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#createOrUpdate
     */
    @Override
    public Integer createOrUpdate(AlbumGenreDto entity) {
        AlbumGenreDto existed = getDao().queryForObject(AlbumGenreDto.SQLID.FIND, entity, AlbumGenreDto.class);
        if (existed == null) {
            return create(entity);
        } else {
            return update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#createOrUpdateList
     */
    @Override
    public List<Integer> createOrUpdateList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#update
     */
    @Override
    public Integer update(AlbumGenreDto entity) {
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(getUid());
        }
        int result = getDao().update(AlbumGenreDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#updateList
     */
    @Override
    public List<Integer> updateList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#delete
     */
    @Override
    public Integer delete(AlbumGenreDto entity) {
        int result = getDao().update(AlbumGenreDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#deleteList
     */
    @Override
    public List<Integer> deleteList(List<AlbumGenreDto> entityList) {
        List<Integer> result = new java.util.ArrayList<Integer>(entityList.size());
        for (AlbumGenreDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#find
     */
    @Override
    public AlbumGenreDto find(AlbumGenreDto criteria) {
        return getDao().queryForObject(AlbumGenreDto.SQLID.FIND, criteria, AlbumGenreDto.class);
    }
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#findList
     */
    @Override
    public List<AlbumGenreDto> findList(AlbumGenreDto criteria) {
        return getDao().queryForObjectList(AlbumGenreDto.SQLID.FIND_LIST, criteria, AlbumGenreDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService#findListLike
     */
    @Override
    public List<AlbumGenreDto> findListLike(AlbumGenreDto criteria) {
        return getDao().queryForObjectList(AlbumGenreDto.SQLID.FIND_LIST_LIKE, criteria, AlbumGenreDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.quickstart.sample.service.impl.AlbumGenreCrudService
     */
    @Override
    public Integer count(AlbumGenreDto criteria) {
        return getDao().count(AlbumGenreDto.SQLID.COUNT, criteria);
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
