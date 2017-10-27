package interfaces;

public interface IRepGeneric<E> {
	public void inserir(E c);
	public E consultar(String cod);
	public void remover(E e);
	public void atualizar(E e);
}
