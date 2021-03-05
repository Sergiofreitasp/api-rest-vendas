package com.example.demo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "compra")
@EqualsAndHashCode
public class Compra {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_compra;
	
	@ManyToOne
	@JoinColumn(name = "fk_produto_id", nullable = false)
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "fk_fornecedor_id", nullable = false)
	private Fornecedor fornecedor;
	
	@Column(name = "valor")
	private long valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date data;
}
