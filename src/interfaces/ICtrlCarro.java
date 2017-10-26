package interfaces;

import model.Cliente;

public interface ICtrlCarro {
	
	public void inserirCarro(Cliente c);
	
	public void removerCarro(String cpf);
	
	public Cliente consultarCarro(String cpf);
	
	public Cliente atualizarCarro(String cpf);
}
