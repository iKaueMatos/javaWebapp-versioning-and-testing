package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastrarDados
 */


//Classe
@WebServlet("/cadastrarDados")
public class cadastrarDados extends HttpServlet {
	
	//Private -> Final long -> Numero de serie
	private static final long serialVersionUID = 1L;
       	
	// Construtor -> Dados 
    public cadastrarDados() {
        super();
    
    }

    
    //Get 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("RECEBI A REQUISIÇÃO | GET");
	}

	
	//Post 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Definindo qual sera request e response do texto
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("RECEBI A REQUISIÇÃO | POST");
		
		
		String texto1 = request.getParameter("texto1");
		String texto2 = request.getParameter("texto2");
		String texto3 = request.getParameter("texto3");
		
		
		System.out.println("Texto 1" + texto1);
		System.out.println("Texto 1" + texto2);
		System.out.println("Texto 1" + texto3);
		
		
		
	}
}
