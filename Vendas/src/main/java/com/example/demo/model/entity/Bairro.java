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
@Table(name = "Bairro")
@EqualsAndHashCode
public class Bairro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_bairro;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Numero")
	private int numero;
}
