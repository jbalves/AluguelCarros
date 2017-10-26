package controller;

import interfaces.ICtrlCarro;
import interfaces.IRepCarro;
import model.Cliente;

public class CtrlCarro implements ICtrlCarro{
	
	IRepCarro iRepCarro;
	
	public CtrlCarro(IRepCarro iRepCarro) {
		this.iRepCarro = iRepCarro;
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
