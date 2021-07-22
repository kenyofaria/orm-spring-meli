package com.dh.meli.entity;

import javax.persistence.Entity;

@Entity
public class Automotivo extends Produto{

	
	private String modeloVeiculo;
	
	public Automotivo() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Automotivo(String modeloVeiculo) {
		super();
		this.modeloVeiculo = modeloVeiculo;
	}



	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	
	
	
}
