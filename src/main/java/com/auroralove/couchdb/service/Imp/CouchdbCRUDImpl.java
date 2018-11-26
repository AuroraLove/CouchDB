package com.auroralove.couchdb.service.Imp;

import com.auroralove.couchdb.entity.Sofa;
import com.auroralove.couchdb.service.CouchdbCRUD;
import org.ektorp.CouchDbConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Couchdb数据库连接配置
 *
 * @author AuroraLove
 * @date 2018/11/15
 */
@Component
public class CouchdbCRUDImpl implements CouchdbCRUD {

	@Autowired
	private CouchDbConnector connector;
    
    /**
     * 新增沙发
	 * @param sofa
	 */
	@Override
	public String newSofa(Sofa sofa) throws Exception {
		connector.create(sofa.getId(), sofa);
		return sofa.getId();
	}

}
