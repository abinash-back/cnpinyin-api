package com.cnpinyin.cnpinyin.app.cnpn.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cnpinyin.cnpinyin.schemas.CnpnP2;

public interface CnpnP2Repository extends JpaRepository<CnpnP2, Integer> {
	
	@Query("SELECT DISTINCT a.topics FROM CnpnP2 a")
	public List<String> findDistinctTopics();
	
	public int countByTopics(String topic);
	
	Page<CnpnP2> findByTopics(String topic, Pageable pageable);
}
