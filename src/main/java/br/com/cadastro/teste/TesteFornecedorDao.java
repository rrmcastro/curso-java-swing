package br.com.cadastro.teste;

import java.sql.SQLException;

import br.com.cadastro.dao.FornecedorDao;
import br.com.cadastro.model.Fornecedor;


public class TesteFornecedorDao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		FornecedorDao dao = new FornecedorDao();
		
		Fornecedor f1 = new Fornecedor("789", "Alicio", "Alicio da Cunha", "98564433");
		Fornecedor f2 = new Fornecedor("654", "Ricardo", "Ricardo Castro", "78856473");
		Fornecedor f3 = new Fornecedor("944", "Aline", "Aline da Silva", "84658473");
		Fornecedor f4 = new Fornecedor("374", "Adauto", "Adauto Jr", "94748367");
		
		dao.cadastrar(f3);
		

	}

}
