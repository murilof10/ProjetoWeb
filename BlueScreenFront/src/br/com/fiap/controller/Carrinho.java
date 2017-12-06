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

@WebServlet("/carrinho")
public class Carrinho extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Carrinho() {
        super();
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int qtdProd1 = Integer.valueOf(request.getParameter("qtd1"));
		int qtdProd2 = Integer.valueOf(request.getParameter("qtd2"));
		int qtdProd3 = Integer.valueOf(request.getParameter("qtd3"));
		double total = 0;
		String nome = request.getParameter("usuario");
		request.setAttribute("AttrLogin", nome);
		request.setAttribute("AttrCliente", "cliente");
		try {
			Connection con = ConnectionFactory.controlarInstancia().getConnection();
			List<Produto> lista2 = new ArrayList<Produto>();
		    lista2 = ProdutoBO.buscarProd(con);
		    int i = 1;
			for(Produto p : lista2){
				int qtdProd = Integer.valueOf(request.getParameter("qtd"+i));
				request.setAttribute("AttrPreco"+i, p.getPreco());
				request.setAttribute("AttrProd"+i, p.getCor());
				i++;
				total += p.getPreco() * qtdProd;
			}
			request.setAttribute("AttrTotal", total);
			request.setAttribute("AttrQtd1", qtdProd1);
			request.setAttribute("AttrQtd2", qtdProd2);
			request.setAttribute("AttrQtd3", qtdProd3);
			request.getRequestDispatcher("/carrinho.jsp").include(request, response);
		}catch(Exception e){
			e.printStackTrace();
			request.getRequestDispatcher("erro.jsp").include(request, response);
		}
	}

}
