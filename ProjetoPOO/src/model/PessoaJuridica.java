package model;

import controller.ProdutosFornecidosController;

public class PessoaJuridica extends Pessoa implements Fornecedor{
	
	private String cnpj;
	private ProdutosFornecidosController produtos;
	private Integer minimo;
	
	
	public PessoaJuridica(String nome, String sobreNome, String email, Double telefone, DataNascimento dataNascimento, String sexo, Endereco endereco, String cnpj) {
		super(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco);
		this.cnpj = cnpj;
		produtos = new ProdutosFornecidosController();
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public void adicionarProdutoFornecido(Produto produto) {
		produtos.adicionarProduto(produto);
	}
	
	@Override
	public String fornecimentos() {
		return produtos.listaProdutos();
	}

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getMinimo() {
		return minimo;
	}

	@Override
	public void setMinimo(Integer a) {
		this.minimo = a;
	}
}
