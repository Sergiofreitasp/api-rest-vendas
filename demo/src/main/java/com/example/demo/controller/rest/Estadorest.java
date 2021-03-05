package com.example.demo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.Estado;
import com.example.demo.model.service.Estadoservice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@Api(value="API ESTADO")
@CrossOrigin(origins = "*")
@RequestMapping({"/estado"})
public class Estadorest {

	@Autowired
	private Estadoservice estadoservice;
	
	@GetMapping
	@ApiOperation(value="Listar todos os estados cadastrados")
	public List<Estado> todosEstados(){
		return estadoservice.listarTodosEstados();
	}
	
	@RequestMapping(value = "/buscar-por-nome/{nome}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseEntity<Estado> buscarEstadoPorNome(final @PathVariable String nome) {
		Estado retorno = estadoservice.buscarEstadoPorNome(nome);
		return  new ResponseEntity<>(retorno, HttpStatus.OK);
	}
	
	@GetMapping(path = {"/{id}"})
	@ApiOperation(value="Buscar estado por ID")
	public ResponseEntity<Estado> buscarPorId(@PathVariable Long id){
	   return estadoservice.BuscarId(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ApiOperation(value="Adicionar um novo estado")
	public Estado criarEstado(@RequestBody Estado estado) {
		return estadoservice.criarEstado(estado);
	}
	
	@PutMapping(value= {"/{id}"})
	@ApiOperation(value="Atualizar um estado")
	public ResponseEntity<Estado> update(@PathVariable("id") Long id, @RequestBody Estado estado) {
		return estadoservice.BuscarId(id)
				.map(record ->{
					record.setId_estado(estado.getId_estado());
					record.setNome(estado.getNome());
					Estado updated = estadoservice.criarEstado(record);
		            return ResponseEntity.ok().body(updated);
		           }).orElse(ResponseEntity.notFound().build());			
	}
	
	@DeleteMapping(path = {"/{id}"})
	@ApiOperation(value="Deletar um estado")
	public ResponseEntity <?> delete(@PathVariable long id){
		return estadoservice.BuscarId(id)
				.map(record -> {
					estadoservice.deletarPorId(id);
					return ResponseEntity.ok().build();
				}).orElse(ResponseEntity.notFound().build());
	}
}
