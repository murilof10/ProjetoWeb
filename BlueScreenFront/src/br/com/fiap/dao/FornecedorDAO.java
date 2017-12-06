package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {

	public List<String> buscar(Connection con) throws Exception{

		PreparedStatement estrutura = null;

		List<String> lista = new ArrayList<String>();

		estrutura = con.prepareStatement("SELECT NM_PESSOA FROM T_TSY_PESSOA WHERE CD_PESSOA = 2");
		ResultSet resultado = estrutura.executeQuery();
		if(resultado.next()){
			lista.add(resultado.getString("NM_PESSOA"));
		}


		estrutura = con.prepareStatement("SELECT NM_PESSOA FROM T_TSY_PESSOA WHERE CD_PESSOA = 3");
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			lista.add(resultado.getString("NM_PESSOA"));
		}


		estrutura = con.prepareStatement("SELECT NM_PESSOA FROM T_TSY_PESSOA WHERE CD_PESSOA = 4");
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			lista.add(resultado.getString("NM_PESSOA"));

		}

		return lista;


	}

}
