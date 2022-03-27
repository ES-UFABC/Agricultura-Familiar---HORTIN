package com.hortin.HORTIN.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Usuario {

	private String UserName;
	private String Email;
	private String Celular;

	/*endereco*/
	private String EnderecoRua;
	private String EnderecoNumero;
	private String EnderecoComplemento;

	private String EnderecoBairro;
	private String EnderecoCidade;
	private String EnderecoEstado;
	private String EnderecoPais;
	private String CEP;

	public String getEnderecoNumero() {
		return EnderecoNumero;
	}
	public void setEnderecoNumero(String enderecoNumero) {
		EnderecoNumero = enderecoNumero;
	}
	public String getEnderecoComplemento() {
		return EnderecoComplemento;
	}
	public void setEnderecoComplemento(String enderecoComplemento) {
		EnderecoComplemento = enderecoComplemento;
	}

	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getEnderecoRua() {
		return EnderecoRua;
	}
	public void setEnderecoRua(String endereçoRua) {
		EnderecoRua = endereçoRua;
	}
	public String getEnderecoBairro() {
		return EnderecoBairro;
	}
	public void setEnderecoBairro(String enderecoBairro) {
		EnderecoBairro = enderecoBairro;
	}
	public String getEnderecoCidade() {
		return EnderecoCidade;
	}
	public void setEnderecoCidade(String enderecoCidade) {
		EnderecoCidade = enderecoCidade;
	}
	public String getEnderecoEstado() {
		return EnderecoEstado;
	}
	public void setEnderecoEstado(String enderecoEstado) {
		EnderecoEstado = enderecoEstado;
	}
	public String getEnderecoPais() {
		return EnderecoPais;
	}
	public void setEnderecoPais(String enderecoPais) {
		EnderecoPais = enderecoPais;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
}
