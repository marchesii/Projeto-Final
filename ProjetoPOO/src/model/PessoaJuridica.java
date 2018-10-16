package model;

import controller.VendaController;

public class PessoaJuridica extends Pessoa implements Fornecedor{
	
	private String cnpj;
	private VendaController venda;
	
	public PessoaJuridica(String nome, String sobreNome, String email, Double telefone, DataNascimento dataNascimento, String sexo, Endereco endereco, String cnpj) {
		super(nome, sobreNome, email, telefone, dataNascimento, sexo, endereco);
		this.cnpj = cnpj;
		venda = new VendaController();
	}
	
	@Override
	public String venda(Produto produto) {
		venda.adicionarProduto(produto);
		return venda.listaProdutos();
	}

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return null;
	}
}
