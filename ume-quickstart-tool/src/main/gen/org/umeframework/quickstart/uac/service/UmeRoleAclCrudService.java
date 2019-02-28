package org.umeframework.quickstart.uac.service;

import java.util.List;
import org.umeframework.quickstart.uac.entity.UmeRoleAclDto;

/**
 * UME角色资源访问权限关系表:UME_ROLE_ACL CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface UmeRoleAclCrudService {

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(UmeRoleAclDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<UmeRoleAclDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(UmeRoleAclDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<UmeRoleAclDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(UmeRoleAclDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<UmeRoleAclDto> entityList);
    
    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(UmeRoleAclDto entity);

    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<UmeRoleAclDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance
     */
    UmeRoleAclDto find(UmeRoleAclDto criteria);    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param criteria - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<UmeRoleAclDto> findList(UmeRoleAclDto criteria);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param criteria - query parameter describe by map
     * @return - matched entity instance list
     */
    List<UmeRoleAclDto> findListLike(UmeRoleAclDto criteria);
    
    /**
     * Count.<br>
     * 
     * @param criteria - query parameter
     * @return - matched entity instance list
     */
    Integer count(UmeRoleAclDto criteria);

}
