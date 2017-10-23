package com.cnpinyin.cnpinyin.app.vocabulary.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnpinyin.cnpinyin.app.cnpn.repositories.CnpnRepository;
import com.cnpinyin.cnpinyin.app.vocabulary.resources.TopicResource;

@Service
@Transactional
public class VocabularyService {
	
	@Autowired
	CnpnRepository cnpnRepository;
	
	public List<TopicResource> getAllTopic(){
		List<String> topics = cnpnRepository.findDistinctTopics();
		List<TopicResource> topicResources = new ArrayList<>();
		for (String topic : topics) {
			int size = cnpnRepository.countByTopics(topic);
			topicResources.add(new TopicResource(topic, size));
		}
		return topicResources;
	}

}
