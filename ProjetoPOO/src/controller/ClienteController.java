package controller;

import model.DataNascimento;
import model.Endereco;
import model.Pessoa;
import model.PessoaFisica;
import model.Cliente;
import model.PessoaJuridica;
import model.array.ArrayCliente;

public class ClienteController {
	
	private ArrayCliente arrayCliente;
	private DataNascimento dataNascimento;
	private Endereco endereco;
	private Cliente cliente;
	
	public ClienteController() {
		arrayCliente = ArrayCliente.getInstance();
	}

	public String cadastrarCliente(String nome, String sobreNome, String documento,String email, Integer telefone,Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, String sexo, String rua, Integer numero, String complemento, String bairro, Integer cep, String cidade, Boolean pessoa) {
		String resposta;
		
		this.dataNascimento = new DataNascimento(diaNascimento, mesNascimento, anoNascimento);
		this.endereco = new Endereco(rua, numero, complemento, bairro, cep, cidade);	
		
		if (pessoa == true) {
			cliente = new PessoaFisica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		}else {
			cliente = new PessoaJuridica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		}
		
		if(arrayCliente.add((Pessoa) cliente)) {
			resposta = "Cliente cadastrado.";
		}else {
			resposta = "Este cliente já possui cadastro.";
		}
		
		return resposta;	
	}
	
	public String excluirCliente(String nome) {
		String resposta;
		
		if(arrayCliente.remove(nome)) {
			resposta = "Cliente cadastrado.";
		}else {
			resposta = "Este cliente já possui cadastro.";
		}
		
		return resposta;
	}
	
	public String alterarCliente(String nome, String sobreNome, String documento,String email, Integer telefone,Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, String sexo, String rua, Integer numero, String complemento, String bairro, Integer cep, String cidade, Boolean pessoa) {
		String resposta;
		
		this.dataNascimento = new DataNascimento(diaNascimento, mesNascimento, anoNascimento);
		this.endereco = new Endereco(rua, numero, complemento, bairro, cep, cidade);	
		
		if (pessoa == true) {
			cliente = new PessoaFisica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		}else {
			cliente = new PessoaJuridica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		}
		
		if(arrayCliente.alter((Pessoa) cliente)) {
			resposta = "Cliente alterado.";
		}else {
			resposta = "Este cliente não possui cadastro.";
		}
		
		return resposta;
	}
	
	public Cliente buscarCliente(String nome) {
		Cliente cliente = null;
		
		if(arrayCliente.search(nome) != null) {
			cliente = arrayCliente.search(nome);
		}
		
		return cliente;
	}
}
