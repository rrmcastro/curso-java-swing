package br.com.cadastro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cadastro.data.ConexaoJDBC;
import br.com.cadastro.data.ConexaoMysqlJDBC;
import br.com.cadastro.model.Fornecedor;

// classe DAO - Data Access Object
// classe DAO - REPOSITORY - CONTROLLER : Tudo a mesma coisa!
public class FornecedorDao {
	
	private final ConexaoJDBC conexao;
	
	private PreparedStatement stmt;
	private ResultSet rs;
	private String sqlQuery="";
	
	public FornecedorDao() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMysqlJDBC();
	}

	public void cadastrar(Fornecedor fornecedor) throws SQLException{
		try {
			sqlQuery = "INSERT INTO fornecedor (codigo_fornecedor, nome, razao_social, telefone) VALUES (?, ?, ?, ?);";
			
			stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
			
			stmt.setString(1, fornecedor.getCodigoFornecedor());
			stmt.setString(2, fornecedor.getNome());
			stmt.setString(3, fornecedor.getRazaoSocial());
			stmt.setString(4, fornecedor.getTelefone());
			
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
