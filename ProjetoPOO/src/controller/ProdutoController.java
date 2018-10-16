package controller;

import model.PFinal;
import model.Produto;
import model.array.ArrayCliente;
import model.array.ArrayProduto;

public class ProdutoController {
	
	private ArrayProduto arrayProduto;
	private Produto produto;
	
	public ProdutoController() {
		arrayProduto = ArrayProduto.getInstance();
	}
	
	public String cadastrarProduto(String nome, Integer codigo, Double precoCompra, Integer quantidade) {
		String resposta;
	
		produto = new PFinal(nome, codigo, precoCompra, quantidade);
		
		if(arrayProduto.add(produto)) {
			resposta = "Produto cadastrado.";
		}else {
			resposta = "Este produto j� possui cadastro.";
		}
		
		return resposta;	
	}
	
	/**
	 * Exclui Produto.
	 * @param nome
	 * @return resposta
	 */
	public String excluirProduto(String nome) {
		String resposta;
		
		if(arrayProduto.remove(nome)) {
			resposta = "Produto excluido.";
		}else {
			resposta = "Este produto n�o existe.";
		}
		
		return resposta;
	}
	
	/**
	 * Altera um produto espec�fico.
	 * @param nome
	 * @param codigo
	 * @param precoCompra , preco que ser� vendido aos clientes;
	 * @param quantidade , quantidade atual em estoque;
	 * @return resposta
	 */
	
	public String alterarProduto(String nome, Integer codigo, Double precoCompra, Integer quantidade) {
		String resposta;
			
		produto = new PFinal(nome, codigo, precoCompra, quantidade);
		
		if(arrayProduto.alter(produto)) {
			resposta = "Produto alterado.";
		}else {
			resposta = "Este produto n�o possui cadastro.";
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
		
		if(arrayProduto.search(nome) != null) {
			produto = arrayProduto.search(nome);
		}
		
		return produto;
	}
	
	/**
	 * M�todo usado para listar todos os produtos
	 * @return
	 */
	public String listaProdutos() {
		return arrayProduto.list();
	}
}
