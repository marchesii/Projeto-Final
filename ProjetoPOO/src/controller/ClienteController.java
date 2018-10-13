package controller;

import model.DataNascimento;
import model.Endereco;
import model.Pessoa;
import model.PessoaFisica;
import model.array.ArrayCliente;

public class ClienteController {
	
	private ArrayCliente arrayCliente;
	private DataNascimento dataNascimento;
	private Endereco endereco;
	private PessoaFisica cliente;
	
	public ClienteController() {
		arrayCliente = ArrayCliente.getInstance();
	}
	
	/**
	 * Método para cadastrar um Cliente.
	 * @param nome
	 * @param sobreNome
	 * @param documento
	 * @param email
	 * @param telefone
	 * @param diaNascimento
	 * @param mesNascimento
	 * @param anoNascimento
	 * @param sexo
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param pessoa
	 * @return
	 */
	public String cadastrarCliente(String nome, String sobreNome, String documento,String email, Double telefone,Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, String sexo, String rua, Integer numero, String complemento, String bairro, Integer cep, String cidade) {
		String resposta;
		
		this.dataNascimento = new DataNascimento(diaNascimento, mesNascimento, anoNascimento);
		this.endereco = new Endereco(rua, numero, complemento, bairro, cep, cidade);	
		
		cliente = new PessoaFisica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		
		if(arrayCliente.add((Pessoa) cliente)) {
			resposta = "Cliente cadastrado.";
		}else {
			resposta = "Este cliente já possui cadastro.";
		}
		
		return resposta;	
	}
	
	/**
	 * Método para excluir um Cliente.
	 * @param nome
	 * @return
	 */
	public String excluirCliente(String nome) {
		String resposta;
		
		if(arrayCliente.remove(nome)) {
			resposta = "Cliente Excluido.";
		}else {
			resposta = "Este cliente não existe.";
		}
		
		return resposta;
	}
	
	/**
	 * Método para alterar um Cliente.
	 * @param nome
	 * @param sobreNome
	 * @param documento
	 * @param email
	 * @param telefone
	 * @param diaNascimento
	 * @param mesNascimento
	 * @param anoNascimento
	 * @param sexo
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param pessoa
	 * @return
	 */
	public String alterarCliente(String nome, String sobreNome, String documento,String email, Double telefone,Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, String sexo, String rua, Integer numero, String complemento, String bairro, Integer cep, String cidade, Boolean pessoa) {
		String resposta;
		
		this.dataNascimento = new DataNascimento(diaNascimento, mesNascimento, anoNascimento);
		this.endereco = new Endereco(rua, numero, complemento, bairro, cep, cidade);	
		
		if (pessoa == true) {
			cliente = new PessoaFisica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		}
		
		if(arrayCliente.alter((Pessoa) cliente)) {
			resposta = "Cliente alterado.";
		}else {
			resposta = "Este cliente não possui cadastro.";
		}
		
		return resposta;
	}
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	public PessoaFisica buscarCliente(String nome) {
		PessoaFisica cliente = null;
		
		if(arrayCliente.search(nome) != null) {
			cliente = arrayCliente.search(nome);
		}
		
		return cliente;
	}
}
