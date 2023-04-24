package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.Comandos;
import model.Produto;

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
	        String area = request.getParameter("area");
	        float areaConvertida = Comandos.validaArea(area);
	        String estilo = "";
	        
	        Produto p1 = new Produto("Arroz","Sudeste",5.50);
	        
	        RequestDispatcher teste = request.getRequestDispatcher("teste.jsp");
			request.setAttribute("produto", p1.getNome());
			teste.forward(request, response);
	        
	        
	        //Teste da comparação
	
	        //Criar forma de detectar qual regiao o usuario escolheu, com isso definir
	        //quais produtos entram como parametro no comparison() abaixo.
	        
//	        System.out.println("Você terá " + Produto.comparison(produtoOrg1, produtoTrad1) + "% de ganho "
//	        		+ "sobre o produto convencional");
	  
	        //Estilo
	        
	        Comandos.estiloPagina(estilo);
	        response.getWriter().println(Comandos.estiloPagina(estilo));
	        
		    //verification region
	        
	        Comandos.validationRegion(region);
	        response.getWriter().println(Comandos.validationRegion(region));
	        System.out.println("Teste valor" + Produto.comparison(Comandos.validationRegion(region)));
	        
	        
	        
	        //verification name
	        
	        boolean validacaoNome = Comandos.validaString(name);
	        if (validacaoNome == true) {
	        	 response.getWriter().println("Nome válido");
	        	 System.out.println("Nome válido");
	        } else {
	        	response.getWriter().println("Nome inválido");
	        	System.out.println("Nome inválido");
	        }
	        
	        //verification area
	        
	        if (areaConvertida > 0) {
	        	response.getWriter().println("Área válida");
	        	System.out.println("Área válida");
	        	
	        } else {
	        	response.getWriter().println("Área inválida");
	        	System.out.println("Área Inválida");
	        }
	        
	        // Mensagem sucesso
	        
	        if (validacaoNome == true && areaConvertida > 0 && Comandos.validationRegion(region) == "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>"
	        		+ "<div class='alert alert-success col-5 m-3' role='alert'>Região valida</div>") {
	        	response.getWriter().println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>"
	        		+ "<div class='alert alert-success col-5 m-3' role='alert'>Formulário enviado com sucesso</div>");
	        } 
	        
	    }	  
	    
	   
	   

	  
	   
 	       
	}
