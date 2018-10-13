package model.array;

import java.util.ArrayList;

import model.Pessoa;
import model.PessoaJuridica;

public class ArrayFornecedor {
	
	private ArrayList<Pessoa> fornecedores;
	
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
	
	/**
	 * Percorre o array e caso o fornecedor não esteja cadastrado, cadastra o mesmo.
	 * 
	 * @param f , Fornecedor que será cadastrado.
	 * @return status, true para sucesso e false para fracasso no cadastramento.
	 */
	public boolean add(Pessoa f){
		Boolean status = false;
		
		if(search(f.getNome()) == null) {
			fornecedores.add(f);
			status = true;
		}
		
		return status;
	}
	
	/**
	 * Verifica se o fornecedor está cadastrado, caso esteja, o remove.
	 * 
	 * @param  nome , fornecedor a ser removido.
	 * @return result, true para sucesso e false para fracasso.
	 */
	public boolean remove(String nome) {
		Boolean result = false;
		
		for(Pessoa fornecedor : fornecedores) {
			if(fornecedor.getNome().equals(nome)) {
				fornecedores.remove(fornecedor);
				result = true;
			}
		}
		
		return result;
	}
	
	/**
	 * Método para alterar um Fornecedor.
	 * @param f , forneceodr
	 * @return "status" da operação, "true" para realizado a remoção e "false" para não realizado a remoção.
	 */
	public boolean alter(Pessoa f) {
		Boolean status = false;
		
		for(Pessoa fornecedor : fornecedores) {
			if(fornecedor.getNome().equals(f.getNome())) {
				remove(f.getNome());
				add(f);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * Procura por um fornecedor específico.
	 * @param nome , nome do fornecedor.
	 * @return pessoa , retorna o fornecedor achado.
	 */
	public PessoaJuridica search(String nome) {
		Pessoa pessoa = null;
		
		for (Pessoa fornecedor : fornecedores) {
			if(fornecedor.getNome().equals(nome)) {
				pessoa = fornecedor;
			}
		}
		
		return (PessoaJuridica) pessoa;
	}
	
}
