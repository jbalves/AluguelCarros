package DAO;

import java.util.ArrayList;
import java.util.Collection;

import interfaces.IRepCarro;
import model.Carro;

public class RepCarroDAO implements IRepCarro {
	Collection<Carro> listCarros = new ArrayList<Carro>();

	@Override
	public void inserir(Carro c) {
		listCarros.add(c);
	}

	@Override
	public Carro consultar(String cod) {
		for(int i=0;i<listCarros.size();i++) {
			if(cod == ((ArrayList<Carro>) listCarros).get(i).getId()) 
				return ((ArrayList<Carro>) listCarros).get(i);
		}
		return null;
	}

	@Override
	public void remover(Carro e) {
		for (int i = 0; i < listCarros.size(); i++) {
			if (e.getId() == ((ArrayList<Carro>) listCarros).get(i).getId())
				((ArrayList<Carro>) listCarros).remove(i);
		}
	}

	@Override
	public void atualizar(Carro e) {
		for (int i = 0; i < listCarros.size(); i++) {
			if (e.getId() == ((ArrayList<Carro>) listCarros).get(i).getId()) {
				((ArrayList<Carro>) listCarros).set(i, e);
			}
		}

	}

}
