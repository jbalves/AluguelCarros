package interfaces;

import generics.IRepGeneric;
import model.Cliente;

public interface IRepCliente extends IRepGeneric<Cliente> {
	public Cliente consultaCPF(String cpf);
}
