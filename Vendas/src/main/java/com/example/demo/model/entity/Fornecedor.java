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
@Table(name = "fornecedor")
@EqualsAndHashCode
public class Fornecedor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fornecedor;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cnpj", length = 14, nullable = false)
	private char cnpj;
	
	@ManyToOne
	@JoinColumn(name = "fk_endereco_id", nullable = false)
	private Endereco endereco;
}
