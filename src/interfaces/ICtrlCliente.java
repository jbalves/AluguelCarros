package interfaces;

import model.Cliente;

public interface ICtrlCliente {
	public void inserirCliete(Cliente c);
	
	public void removerCliete(String cpf);
	
	public Cliente consultarCliete(String cpf);
	
	public Cliente atualizarCliete(String cpf);
}
