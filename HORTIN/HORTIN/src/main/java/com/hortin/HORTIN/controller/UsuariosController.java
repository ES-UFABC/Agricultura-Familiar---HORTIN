package com.hortin.HORTIN.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.hortin.HORTIN.entity.Produto;
import com.hortin.HORTIN.entity.Vendedor;
import com.hortin.HORTIN.repository.vendedorRepository;

@Controller
@RequestMapping("/usuario")
public class UsuariosController {
	
	@Autowired
	private vendedorRepository vendedorRepo;
		
	@PostMapping()
	public ResponseEntity<Vendedor> insereVendedor(@RequestBody Vendedor vendedor, UriComponentsBuilder uriBuilder){
		System.out.println("a");
		System.out.println(vendedor.toString());
		vendedorRepo.save(vendedor);
	
		URI uri = uriBuilder.path("/vendedor/{id}").buildAndExpand(vendedor.getId()).toUri();
		
		return ResponseEntity.created(uri).body(vendedor);
	}
	

	@GetMapping("/login")
	public ResponseEntity<Vendedor> verificaLogin(@RequestParam String user,@RequestParam String senha){
		System.out.println(user + senha);
		if(vendedorRepo.verificaLogin(senha, user).isEmpty()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
