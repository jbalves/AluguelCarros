package controller;

import interfaces.ICtrlCarro;
import interfaces.IRepCliente;
import model.Cliente;

public class CtrlCliente implements ICtrlCarro {
	
	IRepCliente iRepCliente;

	public CtrlCliente(IRepCliente iRepCliente) {
		this.iRepCliente = iRepCliente;
	}

	@Override
	public void inserirCliete(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerCliete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultarCliete(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente atualizarCliete(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
