package br.com.fiap.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Cliente;
import br.com.fiap.bo.ClienteBO;
import br.com.fiap.connection.ConnectionFactory;


@WebServlet("/cad")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cadastro() {
        super();
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("name");
		String email = request.getParameter("email");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		try{
			Cliente obj = new Cliente();
			obj.setNome(nome);
			obj.setEmail(email);
			obj.setRg(rg);
			obj.setCpf(cpf);
			obj.setSexo(sexo.charAt(0));
			obj.setLogin(login);
			obj.setSenha(senha);
			Connection con = ConnectionFactory.controlarInstancia().getConnection();
			ClienteBO.cadastrarCliente(obj, con);
			request.getRequestDispatcher("index.jsp").include(request, response);
		}catch(Exception e){
			e.printStackTrace();
			request.getRequestDispatcher("erro.jsp").include(request, response);
		}
	}

}
