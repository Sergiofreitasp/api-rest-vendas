package com.example.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Endereco")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;
	
	@ManyToOne
	@JoinColumn(name = "fk_logradouro_id", nullable = false)
	private Logradouro_Bairro logradouro;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "ativo")
	private boolean ativo;
	
	@ManyToOne
	@JoinColumn(name = "fk_cidade_id", nullable = false)
	private Cidade cidade;
	
	
}
