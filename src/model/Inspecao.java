package model;

import java.sql.Date;

public class Inspecao {
	private int cod_inspecao;
	private Date data_inspecao;
	private EstadoInsp estadoInspecao;
	private Carro carro;
	
	public Inspecao(int cod_inspecao, Date data_inspecao, EstadoInsp estadoInspecao, Carro carro) {
		this.cod_inspecao = cod_inspecao;
		this.data_inspecao = data_inspecao;
		this.estadoInspecao = estadoInspecao;
		this.carro = carro;
	}

	public int getCod_inspecao() {
		return cod_inspecao;
	}

	public void setCod_inspecao(int cod_inspecao) {
		this.cod_inspecao = cod_inspecao;
	}

	public Date getData_inspecao() {
		return data_inspecao;
	}

	public void setData_inspecao(Date data_inspecao) {
		this.data_inspecao = data_inspecao;
	}

	public EstadoInsp getEstadoInspecao() {
		return estadoInspecao;
	}

	public void setEstadoInspecao(EstadoInsp estadoInspecao) {
		this.estadoInspecao = estadoInspecao;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
}
