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
@Table(name = "cliente")
@EqualsAndHashCode
public class Cliente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf_cnpj", length = 15, nullable = false)
	private char cpf_cnpj;
	
	@Column(name = "tipo", length = 1, nullable = false)
	private String tipo; //restriçoes para aceitar so F ou J
	
	@Column(name = "endereço")
	private String endereço;
}
