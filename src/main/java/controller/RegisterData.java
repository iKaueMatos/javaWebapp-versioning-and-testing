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
	        
	        
	        //Teste da comparação
	        Produto macaOrg  = new Produto();
	        Produto macaTrad = new Produto();
	        
	        macaOrg.setPreco(10.9);
	        macaTrad.setPreco(6.50);
	        System.out.println("Você terá " + Produto.comparison(macaOrg, macaTrad) + "% de ganho.");
	        
	        
	        
	        
	    }	   
	   
	    //verification
	  
	    public String verificationName(String name) throws IOException {
	    	
	    	if (Comandos.validaString(name)){
	    		System.out.println("Nome permitido");
	    		ServletResponse response = null;
	    		PrintWriter out = response.getWriter();
	    		out.printf("");
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
	   
	    public String verificationPrice(String area) throws IOException {
	    	
	    	if (Comandos.validaNumerico(area) != 0 ) {
				boolean priceBank = true;
			}else {
				boolean princeBank = false;
			}
			return area;
	
	    }
	    
	    public static void verificationRegion(String region) throws IOException {
	    	
	    	if(region.equals("sul") || region.equals("sudeste") || region.equals("norte") || region.equals("nordeste") || region.equals("centrooeste")) {
			System.out.println("Região válida");
			} else {
				System.out.println("Região inválida");
			}
	    	
	    	
	    }
 	       
	}
