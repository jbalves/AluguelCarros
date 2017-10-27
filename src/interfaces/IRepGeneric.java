package interfaces;

import model.Cliente;

public interface IRepGeneric<E> {
	public void inserir(Cliente c);
	public E consultar(String cod);
	public void remover(E e);
	public void atualizar(E e);
}
