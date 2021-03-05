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
@Table(name = "estoque")
@EqualsAndHashCode
public class Estoque {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_estoque;
	
	@Column(name = "qtd_venda")
	private int qtd_venda;
	
	@Column(name = "qtd_compra")
	private int qtd_compra;
}

