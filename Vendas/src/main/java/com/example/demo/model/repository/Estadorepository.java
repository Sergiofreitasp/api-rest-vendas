package com.example.demo.model.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Estadorepository extends JpaRepository<Estado, Long>{

	Estado findByNome(String nome);
	
	
	
}
