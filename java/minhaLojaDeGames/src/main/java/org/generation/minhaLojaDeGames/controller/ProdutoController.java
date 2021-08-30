package org.generation.minhaLojaDeGames.controller;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Produto;
import org.generation.minhaLojaDeGames.repository.ProdutoRepository;
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

@RestController
@RequestMapping("/produtos")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ProdutoController {
	//REPOSITORY
	@Autowired
	private ProdutoRepository repository;
	
	//GET ALL
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//GET BY ID
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.badRequest().build());
	}
	
	//GET BY TITULO
	@GetMapping("titulo/{titulo}")
	public ResponseEntity<List<Produto>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository
				.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	//POST
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(produto));
	}
	
	//PUT
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(produto));
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
