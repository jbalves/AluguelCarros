package model;

public class Grupo {
	private int cod_grupo;
	private String descricao;
	private Tipo tipo;
	private Carro carro;
	
	public Grupo(int cod_grupo, String descricao, Tipo tipo, Carro carro) {
		this.cod_grupo = cod_grupo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.carro = carro;
	}

	public int getCod_grupo() {
		return cod_grupo;
	}

	public void setCod_grupo(int cod_grupo) {
		this.cod_grupo = cod_grupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
}
