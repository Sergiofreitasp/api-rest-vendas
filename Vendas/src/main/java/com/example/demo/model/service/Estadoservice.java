package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Estado;
import com.example.demo.model.repository.Estadorepository;

@Service
public class Estadoservice {

	@Autowired
	private Estadorepository estadorepository;
	
	public List<Estado> listarTodosEstados() {
		return estadorepository.findAll();
	}
	
	public Estado buscarEstadoPorNome(String nome) {
		return estadorepository.findByNome(nome);
	}
	
	public Estado criarEstado(Estado estado) {
		return estadorepository.save(estado);
	}
	
	public Optional<Estado> BuscarId(Long id) {
		return estadorepository.findById(id);
	}
	
	public void deletarPorId(Long id) {
		estadorepository.deleteById(id);
	}
}
