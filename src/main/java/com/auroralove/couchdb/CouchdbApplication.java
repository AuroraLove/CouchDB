package com.auroralove.couchdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.auroralove")
public class CouchdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouchdbApplication.class, args);
    }
}
