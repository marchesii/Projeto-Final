package model.array;

import java.util.ArrayList;
import java.util.Iterator;

import model.Pessoa;
import model.PessoaFisica;

public class ArrayCliente {
	
	private ArrayList<Pessoa> clientes;
	
	private static ArrayCliente uniqueInstance;
	
	/**
	 * Padrao Singleton para Array,mater uma única instancia em memória da array.
	 * @return Instancia da Array
	 */
	public static synchronized ArrayCliente getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ArrayCliente();
		}
		return uniqueInstance;
	}
	
	private ArrayCliente(){
		clientes = new ArrayList<>();
	}

	/**
	 * Percorre a array para verificar se já contem o cliente cadastrado, caso não, cadastra se contém ele não cadastra.
	 * @param c -> "Cliente" para o cadastro.
	 * @return "status" operação, "true" para cadastrado e "falso" para não cadastrado.
	 */
	public boolean add(Pessoa c){
		Boolean status = false;
		
		if(search(c.getNome()) == null) {
			clientes.add(c);
			status = true;
		}		
		
		return status;
	}
	
	/**
	 * Percorre a array para verificar se já contem o cliente que deverá ser removido, caso tenha ele é removido.
	 * @param nome -> "Cliente" para remoção.
	 * @return "status" da operação, "true" para realizado a remoção e "false" para não realizado a remoção.
	 */
	public boolean remove(String nome) {
		Boolean status = false;
		
		for (Pessoa cliente : clientes) {
			if(cliente.getNome().equals(nome)) {
				clientes.remove(cliente);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * Método para alterar um Cliente.
	 * @param c
	 * @return "status" da operação, "true" para realizado a remoção e "false" para não realizado a remoção.
	 */
	public boolean alter(Pessoa c) {
		Boolean status = false;
		
		for (Pessoa cliente : clientes) {
			if(cliente.getNome().equals(c.getNome())) {
				remove(c.getNome());
				add(c);
				status = true;
			}
		}
		
		return status;
	}
	
	/**
	 * Método para buscar um cliente.
	 * @param nome
	 * @return Cliente que estava buscando.
	 */
	public PessoaFisica search(String nome) {
		Pessoa pessoa = null;
		
		for (Pessoa cliente : clientes) {
			if(cliente.getNome().equals(nome)) {
				pessoa = cliente;
			}
		}
		
		return (PessoaFisica) pessoa;
	}
}
