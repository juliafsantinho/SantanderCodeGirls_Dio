package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	

	public String numCartao;
	private List<Endereco> enderecos;
	
	
	public void addEndereco(Endereco endereco) {// encapsulamento, n�o quero que ele adicione nada que esteja vazio.
		if (endereco == null) {
			throw new NullPointerException("O endere�o n�o pode ser nulo.");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("O CEP n�o pode ser nulo.");
		}
		getEnderecos().add(endereco);
	}

	/*public Endereco endereco;
	public Endereco enderecoEntrega;		//n�o � a melhor pr�tica, n�o est� trabalhando OO.
	public Endereco enderecoTrabalho;
	*/
	

	public List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}

	
}
