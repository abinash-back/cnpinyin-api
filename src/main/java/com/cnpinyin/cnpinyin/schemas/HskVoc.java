package com.cnpinyin.cnpinyin.schemas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hsk_voc")
public class HskVoc {
	//SELECT `hsk_id`, `hskw_id`, `hskw_char`, `hskw_pytone_m_ws`, `hskw_pytone_m`, `hskw_pytone_n_ws`, 
	//`hskw_pytone_n`, `hskw_pinyin`, `hskw_eng`, `hskw_level`, `hsk_sound`, `hskw_hints` FROM `hsk_voc` WHERE 1
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hsk_id")
	private int id;
	
	int hskw_id;
	
	@Column(name = "hskw_level")
	int level;
	
	String hskw_char;
	String hskw_pytone_m_ws;
	String hskw_pytone_m;
	String hskw_pytone_n_ws;
	String hskw_pytone_n;
	String hskw_pinyin;
	String hskw_eng;
	String hsk_sound;
	String hskw_hints;	
}
