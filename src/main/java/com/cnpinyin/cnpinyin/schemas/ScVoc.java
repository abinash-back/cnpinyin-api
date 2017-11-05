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
@Table(name = "sc_voc")
public class ScVoc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SC_id")
	private int id;
	
	String SC_char;
	String SC_pytone;
	String SC_pytone_ws;
	String SC_pytone_n;
	String SC_pytone_n_ws;
	String SC_pinyin;
	String SC_pinyin_ws;
	String SC_eng;
	String SC_sound;
	String SC_hints;
	String SC_radical;
	int SC_stroke_no;
	String SC_index;
}
