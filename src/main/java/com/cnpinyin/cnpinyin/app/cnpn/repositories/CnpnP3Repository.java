package com.cnpinyin.cnpinyin.app.cnpn.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnpinyin.cnpinyin.schemas.CnpnP3;

public interface CnpnP3Repository extends JpaRepository<CnpnP3, Integer> {
	
	@Query("SELECT DISTINCT a.topics FROM CnpnP3 a")
	public List<String> findDistinctTopics();
	
	public int countByTopics(String topic);
	
	Page<CnpnP3> findByTopics(String topic, Pageable pageable);
}
