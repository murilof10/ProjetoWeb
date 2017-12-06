package br.com.fiap.bo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.FornecedorDAO;

public class FornecedorBO {
	
	public static List<String> buscarFornecedor(Connection con) throws Exception{
		FornecedorDAO dao = new FornecedorDAO();
		List<String> lista = new ArrayList<String>();
		lista = dao.buscar(con);
		return lista;
	}
	
}
