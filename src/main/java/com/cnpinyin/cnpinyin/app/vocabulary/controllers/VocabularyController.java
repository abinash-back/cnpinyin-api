package com.cnpinyin.cnpinyin.app.vocabulary.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnpinyin.cnpinyin.app.vocabulary.resources.HskLevelResource;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.LessonResource;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.LevelResource;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.TopicResource;
import com.cnpinyin.cnpinyin.app.vocabulary.services.VocabularyService;
import com.cnpinyin.cnpinyin.schemas.BctVoc;
import com.cnpinyin.cnpinyin.schemas.Cnpn;
import com.cnpinyin.cnpinyin.schemas.CnpnP2;
import com.cnpinyin.cnpinyin.schemas.CnpnP3;
import com.cnpinyin.cnpinyin.schemas.HskVoc;
import com.cnpinyin.cnpinyin.schemas.ScVoc;

@RestController
@RequestMapping(path = "voc", produces = MediaType.APPLICATION_JSON_VALUE)
public class VocabularyController {

	@Autowired
	VocabularyService vocabularyService; 
	
	//By Topic
	@RequestMapping(value = "topic", method = RequestMethod.GET)
	public ResponseEntity<List<TopicResource> > getAllTopic() {
		List<TopicResource> topicResources = vocabularyService.getAllTopic();
	    return new ResponseEntity<List<TopicResource> >(topicResources, HttpStatus.OK);
	}
	
	@RequestMapping(value = "topic/{topicName}", method = RequestMethod.GET)
	public ResponseEntity<Page<Cnpn> > getByTopic(@PathVariable("topicName") final String topicName, 
			Pageable pageable) {
		Page<Cnpn> topicResources = vocabularyService.getByTopic(topicName,pageable);
	    return new ResponseEntity<Page<Cnpn> >(topicResources, HttpStatus.OK);
	}
	
	//By Lesson
	@RequestMapping(value = "lesson", method = RequestMethod.GET)
	public ResponseEntity<List<LessonResource> > getAllLesson() {
		List<LessonResource> lessonResources = vocabularyService.getAllLesson();
	    return new ResponseEntity<List<LessonResource> >(lessonResources, HttpStatus.OK);
	}
	
	@RequestMapping(value = "lesson/{lessonName}", method = RequestMethod.GET)
	public ResponseEntity<Page<Cnpn> > getByLesson(@PathVariable("lessonName") final String lessonName, 
			Pageable pageable) {
		Page<Cnpn> lessonResources = vocabularyService.getByLesson(lessonName,pageable);
	    return new ResponseEntity<Page<Cnpn> >(lessonResources, HttpStatus.OK);
	}
	
	//By Level
	@RequestMapping(value = "level", method = RequestMethod.GET)
	public ResponseEntity<List<LevelResource> > getAllLevel() {
		List<LevelResource> levelResources = vocabularyService.getAllLevel();
	    return new ResponseEntity<List<LevelResource> >(levelResources, HttpStatus.OK);
	}
	
	@RequestMapping(value = "level/{levelName}", method = RequestMethod.GET)
	public ResponseEntity<Page<Cnpn> > getByLevel(@PathVariable("levelName") final String levelName, 
			Pageable pageable) {
		Integer level = Integer.parseInt(levelName.substring(6));
		Page<Cnpn> levelResources = vocabularyService.getByLevel(level,pageable);
	    return new ResponseEntity<Page<Cnpn> >(levelResources, HttpStatus.OK);
	}
	
	// By HSK 
	@RequestMapping(value = "hsk", method = RequestMethod.GET)
	public ResponseEntity<List<HskLevelResource> > getAllHsklevel() {
		List<HskLevelResource> hskLevelResources = vocabularyService.getAllHskLevel();
	    return new ResponseEntity<List<HskLevelResource> >(hskLevelResources, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "hsk/{levelName}", method = RequestMethod.GET)
	public ResponseEntity<Page<HskVoc> > getByHskLevel(@PathVariable("levelName") final String levelName, 
			Pageable pageable) {
		Integer level = Integer.parseInt(levelName.substring(6));
		Page<HskVoc> levelResources = vocabularyService.getByHskLevel(level,pageable);
	    return new ResponseEntity<Page<HskVoc> >(levelResources, HttpStatus.OK);
	}
	
	//By BCT
	@RequestMapping(value = "bct", method = RequestMethod.GET)
	public ResponseEntity<Page<BctVoc> > getAllBct(Pageable pageable) {
		Page<BctVoc> bctAllResources = vocabularyService.getAllBct(pageable);
	    return new ResponseEntity<Page<BctVoc> >(bctAllResources, HttpStatus.OK);
	}
	
	// By Topic Part 2
	@RequestMapping(value = "topic2", method = RequestMethod.GET)
	public ResponseEntity<List<TopicResource> > getAllTopicPart2() {
		List<TopicResource> topicResources = vocabularyService.getAllTopicPart2();
	    return new ResponseEntity<List<TopicResource> >(topicResources, HttpStatus.OK);
	}
	
	@RequestMapping(value = "topic2/{topicName}", method = RequestMethod.GET)
	public ResponseEntity<Page<CnpnP2> > getByTopicPart2(@PathVariable("topicName") final String topicName, 
			Pageable pageable) {
		Page<CnpnP2> topicResources = vocabularyService.getByTopicPart2(topicName,pageable);
	    return new ResponseEntity<Page<CnpnP2> >(topicResources, HttpStatus.OK);
	}
	
	// By Topic Part 2
	@RequestMapping(value = "topic3", method = RequestMethod.GET)
	public ResponseEntity<List<TopicResource>> getAllTopicPart3() {
		List<TopicResource> topicResources = vocabularyService.getAllTopicPart3();
		return new ResponseEntity<List<TopicResource>>(topicResources, HttpStatus.OK);
	}

	@RequestMapping(value = "topic3/{topicName}", method = RequestMethod.GET)
	public ResponseEntity<Page<CnpnP3>> getByTopicPart3(@PathVariable("topicName") final String topicName,
			Pageable pageable) {
		Page<CnpnP3> topicResources = vocabularyService.getByTopicPart3(topicName, pageable);
		return new ResponseEntity<Page<CnpnP3>>(topicResources, HttpStatus.OK);
	}
	
	// Single Character by range	
	@RequestMapping(value = "sc", method = RequestMethod.GET)
	public ResponseEntity<Page<ScVoc>> getAllScVoc(Pageable pageable) {
		Page<ScVoc> scVocResources = vocabularyService.getAllScVoc(pageable);
		return new ResponseEntity<Page<ScVoc>>(scVocResources, HttpStatus.OK);
	}
	
	// Single Character by number of strokes
	
}
