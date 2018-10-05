package model.array;

import java.util.ArrayList;

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

}
