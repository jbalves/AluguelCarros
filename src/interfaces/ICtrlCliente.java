package interfaces;

import model.Cliente;

public interface ICtrlCliente {
	public void inserirCliente(Cliente c);
	
	public void removerCliente(String cpf);
	
	public Cliente consultarCliente(String cpf);
	
	public Cliente atualizarCliente(Cliente c);
}
