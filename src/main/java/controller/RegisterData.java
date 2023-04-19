package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	/**Servlet implementation class cadastrarDados*/


	@WebServlet("/RegisterData")
	public class RegisterData extends HttpServlet {

	    //Private -> Final long -> Numero de serie
	    private static final long serialVersionUID = 1L;

	    public RegisterData() {
	        super();

	    }

	    //GET
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.getWriter().append("Served at: ").append(request.getContextPath());
	        System.out.println("RECEBI A REQUISIÇÃO | GET");
	    }

	    //POST 
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        //Defining what will be the request and response of the text
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html; charset=UTF-8");
	        System.out.println("RECEBI A REQUISIÇÃO | POST");
	        
	        String name = request.getParameter("nome");
	        String region = request.getParameter("regiao");
	        var energeticValue = request.getParameter("valorEnergetico");
	        var weight = request.getParameter("peso");
	        var price = request.getParameter("preco");
	        
	    }	    
	    
	    //verification
	    
	    public String verificationName(String name) throws IOException {
	    	
	    	if (name.length() > 2 && name.length() <= 30 ){
	    		System.out.println("Nome permitido");
	    		// show to developers
			//Direct forward to database
			} else {
				ServletResponse response = null;
				try (PrintWriter out = response.getWriter()) {
					out.printf("<p>Error digite seu nome novamente</p>");
				}
			}
			return name;
		    
	    }
	  
	    public String verificationRegion(String region) {
	    	if (region.length() > 2 && region.length() <= 30 ) { 
	    		System.out.println("Regiao permitida"); // Show to developers
	    	//Direct forward to database
	    		
	    	}
	    	return region;
	    }
	    
	    public float verificationEnergeticValue(float energeticValue) {
	    	return energeticValue;
	    }
	    
	    public float verificationPrice(float price) throws IOException {
	    	
	    	if (price >= 20 && price <= 500 ) {
				boolean priceBank = true;
			}else {
				boolean princeBank = false;
			}
			return price;
	
	    }
	        
	}
