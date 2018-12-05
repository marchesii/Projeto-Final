package controller;

import java.io.IOException;

import model.Produto;
import model.array.ArrayVenda;

public class ProdutosFornecidosController {
	
	private ArrayVenda arrayVenda;
	
	public ProdutosFornecidosController() {
		arrayVenda = new ArrayVenda();
	}
	
	public String adicionarProduto(Produto produto) {
		arrayVenda.add(produto);
		return produto.toString();	
	}
	
	/**
	 * Exclui Produto.
	 * @param nome
	 * @return resposta
	 */
	public String excluirProduto(String nome) {
		String resposta;
		
		if(arrayVenda.remove(nome)) {
			resposta = "Produto excluido.";
		}else {
			resposta = "Este produto n�o existe.";
		}
		
		return resposta;
	}
	
	/**
	 * M�todo que busca um Produto espec�fico
	 * @param nome
	 * @return produto
	 */
	public Produto buscarProduto(String nome) {
		Produto produto = null;
		
		if(arrayVenda.search(nome) != null) {
			produto = arrayVenda.search(nome);
		}
		
		return produto;
	}
	
	/**
	 * M�todo usado para listar todos os produtos
	 * @return 
	 */
	public String listaProdutos() {
		return arrayVenda.list();
	}
	
	public boolean finalizaVenda() throws IOException {
		boolean status = false;
		EstoqueController estoque = EstoqueController.getInstance();
		
		estoque.removeEstoque(this.listaProdutos());
		
		return status;
	}
}
