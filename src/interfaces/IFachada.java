package interfaces;

import controller.CtrlCarro;
import controller.CtrlCliente;
import model.Cliente;
import model.Carro;

public class IFachada implements ICtrlCarro, ICtrlCliente {
	private static IFachada iFachada;
	private CtrlCarro ctrlCarro;
	private CtrlCliente ctrlCliente;

	private static IFachada instance() {
		if (iFachada == null) {
			return new IFachada();
		} else
			return iFachada;
	}

	private IFachada() {
		this.ctrlCarro = new CtrlCarro();
		this.ctrlCliente = new CtrlCliente();
	}

	@Override
	public void inserirCliente(Cliente c) {
		ctrlCliente.inserirCliente(c);
	}

	@Override
	public void removerCliente(String cpf) {
		ctrlCliente.removerCliente(cpf);
	}

	@Override
	public Cliente consultarCliente(String cpf) {
		return ctrlCliente.consultarCliente(cpf);
	}

	@Override
	public Cliente atualizarCliente(Cliente c) {
		return null;
	}

	@Override
	public void inserirCarro(Carro c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerCarro(String cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public Carro consultarCarro(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carro atualizarCarro(Carro c) {
		// TODO Auto-generated method stub
		return null;
	}
}
