package com.cnpinyin.cnpinyin.app.sc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnpinyin.cnpinyin.schemas.ScVoc;

public interface ScVocRepository extends JpaRepository<ScVoc, Integer> {
	
	@Query("SELECT DISTINCT a.strokes FROM ScVoc a")
	public List<Integer> findDistinctStrokes();
	
	public int countByStrokes(Integer strokes);
	
	Page<ScVoc> findByStrokes(Integer strokes, Pageable pageable);
}
