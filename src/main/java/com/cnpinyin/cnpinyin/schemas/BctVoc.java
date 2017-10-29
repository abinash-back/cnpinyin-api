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
@Table(name = "bct_voc")
public class BctVoc {
	
	//SELECT `bct_id`, `bct_char`, `bct_pytone`, `bct_pytone_ws`, `bct_pytone_n`, `bct_pytone_n_ws`, `bct_pinyin`,
	//`bct_pinyin_ws`, `bct_eng`, `bct_sound`, `bct_hints`, `bct_type` FROM `bct_voc` WHERE 1
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bct_id")
	private int id;
	
	String bct_char;
	String bct_pytone;
	String bct_pytone_ws;
	String bct_pytone_n;
	String bct_pytone_n_ws;
	String bct_pinyin;
	String bct_pinyin_ws;
	String bct_eng;
	String bct_sound;
	String bct_hints;
	String bct_type;
}
