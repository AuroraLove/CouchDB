package com.auroralove.couchdb.controller;

import com.auroralove.couchdb.entity.Sofa;
import com.auroralove.couchdb.service.CouchdbCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Couchdb Restful接口
 *
 * @author AuraroLove
 * @date 2018/11/18
 */
@RestController
@RequestMapping("/AuraroLove/couchdb")
public class CouchdbController {

    @Autowired
    CouchdbCRUD couchdbCRUD;

    @RequestMapping("/new")
    public String newSofa(Sofa sofa) throws Exception{
        String id = couchdbCRUD.newSofa(sofa);
        return id;
    }
}
