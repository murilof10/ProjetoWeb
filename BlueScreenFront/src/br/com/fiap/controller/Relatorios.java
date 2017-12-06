package br.com.fiap.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.RelatorioBO;
import br.com.fiap.connection.ConnectionFactory;

@WebServlet("/rel")
public class Relatorios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Relatorios() {
        super();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     	String busca = request.getParameter("fornecedor");
		try{
			Connection con = ConnectionFactory.controlarInstancia().getConnection();
			
			List<String> result = new ArrayList<String>();
			result = RelatorioBO.buscar(busca, con);
			request.setAttribute("AttrArmE", result.get(0));
			request.setAttribute("AttrTotalE", result.get(1));
			request.getRequestDispatcher("/relatorio.jsp").include(request, response);
		}catch(Exception e){
			e.printStackTrace();
			request.getRequestDispatcher("erro.jsp").include(request, response);
		}
	}

}
