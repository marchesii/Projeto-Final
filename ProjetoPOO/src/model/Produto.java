package model;

public abstract class Produto {
	
	private String nome;
	private Integer codigo;
	private Integer quantidade;
	private Fornecedor fornecedor;
	private Double precoVenda;
	private Integer minimo;
	
	public Produto(String nome, Integer codigo, Double precoVenda, Integer quantidade) {
		setNome(nome);
		setCodigo(codigo);
		setPrecoVenda(precoVenda);
		setQuantidade(quantidade);
	}

	public void setMinimo(Integer minimo) {
		this.minimo = minimo;
	}
	
	public Integer getMinimo() {
		return minimo;
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

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		setMinimo(fornecedor.getMinimo());
		this.fornecedor = fornecedor;
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", fornecedor=" + fornecedor + ", precoCompra=" + precoVenda + ", quantidade=" + quantidade + "]";
	}
}
