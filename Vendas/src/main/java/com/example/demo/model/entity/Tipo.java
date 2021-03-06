package com.example.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "tipo")
@EqualsAndHashCode
public class Tipo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descrição")
	private String descrição;
}
