package poo.model;

public class Endereco extends Object {
	
	public enum TipoEndereco {
		RESIDENCIAL, 
		ENTREGA,
		TRABALHO
		}

	public String endereco;
	public String numero;
	public String complemento;
	public String bairro;
	public String cep;
	public String cidade;
	public String estado;
	
}
