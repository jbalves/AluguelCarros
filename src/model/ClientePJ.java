package model;

public class ClientePJ extends Cliente{
	private int cnpj;
	private String razaoSocial;
	
	public ClientePJ(String cpf, String cnh, String nome, int idade, int tempoHabilitacao, Endereco endereco,
			CartaoCredito cartaoCredito, int cnpj, String razaoSocial) {
		super(cpf, cnh, nome, idade, tempoHabilitacao, endereco, cartaoCredito);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	
}
