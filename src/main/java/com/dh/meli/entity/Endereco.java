package com.dh.meli.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(String logradouro, String numero, String complemento, String bairro) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
