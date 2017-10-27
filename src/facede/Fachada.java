package facede;


import controller.CtrlCarro;
import controller.CtrlCliente;
import model.Carro;
import model.Cliente;

public class Fachada {
	private static Fachada fachada;
	private CtrlCarro ctrlCarro;
	private CtrlCliente ctrlCliente;

	private static Fachada instance() {
		if (fachada == null) {
			return new Fachada();
		} else
			return fachada;
	}

	public Fachada() {
		this.ctrlCarro = new CtrlCarro();
		this.ctrlCliente = new CtrlCliente();
	}
	
	/*
	 *  Carro Controller
	 */
	
	public void inserirCarro(Carro e) {
		this.ctrlCarro.inserir(e);
	}
	
	public Carro consultarCarro(String cod) {
		return this.ctrlCarro.consultar(cod); 
	}
	
	public void removerCarro (Carro e) {
		this.ctrlCarro.remover(e);
	}
	
	public void atualizarCarro (Carro e) {
		this.ctrlCarro.atualizar(e);
	}
	
	/*
	 *  Cliente Controller
	 */
	
	public void inserirCliente(Cliente e) {
		this.ctrlCliente.inserir(e);
	}
	
	public Cliente consultarCliente(String cod) {
		return this.ctrlCliente.consultar(cod); 
	}
	
	public void removerCliente (Cliente e) {
		this.ctrlCliente.remover(e);
	}
	
	public void atualizarCliente (Cliente e) {
		this.ctrlCliente.atualizar(e);
	}
}
