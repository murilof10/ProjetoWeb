package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Produto;

public class ProdutoDAO {
	
	public List<Produto> buscar(Connection con) throws Exception{
		
		List<Produto> lista = new ArrayList<Produto>();
		
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement("SELECT VL_PRECO, DS_COR FROM T_TSY_PRODUTO WHERE CD_PRODUTO = 1");
		ResultSet resultado = estrutura.executeQuery();
		Produto prod = null;
		if(resultado.next()){
			prod = new Produto();
			prod.setCor(resultado.getString("DS_COR"));
			prod.setPreco(Integer.valueOf(resultado.getString("VL_PRECO")));
			lista.add(prod);
		}
		
		estrutura = con.prepareStatement("SELECT VL_PRECO, DS_COR FROM T_TSY_PRODUTO WHERE CD_PRODUTO = 2");
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			prod = new Produto();
			prod.setCor(resultado.getString("DS_COR"));
			prod.setPreco(Integer.valueOf(resultado.getString("VL_PRECO")));
			lista.add(prod);
		}
		
		estrutura = con.prepareStatement("SELECT VL_PRECO, DS_COR FROM T_TSY_PRODUTO WHERE CD_PRODUTO = 3");
		resultado = estrutura.executeQuery();
		if(resultado.next()){
			prod = new Produto();
			prod.setCor(resultado.getString("DS_COR"));
			prod.setPreco(Integer.valueOf(resultado.getString("VL_PRECO")));
			lista.add(prod);
		}
		
		return lista;
	}
}
