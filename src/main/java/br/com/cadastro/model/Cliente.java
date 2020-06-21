package br.com.cadastro.model;

public class Cliente {

	private Long id;
	private Long matricula;
	private String codigoCliente;
	private String nome;
	private String razaoSocial;
	private String dataCadastro;
	private String cnpj;
	private String telefone;
	
	

	public Cliente(Long matricula, String codigoCliente, String nome, String razaoSocial, 
			String cnpj, String telefone) {
		super();
		this.matricula = matricula;
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

}
