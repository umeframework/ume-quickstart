package org.umeframework.quickstart.sample.service;

import java.util.List;
import org.umeframework.quickstart.sample.entity.AlbumTrackDto;

/**
 * 唱片曲目信息表:ALBUM_TRACK CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface AlbumTrackCrudService {

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(AlbumTrackDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<AlbumTrackDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(AlbumTrackDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<AlbumTrackDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(AlbumTrackDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<AlbumTrackDto> entityList);
    
    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(AlbumTrackDto entity);

    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<AlbumTrackDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance
     */
    AlbumTrackDto find(AlbumTrackDto criteria);    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param criteria - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<AlbumTrackDto> findList(AlbumTrackDto criteria);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param criteria - query parameter describe by map
     * @return - matched entity instance list
     */
    List<AlbumTrackDto> findListLike(AlbumTrackDto criteria);
    
    /**
     * Count.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance list
     */
    Integer count(AlbumTrackDto criteria);

}
