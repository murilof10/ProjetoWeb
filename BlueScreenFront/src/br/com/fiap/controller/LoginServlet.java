package br.com.fiap.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.ClienteBO;
import br.com.fiap.connection.ConnectionFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = ConnectionFactory.controlarInstancia().getConnection();
			String nome = request.getParameter("usuario");
			String senha = request.getParameter("senha");
			int resultado = ClienteBO.logar(nome, senha, con);
			if(resultado == 1){
				request.setAttribute("AttrLogin", nome);
				request.setAttribute("AttrCliente", "cliente");
				request.getRequestDispatcher("servlet").include(request, response);
			}else{
				request.getRequestDispatcher("erro.jsp").include(request, response);
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
