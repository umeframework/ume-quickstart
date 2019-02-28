package org.umeframework.quickstart.uac.service;

import java.util.List;
import org.umeframework.quickstart.uac.entity.UmeRoleDto;

/**
 * UME角色定义表:UME_ROLE CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface UmeRoleCrudService {

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(UmeRoleDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<UmeRoleDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(UmeRoleDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<UmeRoleDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(UmeRoleDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<UmeRoleDto> entityList);
    
    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(UmeRoleDto entity);

    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<UmeRoleDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance
     */
    UmeRoleDto find(UmeRoleDto criteria);    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param criteria - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<UmeRoleDto> findList(UmeRoleDto criteria);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param criteria - query parameter describe by map
     * @return - matched entity instance list
     */
    List<UmeRoleDto> findListLike(UmeRoleDto criteria);
    
    /**
     * Count.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance list
     */
    Integer count(UmeRoleDto criteria);

}
