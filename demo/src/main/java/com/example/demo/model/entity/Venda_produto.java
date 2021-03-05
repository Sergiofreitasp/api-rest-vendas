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
@Table(name = "venda_produto")
@EqualsAndHashCode
public class Venda_produto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vendaproduto;
	
	@ManyToOne
	@JoinColumn(name = "fk_venda_id", nullable = false)
	private Venda venda;
	
	@ManyToOne
	@JoinColumn(name = "fk_produto_id", nullable = false)
	private Produto produto;
	
	@Column(name = "qtd_venda")
	private int qtd_venda;
	
	@ManyToOne
	@JoinColumn(name = "fk_venda_valor", nullable = false)
	private Venda valor;
}
