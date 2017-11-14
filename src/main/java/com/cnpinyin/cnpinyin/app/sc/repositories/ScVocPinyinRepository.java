package com.cnpinyin.cnpinyin.app.sc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cnpinyin.cnpinyin.schemas.ScVocPinyin;

public interface ScVocPinyinRepository  extends JpaRepository<ScVocPinyin, Integer> {
	
	@Query("SELECT DISTINCT a.pinyin FROM ScVocPinyin a WHERE a.pinyin LIKE :pinyinChar%")
	List<String> findByScPinyinChar(@Param("pinyinChar")String pinyinChar);
	
	Page<ScVocPinyin> findByPinyin(String pinyin, Pageable pageable);
}
