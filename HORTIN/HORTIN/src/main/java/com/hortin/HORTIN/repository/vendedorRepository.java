package com.hortin.HORTIN.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hortin.HORTIN.entity.Produto;
import com.hortin.HORTIN.entity.Vendedor;

public interface vendedorRepository extends JpaRepository<Vendedor, Long> {
	
	@Query("FROM Vendedor V WHERE V.Senha = ?1 and V.User = ?2")
	Optional<Vendedor> verificaLogin(String senha, String username);
}
