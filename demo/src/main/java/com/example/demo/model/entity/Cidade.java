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
@Table(name = "cidade")
@EqualsAndHashCode
public class Cidade {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cidade;
	
	@Column(name = "nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "fk_uf_id", nullable = false)
	private Estado uf;
}
