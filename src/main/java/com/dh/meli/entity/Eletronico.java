package com.dh.meli.entity;

import javax.persistence.Entity;

@Entity
public class Eletronico extends Produto{

	private int potencia;
	
	public Eletronico() {
		// TODO Auto-generated constructor stub
	}

	public Eletronico(int potencia) {
		super();
		this.setPotencia(potencia);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
}
