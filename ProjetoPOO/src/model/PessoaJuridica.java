package model;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String sobreNome, String email, Double telefone, DataNascimento dataNascimento, String sexo, Endereco endereco, String cnpj) {
		super(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco);
		this.cnpj = cnpj;
	}
}
