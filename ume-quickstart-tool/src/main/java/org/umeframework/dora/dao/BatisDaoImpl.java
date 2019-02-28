/* 
 * Copyright 2014-2017 UME Framework Group, Apache License Version 2.0 
 */
package org.umeframework.dora.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import org.umeframework.dora.dao.RdbDao;

/**
 * MyBatis Dao implementation class.<br>
 *
 * @author Yue MA
 */
@Component
public class BatisDaoImpl extends SqlSessionDaoSupport implements RdbDao {

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#update(java.lang.String, java.lang.Object)
     */
    @Override
    public <E> int update(String updateId, E updateParam) {

        int result = getSqlSession().update(updateId, updateParam);

        return result;
    }

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#updateMulti(java.lang.String, java.util.List)
     */
    @Override
    public <E> int[] updateMulti(String updateId, List<E> updateParams) {

        if (updateParams == null) {
            return null;
        }
        int[] result = new int[updateParams.size()];
        for (int i = 0; i < updateParams.size(); i++) {
            result[i] = update(updateId, updateParams.get(i));
        }
        return result;
    }

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#queryForObject(java.lang.String, java.lang.Object, java.lang.Class)
     */
    @Override
    public <E> E queryForObject(String queryId, Object queryParam, Class<? extends E> clazz) {

        E result = getSqlSession().selectOne(queryId, queryParam);
        return result;
    }

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#queryForMap(java.lang.String, java.lang.Object)
     */
    @SuppressWarnings({
        "unchecked", "rawtypes"
    })
    @Override
    public Map<String, Object> queryForMap(String queryId, Object queryParam) {

        Object resultObj = getSqlSession().selectOne(queryId, queryParam);
        if (resultObj instanceof Map) {
            return (Map) resultObj;
        } else {
            return BeanUtil.beanToMap(resultObj);
        }
    }

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#queryForObjectList(java.lang.String, java.lang.Object, java.lang.Class)
     */
    @Override
    public <E> List<E> queryForObjectList(String queryId, Object queryParam, Class<? extends E> clazz) {

        List<E> result = getSqlSession().selectList(queryId, queryParam);
        return result;
    }

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#queryForMapList(java.lang.String, java.lang.Object)
     */
    @SuppressWarnings({
        "unchecked", "rawtypes"
    })
    @Override
    public List<Map<String, Object>> queryForMapList(String queryId, Object queryParam) {

        List<Object> resultObjList = getSqlSession().selectList(queryId, queryParam);
        if (resultObjList == null) {
            return null;
        }

        if (resultObjList.size() == 0) {
            return new ArrayList<Map<String, Object>>(0);
        }
        List<Map<String, Object>> resultMapList = new ArrayList<Map<String, Object>>(resultObjList.size());
        for (Object resultObj : resultObjList) {
            if (resultObj instanceof Map) {
                resultMapList.add((Map) resultObj);
            } else {
                resultMapList.add(BeanUtil.beanToMap(resultObj));
            }
        }

        return resultMapList;
    }

    /* (non-Javadoc)
     * @see com.chinamobile.scm.mdm.dao.RdbDao#count(java.lang.String, java.lang.Object)
     */
    @Override
    public <E> int count(String queryId, Object queryParam) {

        int result = getSqlSession().selectOne(queryId, queryParam);

        return result;
    }

}
