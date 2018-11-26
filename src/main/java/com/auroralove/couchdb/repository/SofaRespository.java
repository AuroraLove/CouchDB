package com.auroralove.couchdb.repository;

import com.auroralove.couchdb.config.CouchDBConfig;
import com.auroralove.couchdb.entity.Sofa;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 数据管理仓库，通过这个类可以进行对实体类与数据库交互
 *
 * @author AuroraLove
 * @date 2018/11/24
 */
public class SofaRespository extends CouchDbRepositorySupport<Sofa> {

    @Autowired
    CouchDBConfig couchDBConfig;

    protected SofaRespository(Class<Sofa> type, CouchDbConnector db){
        super(type, db,true);
        initStandardDesignDocument();
    }



}
