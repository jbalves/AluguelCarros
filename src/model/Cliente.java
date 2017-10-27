package model;

import generics.Entity;

public class Cliente extends Entity{
	private String cpf;
	private String cnh;
	private String nome;
	private int idade;
	private int tempoHabilitacao;
	private Endereco endereco;
	private CartaoCredito cartaoCredito;
	
	public Cliente(String cpf, String cnh, String nome, int idade, int tempoHabilitacao, Endereco endereco,
			CartaoCredito cartaoCredito) {
		this.cpf = cpf;
		this.cnh = cnh;
		this.nome = nome;
		this.idade = idade;
		this.tempoHabilitacao = tempoHabilitacao;
		this.endereco = endereco;
		this.cartaoCredito = cartaoCredito;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTempoHabilitacao() {
		return tempoHabilitacao;
	}
	public void setTempoHabilitacao(int tempoHabilitacao) {
		this.tempoHabilitacao = tempoHabilitacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	
}
