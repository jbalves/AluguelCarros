package interfaces;

public interface ICrud <E> {
	public void inserir(E e);
	public E consultar (String cod);
	public void remover (E e);
	public void atualizar (E e);
}
