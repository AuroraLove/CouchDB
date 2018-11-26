package com.auroralove.couchdb.service;

import com.auroralove.couchdb.entity.Sofa;

/**
 * Couchdb服务接口
 *
 * @author AuroraLove
 * @date 2018/11/15
 */
public interface CouchdbCRUD {

    /**
     * 新增接口
     *
     * @param sofa
     * @return Long sofa.id
     * @Exception Exception
     */
    String newSofa(Sofa sofa)throws Exception;


}
