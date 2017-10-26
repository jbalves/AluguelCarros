package model;

public class ClienteAssociado extends Cliente {

	private int num_cartao;
	private String nome_social;

	public ClienteAssociado(int cpf, String cnh, String nome, int idade, int tempoHabilitacao, Endereco endereco,
			CartaoCredito cartaoCredito) {
		super(cpf, cnh, nome, idade, tempoHabilitacao, endereco, cartaoCredito);
	}

	public int getNum_cartao() {
		return num_cartao;
	}

	public void setNum_cartao(int num_cartao) {
		this.num_cartao = num_cartao;
	}

	public String getNome_social() {
		return nome_social;
	}

	public void setNome_social(String nome_social) {
		this.nome_social = nome_social;
	}
	
	

}
