package com.boot.myspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.myspringboot.model.Topic;
import com.boot.myspringboot.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getTopics(){
		return topicService.getAllTopics();
	}
	
	
	/*
	 * An Exception has been mapped for this URL. Try the URL "http://localhost:8080/topics/1" and see what happens.
	 * Also see the ExcpetionHandler at TopicControllerAdvice.
	 */
	@GetMapping("/topics/{name}")
	public Topic getTopic(@PathVariable String name) {
		return topicService.getTopic(name);
	}
	
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{name}")
	public String updateTopic(@PathVariable String name,@RequestBody Topic topic) {
		return topicService.updateTopic(name,topic);
	}
	
	@DeleteMapping("/topics/{name}")
	public String deleteTopic(@PathVariable String name) {
		return topicService.deleteTopic(name);
	}
}
