package model.array;

import java.util.ArrayList;
import java.util.Iterator;

import model.Cliente;
import model.Pessoa;

public class ArrayCliente {
	
	private ArrayList<Pessoa> clientes;
	
	private static ArrayCliente uniqueInstance;
	
	/**
	 * Padrao Singleton para Array,mater uma �nica instancia em mem�ria da array.
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
	 * Percorre a array para verificar se j� contem o cliente cadastrado, caso n�o, cadastra se cont�m ele n�o cadastra.
	 * @param c -> "Cliente" para o cadastro.
	 * @return "status" opera��o, "true" para cadastrado e "falso" para n�o cadastrado.
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
	 * Percorre a array para verificar se j� contem o cliente que dever� ser removido, caso tenha ele � removido.
	 * @param c -> "Cliente" para remo��o.
	 * @return "status" da opera��o, "true" para realizado a remo��o e "false" para n�o realizado a remo��o.
	 */
	public boolean remove(String nome) {
		Boolean status = false;
		
		for (Pessoa cliente : clientes) {
			if(cliente.getNome().equals(nome)) {
				clientes.remove(cliente);
				status = true;
			}else {
				status = false;
			}
		}
		
		return status;
	}
	
	public boolean alter(Pessoa c) {
		Boolean status = false;
		
		for (Pessoa cliente : clientes) {
			if(cliente.getNome().equals(c.getNome())) {
				remove(c.getNome());
				add(c);
				status = true;
			}else {
				status = false;
			}
		}
		
		return status;
	}
	
	public Cliente search(String nome) {
		Pessoa pessoa = null;
		
		for (Pessoa cliente : clientes) {
			if(cliente.getNome().equals(nome)) {
				pessoa = cliente;
			}
		}
		
		return (Cliente) pessoa;
	}
}
