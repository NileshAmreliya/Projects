package com.java.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	CrudRepo topicDao;
	
	private List<Topic> topics = new ArrayList<>(); 
	
	public List<Topic> getAllTopics(){
		topicDao.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopicById(String id){
		return topicDao.findById(id).get();
	}
	
	public void addTopic(Topic topic){
		topicDao.save(topic);
	}
}
