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
@Table(name = "venda")
@EqualsAndHashCode
public class Venda {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_venda;
	
	@ManyToOne
	@JoinColumn(name = "fk_cliente_id", nullable = false)
	private Cliente cliente;
	
	@Column(name = "valor")
	private long valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date data;
	
}
