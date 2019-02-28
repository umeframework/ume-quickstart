package org.umeframework.quickstart.sample.service;

import java.util.List;
import org.umeframework.quickstart.sample.entity.AlbumGenreDto;

/**
 * 唱片风格分类描述表:ALBUM_GENRE CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface AlbumGenreCrudService {

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(AlbumGenreDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<AlbumGenreDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(AlbumGenreDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<AlbumGenreDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(AlbumGenreDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<AlbumGenreDto> entityList);
    
    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(AlbumGenreDto entity);

    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<AlbumGenreDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance
     */
    AlbumGenreDto find(AlbumGenreDto criteria);    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param criteria - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<AlbumGenreDto> findList(AlbumGenreDto criteria);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param criteria - query parameter describe by map
     * @return - matched entity instance list
     */
    List<AlbumGenreDto> findListLike(AlbumGenreDto criteria);
    
    /**
     * Count.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance list
     */
    Integer count(AlbumGenreDto criteria);

}
