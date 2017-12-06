package br.com.fiap.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public abstract class ProdutoBO {
	
	public static List<Produto> buscarProd(Connection con) throws Exception{
		ProdutoDAO dao = new ProdutoDAO();
		return dao.buscar(con);
	}
	
}
