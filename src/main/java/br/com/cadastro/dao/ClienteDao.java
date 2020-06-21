package br.com.cadastro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cadastro.data.ConexaoJDBC;
import br.com.cadastro.data.ConexaoMysqlJDBC;
import br.com.cadastro.model.Cliente;

public class ClienteDao {

	
	private final ConexaoJDBC conexao;
	
	private PreparedStatement stmt;
	private ResultSet rs;
	private String sqlQuery="";
	
	public ClienteDao() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMysqlJDBC();
	}

	public void cadastrar(Cliente cliente) throws SQLException{
		try {
			sqlQuery = "INSERT INTO cliente (matricula, codigoCliente, nome, razaoSocial, cnpj, telefone) VALUES (?, ?, ?, ?, ?, ?);";
			
			stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
			
			stmt.setLong(1, cliente.getMatricula());
			stmt.setString(2, cliente.getCodigoCliente());
			stmt.setString(3, cliente.getNome());
			stmt.setString(4, cliente.getRazaoSocial());
			stmt.setString(5, cliente.getCnpj());
			stmt.setString(6, cliente.getTelefone());
			
			stmt.execute();
			this.conexao.commit();			
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}
	
	
	public void listar() {
		
	}
	
	
	public void alterar() {
		
	}
	
	
	public void excluir() {
		
	}
	
}