package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Produto;

public class EstoqueController {
	FileWriter arq;
	PrintWriter escritor;
	private static EstoqueController estoque;
	
	/**
	 * Construtor do controlador do estoque
	 */
	private EstoqueController() {}
	
	/**
	 * Singleton para permitir que o Controlador de estoque seja unico.
	 * @return instancia do controlador;
	 */
	public static EstoqueController getInstance() {
		if(estoque == null) {
			estoque = new EstoqueController();
		}
		return estoque;
	}
	
	/**
	 * Método que adiciona produtos ao estoque
	 * @param string vai entrar uma sequência de produtos para serem adicionados ao estoque
	 * @throws IOException 
	 */
	public void adicionarEstoque(String string) throws IOException {	
		arq = new FileWriter("Este Computador\\Documentos\\GitHub\\Projeto-Final\\DataBase\\Estoque.txt");
	    escritor = new PrintWriter(arq);
		escritor.printf(string.toString() + "\n");
		arq.close();
	}
	
	/**
	 * Método que remove produtos ao estoque
	 * @param string
	 * @throws IOException
	 */
	public void removeEstoque(String string) throws IOException {
		arq = new FileWriter("Este Computador\\Documentos\\GitHub\\Projeto-Final\\DataBase\\Estoque.txt");
	    escritor = new PrintWriter(arq);
		escritor.printf("-" + string.toString() + "\n");
		arq.close();
	}
}
