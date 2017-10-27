package model;

import java.sql.Date;

import generics.Entity;

public class Carro extends Entity{
	private String chassi;
	private String modelo;
	private int ano;
	private String kmRodados;
	private String numPortas;
	private EstadoCarro estado;
	
	public Carro(String chassi, String modelo, int ano, String kmRodados, String numPortas, EstadoCarro estado) {
		this.chassi = chassi;
		this.modelo = modelo;
		this.ano = ano;
		this.kmRodados = kmRodados;
		this.numPortas = numPortas;
		this.estado = estado;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(String kmRodados) {
		this.kmRodados = kmRodados;
	}

	public String getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(String numPortas) {
		this.numPortas = numPortas;
	}

	public EstadoCarro getEstado() {
		return estado;
	}

	public void setEstado(EstadoCarro estado) {
		this.estado = estado;
	}
		
}
