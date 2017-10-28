package com.cnpinyin.cnpinyin.app.cnpn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnpinyin.cnpinyin.schemas.Cnpn;

public interface CnpnRepository extends JpaRepository<Cnpn, Integer> {
	
	@Query("SELECT DISTINCT a.topics FROM Cnpn a")
	public List<String> findDistinctTopics();
	
	public int countByTopics(String topic);
	
	@Query("SELECT DISTINCT a.lesson FROM Cnpn a")
	public List<String> findDistinctLesson();
	
	public int countByLesson(String lesson);
}
