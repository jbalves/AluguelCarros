package interfaces;

import model.Cliente;

public interface ICtrlCliente extends ICrud<Cliente>{
	
	/*
	public void inserirCliente(Cliente c);
	
	public void removerCliente(String cpf);
	
	public Cliente consultarCliente(String cpf);
	
	public Cliente atualizarCliente(Cliente c);
	*/
	
	public Cliente consultarCPF(String cpf);
	
}
