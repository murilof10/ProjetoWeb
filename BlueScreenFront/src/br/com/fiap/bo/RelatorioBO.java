package br.com.fiap.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.dao.RelatorioDAO;

public class RelatorioBO {
	public static List<String> buscar(String nome, Connection con) throws SQLException{
		RelatorioDAO dao = new RelatorioDAO();
		return dao.buscar(nome, con);
	}
}
