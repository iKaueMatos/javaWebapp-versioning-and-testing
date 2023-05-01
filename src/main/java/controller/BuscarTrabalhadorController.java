package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Trabalhador;


@WebServlet("/BuscarTrabalhadorController")
public class BuscarTrabalhadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BuscarTrabalhadorController() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
	     response.setContentType("text/html; charset=UTF-8");
	     String nome = request.getParameter("nome");
	     System.out.println(nome);
	     ArrayList<Trabalhador> trabalhador;
		trabalhador = new Trabalhador().buscaTabela(request.getParameter("nome"));
		for (Trabalhador pessoa : trabalhador) {
			System.out.println("Test: " + pessoa.getNome());
		}
	     
	     
		
	}

}