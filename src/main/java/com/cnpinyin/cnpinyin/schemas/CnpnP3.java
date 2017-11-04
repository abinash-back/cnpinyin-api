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
@Table(name = "cnpn_p3")
public class CnpnP3 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "md_id")
	private int id;
	
	@Column(name = "md_topics")
	String topics;
	String md_lesson;
	int md_level;
	String md_cnchar;
	String md_pytone;
	String md_pytone_ws;
	String md_pytone_n;
	String md_pytone_n_ws;
	String md_pinyin;
	String md_pinyin_ws;
	String md_engword;
	String md_sound;
	String md_hints;
	int md_multipinyin;
}
