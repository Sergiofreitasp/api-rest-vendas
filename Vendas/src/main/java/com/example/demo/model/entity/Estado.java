package com.example.demo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Persistable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "estado")
@EqualsAndHashCode
public class Estado implements Serializable {
	
	private static final long serialVersionUID = 1L;
			
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_estado;
	
	@Column(name = "nome")
	private String nome;
	
	
}
