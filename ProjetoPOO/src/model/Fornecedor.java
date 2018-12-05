package model;

public interface Fornecedor {

	String fornecimentos();
	
	void adicionarProdutoFornecido(Produto produto);

	Integer getMinimo();
	
	void setMinimo(Integer a);
		
}