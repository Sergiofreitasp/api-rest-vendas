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
@Table(name = "compra_produto")
@EqualsAndHashCode
public class Compra_produto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_compraproduto;
	
	@ManyToOne
	@JoinColumn(name = "fk_compra_id", nullable = false)
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name = "fk_produto_id", nullable = false)
	private Produto produto;
	
	@Column(name = "qtd_compra")
	private int qtd_compra;
	
	@ManyToOne
	@JoinColumn(name = "fk_compra_valor", nullable = false)
	private Compra valor; 
}
