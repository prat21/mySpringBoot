package com.boot.myspringboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.myspringboot.model.Topics;

@RestController
public class BootController {
	List<Topics> allTopics = new ArrayList<Topics>();
	
	@GetMapping("/topics")
	public List<Topics> getTopics(){
		allTopics.add(new Topics("name1","desc1"));
		allTopics.add(new Topics("name2","desc2"));
		
		return allTopics;
	}
}
