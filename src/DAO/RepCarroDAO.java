package DAO;

import java.util.ArrayList;
import java.util.Collection;

import interfaces.IRepCarro;
import model.Carro;

public class RepCarroDAO implements IRepCarro{
	Collection<Carro> listCarros = new ArrayList<Carro>();
	
	@Override
	public void inserir(Carro c) {
		listCarros.add(c);
	}

	@Override
	public Carro consultar(String cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Carro e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Carro e) {
		// TODO Auto-generated method stub
		
	}

	
}
