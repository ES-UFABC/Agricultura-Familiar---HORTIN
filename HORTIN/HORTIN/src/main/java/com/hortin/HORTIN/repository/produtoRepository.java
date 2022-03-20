package com.hortin.HORTIN.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hortin.HORTIN.entity.Produto;

public interface produtoRepository extends JpaRepository<Produto, Long>{

}
