package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDAO {
	public List<String> buscar(String nome, Connection con) throws SQLException{
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement("SELECT VL_CAPACIDADE, VL_ITENS_ARM FROM T_TSY_ESTOQUE WHERE NM_ESTOQUE = ?");
		estrutura.setString(1, nome);
		ResultSet resultado = estrutura.executeQuery();
		List<String> est = new ArrayList<String>();
		if(resultado.next()){
			est.add(resultado.getString("VL_CAPACIDADE"));
			est.add(resultado.getString("VL_ITENS_ARM"));
		}
		return est;
	}
}
