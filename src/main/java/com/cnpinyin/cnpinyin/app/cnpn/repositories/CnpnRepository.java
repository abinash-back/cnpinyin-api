package com.cnpinyin.cnpinyin.app.cnpn.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	@Query("SELECT DISTINCT a.level FROM Cnpn a")
	public List<Integer> findDistinctLevel();
	
	public int countByLevel(Integer level);
	
	Page<Cnpn> findByTopics(String topic, Pageable pageable);
	
	Page<Cnpn> findByLesson(String lesson, Pageable pageable);
	
	Page<Cnpn> findByLevel(Integer level, Pageable pageable);
}
