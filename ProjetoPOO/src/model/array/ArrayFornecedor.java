package model.array;

import java.util.ArrayList;

import model.Fornecedor;

public class ArrayFornecedor {
	
	private ArrayList<Fornecedor> fornecedores;
	
	private static ArrayFornecedor uniqueInstance;
	
	/**
	 * Padrao Singleton para Array,mater uma única instancia em memória da array.
	 * @return Instancia da Array
	 */
	public static synchronized ArrayFornecedor getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ArrayFornecedor();
		}
		return uniqueInstance;
	}
	
	public ArrayFornecedor(){
		fornecedores = new ArrayList<>();
	}
}
