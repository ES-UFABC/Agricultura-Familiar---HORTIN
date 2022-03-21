package com.hortin.HORTIN.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String UserName;
	private String Email;
	private char TipoUsuario;
	private String Celular;

	/*endereco*/
	private String EndereçoRua;
	private String EnderecoNumero;
	private String EnderecoComplemento;

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

	private String EndereçoBairro;
	private String EndereçoCidade;
	private String EndereçoEstado;
	private String EndereçoPais;
	private String CEP;

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
	public char getTipoUsuario() {
		return TipoUsuario;
	}
	public void setTipoUsuario(char tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getEndereçoRua() {
		return EndereçoRua;
	}
	public void setEndereçoRua(String endereçoRua) {
		EndereçoRua = endereçoRua;
	}
	public String getEndereçoBairro() {
		return EndereçoBairro;
	}
	public void setEndereçoBairro(String endereçoBairro) {
		EndereçoBairro = endereçoBairro;
	}
	public String getEndereçoCidade() {
		return EndereçoCidade;
	}
	public void setEndereçoCidade(String endereçoCidade) {
		EndereçoCidade = endereçoCidade;
	}
	public String getEndereçoEstado() {
		return EndereçoEstado;
	}
	public void setEndereçoEstado(String endereçoEstado) {
		EndereçoEstado = endereçoEstado;
	}
	public String getEndereçoPais() {
		return EndereçoPais;
	}
	public void setEndereçoPais(String endereçoPais) {
		EndereçoPais = endereçoPais;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", UserName=" + UserName + ", Email=" + Email + ", TipoUsuario=" + TipoUsuario
				+ ", Celular=" + Celular + ", EndereçoRua=" + EndereçoRua + ", EnderecoNumero=" + EnderecoNumero
				+ ", EnderecoComplemento=" + EnderecoComplemento + ", EndereçoBairro=" + EndereçoBairro
				+ ", EndereçoCidade=" + EndereçoCidade + ", EndereçoEstado=" + EndereçoEstado + ", EndereçoPais="
				+ EndereçoPais + ", CEP=" + CEP + "]";
	}



}
