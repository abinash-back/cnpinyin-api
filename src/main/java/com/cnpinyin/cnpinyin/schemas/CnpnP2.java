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
@Table(name = "cnpn_p2")
public class CnpnP2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wp2_id")
	private int id;
	
	@Column(name = "wp2_topics")
	String topics;
	int wp2_level;
	String wp2_char;
	String wp2_pytone;
	String wp2_pytone_ws;
	String wp2_pytone_n;
	String wp2_pytone_n_ws;
	String wp2_pinyin;
	String wp2_pinyin_ws;
	String wp2_eng;
	String wp2_sound;
	String wp2_hints;	
}
