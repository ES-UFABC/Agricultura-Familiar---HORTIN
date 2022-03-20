package com.hortin.HORTIN.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.hortin.HORTIN.entity.Produto;
import com.hortin.HORTIN.repository.produtoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private produtoRepository repo;
	
	@PostMapping()
	public ResponseEntity<Produto> insereProduto(@RequestBody Produto produto, UriComponentsBuilder uriBuilder){
		System.out.println(produto.toString());
		repo.save(produto);
		
		URI uri = uriBuilder.path("/produtos/{id}").buildAndExpand(produto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(produto);
	}
}
