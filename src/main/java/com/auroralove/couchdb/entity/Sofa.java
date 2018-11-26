package com.auroralove.couchdb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 文档实体类
 *
 * 注解用于映射文档字段与属性字段不一致的情况，另外_id,_rev字段为
 * 数据库文档默认生成的字段，如果不指定则会自动生成;如果不指定相应
 * 字段，数据库则会通过含有get，set方法的属性字段自动映射
 *
 * @author AuroraLove
 * @date 2018/11/24
 */
public class Sofa {

    @JsonProperty(value = "_id")
    private String id;

    @JsonProperty(value = "_rev")
    private String revision;

    private String color;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
