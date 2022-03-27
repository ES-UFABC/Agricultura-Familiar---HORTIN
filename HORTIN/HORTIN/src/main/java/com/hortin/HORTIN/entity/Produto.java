package com.hortin.HORTIN.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String NomeProduto;
	private Double ValorProduto;
	private String DescricaoProduto;
	@ManyToOne
	@NotNull
	@JsonIgnore
	private Vendedor vendedor;

	
	
	public Produto() {
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Long getId_produto() {
		return id;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public Double getValorProduto() {
		return ValorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		ValorProduto = valorProduto;
	}
	public String getDescricaoProduto() {
		return DescricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		DescricaoProduto = descricaoProduto;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", NomeProduto=" + NomeProduto + ", ValorProduto=" + ValorProduto
				+ ", DescricaoProduto=" + DescricaoProduto + "]";
	}
	
	
}
