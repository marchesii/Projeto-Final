package model;

public abstract class Pessoa implements Cliente{
	
	protected String nome;
	protected String sobreNome;
	protected String email;
	protected Double telefone;
	protected DataNascimento dataNascimento;
	protected String sexo;
	protected Endereco endereco;
	
	public Pessoa(String nome, String sobreNome, String email, Double telefone, DataNascimento dataNascimento, String sexo, Endereco endereco){
		setNome(nome);
		setSobreNome(sobreNome);
		setEmail(email);
		setTelefone(telefone);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getTelefone() {
		return telefone;
	}

	public void setTelefone(Double telefone) {
		this.telefone = telefone;
	}

	public DataNascimento getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(DataNascimento dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email + ", telefone=" + telefone
				+ ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", endereco=" + endereco + "]";
	}
}
