package br.com.cadastro.model;

public class Fornecedor {

	private Long id;
	private String codigoFornecedor;
	private String nome;
	private String razaoSocial;
	private String telefone;
	
	public Fornecedor(String codigoFornecedor, String nome, String razaoSocial, String telefone) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
	}
	
	public String getCodigoFornecedor() {
		return codigoFornecedor;
	}
	public void setCodigoFornecedor(String codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
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
