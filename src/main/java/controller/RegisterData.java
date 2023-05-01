package controller;
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
import java.net.URLDecoder;
import model.Trabalhador;
import dao.Conexao;
import controller.Validacao;

//import DAO.Conexao;
import java.io.File;
import java.io.IOException;

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
	           
	        String cep = request.getParameter("cep");
	        String uf = request.getParameter("uf");
	        String bairro = request.getParameter("bairro");
	        
	        System.out.println("Nome" +
 				   "idade:" + cep +
 				   "Estado:" + uf +
 				   "Bairro:" + bairro);
 		}
 			
	   
	    //POST
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html; charset=UTF-8");
	        System.out.println("RECEBI A REQUISIÇÃO | POST");
	       
	        String nome = request.getParameter("nome");
	        String decodedNome = URLDecoder.decode(nome, "UTF-8");
	        String sobrenome = request.getParameter("sobrenome");
	        String decodedSobrenome = URLDecoder.decode(sobrenome, "UTF-8");
	        String localidade = request.getParameter("localidade");
	        String decodedLocalidade = URLDecoder.decode(localidade, "UTF-8");
	        String telefone = request.getParameter("telefone");
	        String idade = request.getParameter("idade");
	        String cep = request.getParameter("cep");
	        String uf = request.getParameter("uf");
	        String logradouro = request.getParameter("logradouro");
	        String decodedLogradouro = URLDecoder.decode(logradouro, "UTF-8");
	        String bairro = request.getParameter("bairro");
	        String decodedBairro = URLDecoder.decode(bairro, "UTF-8");
	        
	        //Validacao
	       
	        

	        Trabalhador teste = new Trabalhador(decodedNome, decodedSobrenome, decodedLocalidade, telefone,
	        		idade, cep, uf, decodedLogradouro, decodedBairro);
	        teste.conectar();
	        teste.insert(teste);
	        teste.select();
	        
	        //Dispatcher
	        
	    /*   String mensagem;
	       RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
	       
	     if(request.getParameter("nome") != null ) {
			  mensagem = "Dados enviados com sucesso";
	    	  request.setAttribute("mensagem", mensagem);
		      dispatcher.forward(request, response);
		       
	     } else {
	         mensagem = "Os campos precisam ser preenchidos!";
	    	 request.setAttribute("mensagem", mensagem);
		     dispatcher.forward(request, response);
	     } */
	     
	     String mensagem;
	       RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
	       
	     if(teste.conectar() == true) {
			  mensagem = "Dados enviados com sucesso";
	    	  request.setAttribute("mensagem", mensagem);
		      dispatcher.forward(request, response);
		       
	     } else {
	         mensagem = "Erro de conexão com o banco de dados, tente novamente";
	    	 request.setAttribute("mensagem", mensagem);
		     dispatcher.forward(request, response);
	     }
	     
	     
	    }
	    
}
	        
