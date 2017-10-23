package com.cnpinyin.cnpinyin.app.vocabulary.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnpinyin.cnpinyin.app.vocabulary.resources.TopicResource;
import com.cnpinyin.cnpinyin.app.vocabulary.services.VocabularyService;

@RestController
@RequestMapping(path = "voc", produces = MediaType.APPLICATION_JSON_VALUE)
public class VocabularyController {

	@Autowired
	VocabularyService vocabularyService;
	
	@RequestMapping(value = "topic", method = RequestMethod.GET)
	public ResponseEntity<List<TopicResource> > getAllTopic() {
		List<TopicResource> topicResources = vocabularyService.getAllTopic();
	    return new ResponseEntity<List<TopicResource> >(topicResources, HttpStatus.OK);
	}
}
