package br.com.fiap.main;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Produto;
import br.com.fiap.bo.ClienteBO;
import br.com.fiap.bo.FornecedorBO;
import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.connection.ConnectionFactory;

public class Teste {

	public static void main(String[] args) throws Exception{
		
		try{
			
			Connection con = ConnectionFactory.controlarInstancia().getConnection();
			List<String> lista = new ArrayList<String>();
			lista = FornecedorBO.buscarFornecedor(con);
			
			List<Produto> listaProd = new ArrayList<Produto>();
			listaProd = ProdutoBO.buscarProd(con);
			
			System.out.println(listaProd.size());
			for(Produto p : listaProd){
				System.out.println(p.getCor());
				System.out.println(p.getPreco());
			}
			
			int resultado = ClienteBO.logar("CLIENTE1", "123", con);
			if(resultado == 1){
				System.out.println("LOGADO!");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}

	}

}
