package com.dh.meli.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Beleza extends Produto{

	private String quantidade;
	private String unidadeMedida;
	
	public Beleza(String quantidade, String unidadeMedida) {
		super();
		this.setQuantidade(quantidade);
		this.setUnidadeMedida(unidadeMedida);
	}
	
	public Beleza(String quantidade, String unidadeMedida, String nome, BigDecimal preco) {
		super();
		super.setNome(nome);
		super.setPreco(preco);
		this.setQuantidade(quantidade);
		this.setUnidadeMedida(unidadeMedida);
	}
	
	public Beleza() {
		// TODO Auto-generated constructor stub
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
}
