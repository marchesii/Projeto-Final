package model;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String sobreNome, String email, Integer telefone, DataNascimento dataNascimento, String sexo, Endereco endereco, String cnpj) {
		super(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco);
		this.cnpj = cnpj;
	}

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return null;
	}	
}
