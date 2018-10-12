package model;

public abstract class Produto {
	
	private String nome;
	private Integer codigo;
	private Double precoCompra;
	private Integer quantidade;
	
	public Produto(String nome, Integer codigo, Double precoCompra, Integer quantidade) {
		setNome(nome);
		setCodigo(codigo);
		setPrecoCompra(precoCompra);
		setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
