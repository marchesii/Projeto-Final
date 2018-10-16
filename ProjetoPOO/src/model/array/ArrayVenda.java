package model.array;

import java.util.ArrayList;
import java.util.Iterator;

import model.Pessoa;
import model.Produto;

public class ArrayVenda {
	
	private ArrayVenda arrayVenda;
	
	private ArrayList<Produto> vendas;
	
	public ArrayVenda() {
		vendas = new ArrayList<>();
	}

	/**
	 * Percorre o array e caso o produto n�o esteja cadastrado, cadastra o mesmo.
	 * 
	 * @param v , produto que ser� cadastrado.
	 * @return result, true para sucesso e false para fracasso no cadastramento.
	 */
	public boolean add(Produto v){
		Boolean status = false;
		
		if(search(v.getNome()) == null) {
			vendas.add(v);
			status = true;
		}
		
		return status;
	}
	/**
	 * Verifica se o produto est� cadastrado, caso esteja, o remove.
	 * 
	 * @param  nome , produto a ser removido.
	 * @return status , true para sucesso e false para fracasso.
	 */
	public boolean remove(String nome) {
		Boolean status = false;
		
		for(Produto produto : vendas) {
			if(produto.getNome().equals(nome)) {
				vendas.remove(produto);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * M�todo para alterar um Produto.
	 * @param p , produto a ser alterado
	 * @return "status" da opera��o, "true" para realizado a remo��o e "false" para n�o realizado a remo��o.
	 */
	public boolean alter(Produto p) {
		Boolean status = false;
		
		for(Produto produto : vendas) {
			if(produto.getNome().equals(p.getNome())) {
				remove(p.getNome());
				add(p);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * M�todo para buscar um produto.
	 * @param nome 
	 * @return Produto que estava buscando.
	 */
	public Produto search(String nome) {
		Produto result = null;
		
		for (Produto produto : vendas) {
			if(produto.getNome().equals(nome)) {
				result = produto;
			}
		}
		
		return result;
	}
	
	public String list() {
		String resultado = "";
		
		for(Produto produto : vendas) {
			resultado = produto.toString() + "\n" + resultado;
		}
		
		return resultado;
	}
	
}
	