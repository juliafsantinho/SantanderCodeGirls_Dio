package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	

	public String numCartao;
	private List<Endereco> enderecos;
	
	
	public void addEndereco(Endereco endereco) {// encapsulamento, não quero que ele adicione nada que esteja vazio.
		if (endereco == null) {
			throw new NullPointerException("O endereço não pode ser nulo.");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("O CEP não pode ser nulo.");
		}
		getEnderecos().add(endereco);
	}

	/*public Endereco endereco;
	public Endereco enderecoEntrega;		//não é a melhor prática, não está trabalhando OO.
	public Endereco enderecoTrabalho;
	*/
	

	public List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}

	
}
