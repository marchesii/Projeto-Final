package controller;

import model.DataNascimento;
import model.Endereco;
import model.Pessoa;
import model.PessoaJuridica;
import model.Produto;
import model.array.ArrayFornecedor;

public class FornecedorController {
	
	private ArrayFornecedor arrayFornecedor;
	private DataNascimento dataNascimento;
	private Endereco endereco;
	private PessoaJuridica fornecedor;
	
	public FornecedorController() {
		arrayFornecedor = ArrayFornecedor.getInstance();
	}
	
	/**
	 * M�todo para cadastrar um Fornecedor.
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
	 * @return
	 */
	public String cadastrarFornecedor(String nome, String sobreNome, String documento,String email, Double telefone,Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, String sexo, String rua, Integer numero, String complemento, String bairro, Integer cep, String cidade) {
		String resposta;
		
		this.dataNascimento = new DataNascimento(diaNascimento, mesNascimento, anoNascimento);
		this.endereco = new Endereco(rua, numero, complemento, bairro, cep, cidade);	
		
		fornecedor = new PessoaJuridica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		
		if(arrayFornecedor.add((Pessoa) fornecedor)) {
			resposta = "Fornecedor cadastrado.";
		}else {
			resposta = "Este fornecedor j� possui cadastro.";
		}
		
		return resposta;	
	}
	
	/**
	 * M�todo para excluir um Fornecedor.
	 * @param nome
	 * @return
	 */
	public String excluirFornecedor(String nome) {
		String resposta;
		
		if(arrayFornecedor.remove(nome)) {
			resposta = "Fornecedor excluido.";
		}else {
			resposta = "Este fornecedor n�o existe.";
		}
		
		return resposta;
	}
	
	/**
	 * M�todo que altera um Fornecedor espec�fico.
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
	 * @return resposta, Deu certo ou n�o deu certo;
	 */
	public String alterarFornecedor(String nome, String sobreNome, String documento,String email, Double telefone,Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, String sexo, String rua, Integer numero, String complemento, String bairro, Integer cep, String cidade, Boolean pessoa) {
		String resposta;
		
		this.dataNascimento = new DataNascimento(diaNascimento, mesNascimento, anoNascimento);
		this.endereco = new Endereco(rua, numero, complemento, bairro, cep, cidade);	
		
		if (pessoa == true) {
			fornecedor = new PessoaJuridica(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco, documento);
		}
		
		if(arrayFornecedor.alter((Pessoa) fornecedor)) {
			resposta = "Fornecedor alterado.";
		}else {
			resposta = "Este fornecedor n�o possui cadastro.";
		}
		
		return resposta;
	}
	
	/**
	 * M�todo que busca um Fornecedor espec�fico
	 * @param nome
	 * @return
	 */
	public PessoaJuridica buscarFornecedor(String nome) {
		PessoaJuridica fornecedor = null;
		
		if(arrayFornecedor.search(nome) != null) {
			fornecedor = arrayFornecedor.search(nome);
		}
		
		return fornecedor;
	}
	
	public String adicionaFornecimento(Produto p) {
		String resposta;

		return null;
	}
}
