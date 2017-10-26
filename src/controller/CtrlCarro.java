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
	public void inserirCarro(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerCarro(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultarCarro(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente atualizarCarro(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}	
		
}
