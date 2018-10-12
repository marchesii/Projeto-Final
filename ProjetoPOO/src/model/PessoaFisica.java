package model;

public class PessoaFisica extends Pessoa{
	
	private String cpf;
	
	public PessoaFisica(String nome, String sobreNome, String email, Integer telefone, DataNascimento dataNascimento, String sexo, Endereco endereco, String cpf) {
		super(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco);
		this.cpf = cpf;
	}

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return null;
	}

}
