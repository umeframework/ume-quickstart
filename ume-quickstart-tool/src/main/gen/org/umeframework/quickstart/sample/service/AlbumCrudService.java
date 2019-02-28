package org.umeframework.quickstart.sample.service;

import java.util.List;
import org.umeframework.quickstart.sample.entity.AlbumDto;

/**
 * 唱片基本信息表:ALBUM CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface AlbumCrudService {

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(AlbumDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<AlbumDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(AlbumDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<AlbumDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(AlbumDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<AlbumDto> entityList);
    
    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(AlbumDto entity);

    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<AlbumDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance
     */
    AlbumDto find(AlbumDto criteria);    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param criteria - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<AlbumDto> findList(AlbumDto criteria);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param criteria - query parameter describe by map
     * @return - matched entity instance list
     */
    List<AlbumDto> findListLike(AlbumDto criteria);
    
    /**
     * Count.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance list
     */
    Integer count(AlbumDto criteria);

}
