package com.destinos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.destinos.models.Destino;
import com.destinos.repositories.DestinoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Api Rest CodeAndTravel Destinos")
@CrossOrigin(origins = "*")
public class DestinoController {
	
	@Autowired
	DestinoRepository destinoRepo;
	
	@GetMapping(value="/destino")
	@ApiOperation(value = "retorna uma lista de Destinos")
	public List<Destino> listaDestinos(){
		return destinoRepo.findAll();
	}
	
	@GetMapping(value="/destino/{id}")
	@ApiOperation(value = "Retornaaa um unico destino")
	public Destino listaDestinoById(@PathVariable(value="id") long id){
		return destinoRepo.findById(id).get();
	}
	
	@GetMapping("/destino/nome/{nome}")
	@ApiOperation(value = "Retorna um Destino específicoss")
	public ResponseEntity<List<Destino>> getDestinoByNome(@PathVariable(value="nome") String nome){
		List<Destino> destino = destinoRepo.findByNome(nome);
		return new ResponseEntity<List<Destino>>(destino, HttpStatus.OK);
	}
	
	@PostMapping(value="/destino")
	public Destino criaDestino(@RequestBody Destino destino) {
		return destinoRepo.save(destino);
	}
	
	@PutMapping(value="/destino")
	@ApiOperation(value = "Atualiza um destino")
	public Destino alteraDestino(@RequestBody Destino destino) {
		return destinoRepo.save(destino);
	}
	
	@DeleteMapping(value="/destino/{id}")
	@ApiOperation(value = "Deleta um destino")
	public void deletaDestino(@PathVariable long id) {
		destinoRepo.deleteById(id);
	}
}


