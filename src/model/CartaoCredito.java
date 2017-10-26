package model;

import java.sql.Date;

public class CartaoCredito {
	private int num_cartao;
	private String bandeira;
	private Date data_validade;
	private int cod_seg;
	
	
	public CartaoCredito(int num_cartao, String bandeira, Date data_validade, int cod_seg) {
		this.num_cartao = num_cartao;
		this.bandeira = bandeira;
		this.data_validade = data_validade;
		this.cod_seg = cod_seg;
	}
	
	public int getNum_cartao() {
		return num_cartao;
	}
	public void setNum_cartao(int num_cartao) {
		this.num_cartao = num_cartao;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public Date getData_validade() {
		return data_validade;
	}
	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}
	public int getCod_seg() {
		return cod_seg;
	}
	public void setCod_seg(int cod_seg) {
		this.cod_seg = cod_seg;
	}
	
}
