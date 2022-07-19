package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.cep = "00000000";
		//dados do endereço
		
		Cliente cliente = new Cliente();
		
		//dados do cliente
		
		/*if(cliente.enderecos == null) { // inicializando para conseguir add um endereço, precisa conferir primeiro se o mesmo é nulo.
			cliente.enderecos = new ArrayList<Endereco>();
		}*/
		
		try {	//força o tratamento
			cliente.addEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		} catch (Exception e) {
			System.out.println("Houve um erro ao adicionar o endereco: " + e.getMessage());
		}
	}

}
