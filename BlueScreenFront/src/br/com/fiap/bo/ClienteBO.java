package br.com.fiap.bo;

import java.sql.Connection;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.dao.ClienteDAO;

public abstract class ClienteBO {

	public static void cadastrarCliente(Cliente obj, Connection con) throws Exception{
		//SQL INJECTION
		if(obj.getSenha().toUpperCase().contains(" AND ") || 
				obj.getSenha().contains("=") || 
				obj.getSenha().contains("'") ||
				obj.getSenha().toUpperCase().contains(" OR ") ||
				obj.getLogin().toUpperCase().contains(" AND ") || 
				obj.getLogin().contains("=") || 
				obj.getLogin().contains("'") ||
				obj.getLogin().toUpperCase().contains(" OR ")){
			throw new RuntimeException();	
		}

		//TAMANHO LOGIN / SENHA
		if(obj.getLogin().length() > 50 || obj.getSenha().length() > 50){
			throw new RuntimeException();
		}

		//EMAIL
		if(!obj.getEmail().toUpperCase().contains("@") && obj.getEmail().toUpperCase().contains(".COM")){
			throw new RuntimeException();
		}
		
		ClienteDAO cli = new ClienteDAO();
		cli.Cadastrar(obj, con);
	}

	public static int logar(String l, String s, Connection con) throws Exception{
		//SQL INJECTION
		if(s.toUpperCase().contains(" AND ") || 
				s.contains("=") || 
				s.contains("'") ||
				s.toUpperCase().contains(" OR ") ||
				l.toUpperCase().contains(" AND ") || 
				l.contains("=") || 
				l.contains("'") ||
				l.toUpperCase().contains(" OR ")){
			throw new RuntimeException();	
		}
		
		ClienteDAO cli = new ClienteDAO();
		int retorno = cli.logar(l, s, con);
		return retorno;
	}
}
