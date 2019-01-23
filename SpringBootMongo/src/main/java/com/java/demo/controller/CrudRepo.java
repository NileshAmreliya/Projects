package com.java.demo.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.demo.controller.Topic;

@Repository
public interface CrudRepo extends MongoRepository<Topic, String>{

}
