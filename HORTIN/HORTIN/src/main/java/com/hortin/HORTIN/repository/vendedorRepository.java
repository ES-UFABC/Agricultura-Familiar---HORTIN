package com.hortin.HORTIN.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hortin.HORTIN.entity.Produto;
import com.hortin.HORTIN.entity.Vendedor;

public interface vendedorRepository extends JpaRepository<Vendedor, Long> {
}
