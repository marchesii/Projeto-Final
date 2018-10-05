package model;

public class Endereco {
	
	private String rua;
	private Integer numero;
	private String complemento;
	private String bairro;
	private Integer cep;
	
	public Endereco(String rua, Integer numero, String complemento, String bairro, Integer cep) {
		
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
		setBairro(bairro);
		setCep(cep);
	
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public Integer getCep() {
		return cep;
	}
	
	
	
}
