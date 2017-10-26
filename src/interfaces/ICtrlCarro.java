package interfaces;

import model.Carro;

public interface ICtrlCarro {
	
	public void inserirCarro(Carro c);
	
	public void removerCarro(String chassi);
	
	public Carro consultarCarro(String chassi);
	
	public Carro atualizarCarro(Carro c);
}
