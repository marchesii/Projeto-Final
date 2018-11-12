package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Produto;
import model.array.ArrayCompra;

public class CompraController{
	
	private ArrayCompra arrayCompra;

	
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
		
		if(arrayCompra.search(nome) != null) {
			produto = arrayCompra.search(nome);
		}
		
		return produto;
	}
	
	/**
	 * Método usado para listar todos os produtos
	 * @return retorna os produtos que estão sendo comprados
	 */
	public String listaProdutos() {
		return arrayCompra.list();
	}
	
	/**
	 * Método que finaliza compra e atualiza o log de estoque
	 * @return 
	 * @throws IOException
	 */
	public boolean finalizaCompra() throws IOException {
		boolean status = false;
		EstoqueController estoque = EstoqueController.getInstance();
		
		estoque.adicionarEstoque(this.listaProdutos());
		
		return status;
	}
}
