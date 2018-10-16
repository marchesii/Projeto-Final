package controller;

import model.Produto;
import model.array.ArrayVenda;

public class VendaController {
	
	private ArrayVenda arrayVenda;
	
	public VendaController() {
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
			resposta = "Este produto não existe.";
		}
		
		return resposta;
	}
	
	/**
	 * Método que busca um Produto específico
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
	 * Método usado para listar todos os produtos
	 * @return 
	 */
	public String listaProdutos() {
		return arrayVenda.list();
	}
}
