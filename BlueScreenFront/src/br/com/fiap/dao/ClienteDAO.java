package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import br.com.fiap.beans.Cliente;

public class ClienteDAO {

	public int logar(String l, String s, Connection con) throws Exception{

		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement("SELECT DS_SENHA FROM T_TSY_PESSOA_FISICA WHERE DS_LOGIN = ?");
		estrutura.setString(1, l);
		ResultSet resultado = estrutura.executeQuery();
		
		Cliente cli = new Cliente();
		if(resultado.next()){
			cli.setLogin(l);
			cli.setSenha(resultado.getString("DS_SENHA"));
		}
		
		if(cli.getSenha() == null && cli.getLogin() == null){
			return 2;
		}else if(cli.getSenha().equals(s) && cli.getLogin().equals(l)){
			return 1;
		}else{
			return 2;
		}		

	}

	public void Cadastrar(Cliente obj, Connection con) throws Exception{

		PreparedStatement estrutura = null;
		Random gerador = new Random();
		int cd = gerador.nextInt(500) + 400;
		estrutura = con.prepareStatement("INSERT INTO T_TSY_PESSOA " + 
				"(CD_PESSOA, NM_PESSOA, DS_EMAIL) " + 
				"VALUES (?,?,?)");
		estrutura.setInt(1, cd);
		estrutura.setString(2, obj.getNome());
		estrutura.setString(3, obj.getEmail());
		estrutura.execute();

		estrutura = con.prepareStatement("INSERT INTO T_TSY_PESSOA_FISICA" + 
				"(CD_PESSOA, DS_SEXO, DS_LOGIN, DS_SENHA) " + 
				"VALUES (?,?,?,?)");
		estrutura.setString(2, String.valueOf(obj.getSexo()));
		estrutura.setString(3, obj.getLogin());
		estrutura.setString(4, obj.getSenha());
		estrutura.setInt(1, cd);
		estrutura.execute();
		
		estrutura.close();

	}
}
