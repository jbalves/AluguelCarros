package DAO;

import java.util.ArrayList;
import java.util.Collection;

import interfaces.IRepCliente;
import model.Cliente;

public class RepClienteDAO implements IRepCliente {
	Collection<Cliente> listClientes = new ArrayList<Cliente>();

	@Override
	public void inserir(Cliente c) {
		listClientes.add(c);
	}

	@Override
	public Cliente consultar(String cod) {
		for (int i = 0; i < listClientes.size(); i++) {
			if (cod == ((ArrayList<Cliente>) listClientes).get(i).getId())
				return ((ArrayList<Cliente>) listClientes).get(i);
		}
		return null;
	}

	@Override
	public void remover(Cliente e) {
		for (int i = 0; i < listClientes.size(); i++) {
			if (e.getId() == ((ArrayList<Cliente>) listClientes).get(i).getId())
				((ArrayList<Cliente>) listClientes).remove(i);
		}
	}

	@Override
	public void atualizar(Cliente e) {
		for (int i = 0; i < listClientes.size(); i++) {
			if (e.getId() == ((ArrayList<Cliente>) listClientes).get(i).getId()) {
				((ArrayList<Cliente>) listClientes).set(i, e);
			}
		}

	}

	@Override
	public Cliente consultaCPF(String cpf) {
		for (int i = 0; i < listClientes.size(); i++) {
			if (cpf == ((ArrayList<Cliente>) listClientes).get(i).getCpf())
				return ((ArrayList<Cliente>) listClientes).get(i);
		}
		return null;
	}

}
