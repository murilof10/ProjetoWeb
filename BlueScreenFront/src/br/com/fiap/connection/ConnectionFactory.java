package br.com.fiap.connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;

public final class ConnectionFactory {
	
	private static ConnectionFactory conexao = null;
	
	public static ConnectionFactory controlarInstancia(){
		if(conexao == null){
			conexao = new ConnectionFactory();
		}
		return conexao;
	}
	
	public Connection getConnection() throws Exception{
		String url = "jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(url, "", "");
	}
}
