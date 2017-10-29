package com.cnpinyin.cnpinyin.app.vocabulary.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnpinyin.cnpinyin.app.cnpn.repositories.CnpnRepository;
import com.cnpinyin.cnpinyin.app.hskvoc.repositories.HskVocRepository;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.HskLevelResource;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.LessonResource;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.LevelResource;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.TopicResource;
import com.cnpinyin.cnpinyin.schemas.Cnpn;
import com.cnpinyin.cnpinyin.schemas.HskVoc;

@Service
@Transactional
public class VocabularyService {
	
	@Autowired
	CnpnRepository cnpnRepository;
	
	@Autowired
	HskVocRepository hskVocRepository;
	
	// CNPN
	public List<TopicResource> getAllTopic(){
		List<String> topics = cnpnRepository.findDistinctTopics();
		List<TopicResource> topicResources = new ArrayList<>();
		for (String topic : topics) {
			int size = cnpnRepository.countByTopics(topic);
			topicResources.add(new TopicResource(topic, size));
		}
		return topicResources;
	}
	
	public Page<Cnpn> getByTopic(String topic, Pageable pageable) {
	    Page<Cnpn> topics = cnpnRepository.findByTopics(topic, pageable);
	    return topics;
	}

	public List<LessonResource> getAllLesson() {
		List<String> lessons = cnpnRepository.findDistinctLesson();
		List<LessonResource> lessonResources = new ArrayList<>();
		for (String lesson : lessons) {
			int size = cnpnRepository.countByLesson(lesson);
			lessonResources.add(new LessonResource(lesson, size));
		}
		return lessonResources;
	}
	
	public Page<Cnpn> getByLesson(String lesson, Pageable pageable) {
		Page<Cnpn> lessons = cnpnRepository.findByLesson(lesson, pageable);
		return lessons;
	}


	public List<LevelResource> getAllLevel() {
		List<Integer> levels = cnpnRepository.findDistinctLevel();
		List<LevelResource> levelResources = new ArrayList<>();
		for (Integer level : levels) {
			int size = cnpnRepository.countByLevel(level);
			String levelString = "Level "+level;
			levelResources.add(new LevelResource(levelString, size));
		}
		return levelResources;
	}
	
	public Page<Cnpn> getByLevel(Integer level, Pageable pageable) {
		Page<Cnpn> levels = cnpnRepository.findByLevel(level, pageable);
		return levels;
	}
	
	//HSK
	public List<HskLevelResource> getAllHskLevel(){
		List<Integer> levels = hskVocRepository.findDistinctLevel();
		List<HskLevelResource> hskLevelResources = new ArrayList<>();
		for (Integer level : levels) {
			int size = hskVocRepository.countByLevel(level);
			String levelString = "Level "+level;
			hskLevelResources.add(new HskLevelResource(levelString, size));
		}
		return hskLevelResources;
	}

	public Page<HskVoc> getByHskLevel(Integer level, Pageable pageable) {
		Page<HskVoc> levels = hskVocRepository.findByLevel(level, pageable);
		return levels;
	}
}
