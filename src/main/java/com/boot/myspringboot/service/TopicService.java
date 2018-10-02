package com.boot.myspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.myspringboot.model.Topics;

@Service
public class TopicService {
	List<Topics> allTopics = new ArrayList<Topics>();
	
	public TopicService() {
		System.out.println("Inside TopicService Cons");
		allTopics.add(new Topics("topic1","desc1"));
		allTopics.add(new Topics("topic2","desc2"));
	}
	
	public List<Topics> getAllTopics(){
		return allTopics;
	}
}
