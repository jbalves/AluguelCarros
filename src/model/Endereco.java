package model;

public class Endereco {
	private String CEP;
	private String rua;
	private String numero;
	private String complemento;
	
	public Endereco(String cEP, String rua, String numero, String complemento) {
		CEP = cEP;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public Endereco() {
	}
	
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		CEP = CEP;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
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
	
	
}
