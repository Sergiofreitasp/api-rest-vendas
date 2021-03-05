package com.example.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "logradouro")
@EqualsAndHashCode
public class Logradouro_Bairro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_logradouroBairro;
	
	@ManyToOne
	@JoinColumn(name = "fk_logradouro_id", nullable = false)
	private Logradouro log;
	
	@ManyToOne
	@JoinColumn(name = "fk_bairro_id", nullable = false)
	private Bairro bairro;
	
	@Column(name = "cep", length = 8, nullable = false)
	private char cep;
}
