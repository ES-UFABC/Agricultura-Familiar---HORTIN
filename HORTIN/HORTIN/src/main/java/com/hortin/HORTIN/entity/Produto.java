package com.hortin.HORTIN.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String NomeProduto;
	private Double ValorProduto;
	private String DescricaoProduto;

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
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", NomeProduto=" + NomeProduto + ", ValorProduto=" + ValorProduto
				+ ", DescricaoProduto=" + DescricaoProduto + "]";
	}
	
	
}
