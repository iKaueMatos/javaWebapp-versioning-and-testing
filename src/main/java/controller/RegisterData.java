package controller;

//Biblioteca
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Trabalhador;
import java.io.IOException;

	/**Servlet implementation class cadastrarDados*/
	@WebServlet("/RegisterData")
	public class RegisterData extends HttpServlet {
	    //Private -> Final long -> Numero de serie
	    private static final long serialVersionUID = 1L;
	    public RegisterData() {
	        super();
	    }
	    
	    //GET -> Pedindo a informação
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.getWriter().append("Served at: ").append(request.getContextPath());
	        System.out.println("RECEBI A REQUISIÇÃO | GET");
	           
	        String cep = request.getParameter("cep");
	        String uf = request.getParameter("uf");
	        String bairro = request.getParameter("bairro");
	       
	    }
	    
	    //POST -> Recebe as informações do usuario
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html; charset=UTF-8");
	        System.out.println("RECEBI A REQUISIÇÃO | POST");
	     
	        String nome = request.getParameter("nome");
	        String sobrenome = request.getParameter("sobrenome");
	        String localidade = request.getParameter("localidade");
	        String telefone = request.getParameter("telefone");
	        String idade = request.getParameter("idade");
	        String cep = request.getParameter("cep");
	        String uf = request.getParameter("uf");
	        String bairro = request.getParameter("bairro");
	         
	        //Banco de dados AZURE
	        Trabalhador teste = new Trabalhador(nome, sobrenome, localidade, telefone, idade, cep, uf, bairro);
	        teste.ConexaoAzure();
	        
	        //Dispatcher Imagem de sucesso
	       String mensagem;
	       mensagem = "Dados enviados com sucesso";
	       		if(request.getParameter("nome") != null ) {
			    	  request.setAttribute("mensagem", mensagem);
				      RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
				      dispatcher.forward(request, response); 
		      
			     } else {
			         mensagem = "Os campos precisam ser preenchidos!";
			    	 request.setAttribute("mensagem", mensagem);
				     RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
				     dispatcher.forward(request, response);
			     }
	    }
}
 	       
	
