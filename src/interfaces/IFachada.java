package interfaces;

import controller.CtrlCarro;
import controller.CtrlCliente;
import model.Cliente;
import model.Carro;

public class IFachada {
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
}
