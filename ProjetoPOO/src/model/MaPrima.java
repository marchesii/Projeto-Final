package model;

public class MaPrima extends Produto {
	
	private Integer minimo;
	private Double precoCompra;
	
	public MaPrima(String nome, Integer codigo, Double precoVenda, Integer quantidade, Integer minimo) {
		super(nome, codigo, precoVenda, quantidade);
		this.minimo = minimo;
	}
	
	public void setMinimo(Integer minimo) {
		this.minimo = minimo;
	}
	
	public Integer getMinimo() {
		return minimo;
	}
	
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public Double getPrecoCompra() {
		return precoCompra;
	}
	
}
