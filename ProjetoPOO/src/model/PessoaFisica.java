package model;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica(String nome, String sobreNome, String email, Double telefone, DataNascimento dataNascimento, String sexo, Endereco endereco, String cpf) {
		super(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco);
		this.cpf = cpf;
	}	
}
