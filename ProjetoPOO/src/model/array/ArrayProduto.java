package model.array;

import java.util.ArrayList;

import model.Pessoa;
import model.Produto;

public class ArrayProduto {
	
	private ArrayList<Produto> produtos;
	
	private static ArrayProduto uniqueInstance;
	
	/**
	 * Padrao Singleton para Array,mater uma única instancia em memória da array.
	 * @return Instancia da Array
	 */
	public static synchronized ArrayProduto getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ArrayProduto();
		}
		return uniqueInstance;
	}
	
	public ArrayProduto(){
		produtos = new ArrayList<>();
	}

	/**
	 * Percorre o array e caso o produto não esteja cadastrado, cadastra o mesmo.
	 * 
	 * @param p , produto que será cadastrado.
	 * @return result, true para sucesso e false para fracasso no cadastramento.
	 */
	public boolean add(Produto p){
		Boolean status = false;
		
		if(search(p.getNome()) == null) {
			produtos.add(p);
			status = true;
		}
		
		return status;
	}
	/**
	 * Verifica se o produto está cadastrado, caso esteja, o remove.
	 * 
	 * @param  nome , produto a ser removido.
	 * @return status , true para sucesso e false para fracasso.
	 */
	public boolean remove(String nome) {
		Boolean status = false;
		
		for(Produto produto : produtos) {
			if(produto.getNome().equals(nome)) {
				produtos.remove(produto);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * Método para alterar um Produto.
	 * @param p , produto a ser alterado
	 * @return "status" da operação, "true" para realizado a remoção e "false" para não realizado a remoção.
	 */
	public boolean alter(Produto p) {
		Boolean status = false;
		
		for(Produto produto : produtos) {
			if(produto.getNome().equals(p.getNome())) {
				remove(p.getNome());
				add(p);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * Método para buscar um produto.
	 * @param nome 
	 * @return Produto que estava buscando.
	 */
	public Produto search(String nome) {
		Produto result = null;
		
		for (Produto produto : produtos) {
			if(produto.getNome().equals(nome)) {
				result = produto;
			}
		}
		
		return result;
	}
}
	