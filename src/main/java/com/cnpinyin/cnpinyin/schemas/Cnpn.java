package com.cnpinyin.cnpinyin.schemas;

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
@Table(name = "cnpn")
public class Cnpn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	String lesson;
	String topics;
	int level;
	String cnchar;
	String pytone_ws;
	String pytone_n_ws;
	String pytone_n;
	String pinyin;
	String pinyin_ws;
	String engword;
	String wp_sound;
	String hints;	
}
