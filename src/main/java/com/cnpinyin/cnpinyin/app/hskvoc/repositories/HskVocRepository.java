package com.cnpinyin.cnpinyin.app.hskvoc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnpinyin.cnpinyin.schemas.HskVoc;

public interface HskVocRepository extends JpaRepository<HskVoc, Integer> {
	
	@Query("SELECT DISTINCT a.level FROM HskVoc a")
	public List<Integer> findDistinctLevel();
	
	public int countByLevel(Integer level);
	
	Page<HskVoc> findByLevel(Integer level, Pageable pageable);
}
