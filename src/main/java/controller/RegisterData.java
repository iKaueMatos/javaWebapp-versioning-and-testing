package controller;
import java.io.IOException;
import java.io.PrintWriter;
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
	        
	        
	        //Teste da comparação
	             
	        
	        //Produtos Tradicionais
	        Produto produtoTrad1  = new Produto("Banana", "Sul", 6.90);
	        Produto produtoTrad2  = new Produto("Uva", "Norte", 4.50);
	        Produto produtoTrad3  = new Produto("Milho", "Nordeste", 7.90);
	        Produto produtoTrad4  = new Produto("Alface", "Suldeste", 4.30);
	        Produto produtoTrad5  = new Produto("Batata", "Centro-Oeste", 6.86);
	        
	        //Produtos organicos
	        Produto produtoOrg1  = new Produto("Banana", "Sul", 10.00);
	        Produto produtoOrg2  = new Produto("Uva", "Norte", 9.90);
	        Produto produtoOrg3  = new Produto("Milho", "Nordeste", 8.90);
	        Produto produtoOrg4  = new Produto("Alface", "Suldeste", 7.70);
	        Produto produtoOrg5  = new Produto("Batata", "Centro-Oeste", 8.99);
	        
	        
	        //Criar forma de detectar qual regiao o usuario escolheu, com isso definir
	        //quais produtos entram como parametro no comparison() abaixo.
	        
	        System.out.println("Você terá " + Produto.comparison(produtoOrg1, produtoTrad1) + "% de ganho "
	        		+ "sobre o produto convencional");
	  
	        //Estilo
	        
	        Comandos.estiloPagina(estilo);
	        response.getWriter().println(Comandos.estiloPagina(estilo));
	        
		    //verification region
	        
	        Comandos.verificationRegion(region);
	        response.getWriter().println(Comandos.verificationRegion(region));
	        
	        
	        
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
	        
	    }	   
	   

	  
	   
 	       
	}
