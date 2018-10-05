package model.array;

import java.util.ArrayList;
import model.Cliente;

public class ArrayCliente {
	
	private ArrayList<Cliente> clientes;
	
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
	
	public ArrayCliente(){
		clientes = new ArrayList<>();
	}
	
	public void add(Cliente cliente){
		clientes.add(cliente);
	}
}
