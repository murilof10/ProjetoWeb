package br.com.fiap.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Produto;
import br.com.fiap.bo.FornecedorBO;
import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.connection.ConnectionFactory;

@WebServlet("/servlet")
public class Administrador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Administrador() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("usuario");
		request.setAttribute("AttrLogin", nome);
		try {
			Connection con = ConnectionFactory.controlarInstancia().getConnection();
			List<String> lista = new ArrayList<String>();
		    lista = FornecedorBO.buscarFornecedor(con);
		    request.setAttribute("AttrForn1", lista.get(0));
			request.setAttribute("AttrForn2", lista.get(1));
			request.setAttribute("AttrForn3", lista.get(2));
			
			List<Produto> lista2 = new ArrayList<Produto>();
		    lista2 = ProdutoBO.buscarProd(con);
		    int i = 1;
			for(Produto p : lista2){
				request.setAttribute("AttrProd"+i, p.getCor());
				i++;
			}
			request.getRequestDispatcher("/venda.jsp").include(request, response);
		}catch(Exception e){
			e.printStackTrace();
			request.getRequestDispatcher("erro.jsp").include(request, response);
		}
		
	}
	
	protected void usuario(String user, String tipe){
		
	}

}
