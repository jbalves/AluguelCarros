package teste;

import facede.Fachada;
import model.Carro;
import model.CartaoCredito;
import model.Cliente;
import model.Endereco;
import model.EstadoCarro;

public class Teste01 {
	public static void main(String[] args) {
		Fachada fachada = new Fachada();
		fachada.instance();
		
		Carro carro = new Carro("AABBCCDDEEFFGGHHIIJJ", "Gol", 2017, "100", "4", EstadoCarro.NOVO);
		Endereco endereco = new Endereco("69074730","rua rosa rezende","137","");
		
		CartaoCredito cartaCredito = new CartaoCredito(num_cartao, bandeira, data_validade, cod_seg);
		Cliente cliente = new Cliente("77625064204", "12345678", "jeferson barros", 32, 2, endereco, cartaoCredito)
		
	}
}
