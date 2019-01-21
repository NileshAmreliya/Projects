package com.java.demo.controller;

import org.springframework.data.repository.CrudRepository;

import com.java.demo.controller.Topic;

public interface CrudRepo extends CrudRepository<Topic, String>{

}
