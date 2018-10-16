package model;

public class MaPrima extends Produto {
	
	private Integer minimo;
	
	public MaPrima(String nome, Integer codigo, Double precoCompra, Integer quantidade, Integer minimo) {
		super(nome, codigo, precoCompra, quantidade);
		this.minimo = minimo;
	}
	
}
