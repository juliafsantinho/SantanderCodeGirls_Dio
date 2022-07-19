package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.cep = "00000000";
		//dados do endere�o
		
		Cliente cliente = new Cliente();
		
		//dados do cliente
		
		/*if(cliente.enderecos == null) { // inicializando para conseguir add um endere�o, precisa conferir primeiro se o mesmo � nulo.
			cliente.enderecos = new ArrayList<Endereco>();
		}*/
		
		try {	//for�a o tratamento
			cliente.addEndereco(endereco);
			System.out.println("Endere�o adicionado com sucesso!");
		} catch (Exception e) {
			System.out.println("Houve um erro ao adicionar o endereco: " + e.getMessage());
		}
	}

}
