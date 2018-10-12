package model;

public class PFinal extends Produto {

	private Double precoVenda;
	
	public PFinal(String nome, Integer codigo, Double precoCompra, Integer quantidade, Double precoVenda) {
		super(nome, codigo, precoCompra, quantidade);
		setPrecoVenda(precoVenda);
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

}
