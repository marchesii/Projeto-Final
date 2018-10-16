package controller;

import model.PFinal;
import model.Produto;
import model.array.ArrayCliente;
import model.array.ArrayCompra;

public class CompraController {
	
	private ArrayCompra arrayCompra;
	private Produto produto;
	
	public CompraController() {
		arrayCompra = new ArrayCompra();
	}
	
	public String adicionarProduto(Produto produto) {
		arrayCompra.add(produto);
		return "Produto adicionado";	
	}
	
	/**
	 * Exclui Produto.
	 * @param nome
	 * @return resposta
	 */
	public String excluirProduto(String nome) {
		String resposta;
		
		if(arrayCompra.remove(nome)) {
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
		
		if(arrayCompra.search(nome) != null) {
			produto = arrayCompra.search(nome);
		}
		
		return produto;
	}
	
	/**
	 * M�todo usado para listar todos os produtos
	 * @return 
	 */
	public String listaProdutos() {
		return arrayCompra.list();
	}
}
