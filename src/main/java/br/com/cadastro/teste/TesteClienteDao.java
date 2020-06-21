package br.com.cadastro.teste;

import java.sql.SQLException;

import br.com.cadastro.dao.ClienteDao;
import br.com.cadastro.model.Cliente;

public class TesteClienteDao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		ClienteDao dao = new ClienteDao();
		
		Cliente c1 = new Cliente(0001L, "33225", "Havan", "Havan Comercio de Casa Ltda", "12.982.548/0001-22", "47 98458 3233");
		Cliente c2 = new Cliente(0002L, "33464", "Bobs", "Bobs Rangos Nacionais", "12.982.548/0001-22", "47 98455 4544");
		Cliente c3 = new Cliente(0003L, "15482", "Giraffas", "Giraffas Rango Pescossudo", "12.982.548/0001-22", "47 97845 6565");
		Cliente c4 = new Cliente(0004L, "45744", "McDonalds", "McDonalds Nao Coma Aqui Ltda", "12.982.548/0001-22", "48 98457 4545");
		
		dao.cadastrar(c1);

	}

}
