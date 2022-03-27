package com.hortin.HORTIN.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hortin.HORTIN.entity.Produto;
import com.hortin.HORTIN.entity.Vendedor;

public interface produtoRepository extends JpaRepository<Produto, Long>{
	List<Produto> findByVendedorId(Long id);

}
