package model;

import java.sql.Connection;
import java.sql.DriverManager;


//Classe trabalhador
public class Trabalhador {
	
	private String nome;
	private String sobrenome;
	private String localidade;
	private String telefone;
	private String idade;
	private String cep;
	private String uf;
	private String bairro;
	

	
public Trabalhador(String nome, String sobrenome ,String localidade, String telefone,
			 
	String idade, String cep, String uf, String bairro){
	
		 setNome(nome);
		 setSobrenome(sobrenome);
		 setLocalidade(localidade);
		 setTelefone(telefone);
		 setIdade(idade);
		 setCep(cep);
		 setUf(uf);
		 setBairro(bairro);
	 
}
	 
public void ConexaoAzure() {

	String url = "jdbc:mysql://server12mysql.mysql.database.azure.com:3306/apsjava";
	   
	   try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, "Kaue", "Bontlindo12/");
	        System.out.println("Conectado azure");
	       
	   } catch (Exception e) {
	        System.out.println("Erro");
	       
	   }
	   
	}

	
	public String getNome() {
		return nome;
	}
			
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getSobrenome() {
		return sobrenome;
	}
		
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
		
	public String getTelefone() {
		return telefone;
	}
		
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
	public String getLocalidade() {
		return localidade;
	}
		
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
		
			public String getIdade() {
				return idade;
			}
		
			public void setIdade(String idade) {
				this.idade = idade;
			}
		
			public String getUf() {
				return uf;
			}
		
			public void setUf(String uf) {
				this.uf = uf;
			}
		
			public String getBairro() {
				return bairro;
			}
		
			public void setBairro(String bairro) {
				this.bairro = bairro;
			}
		
			public String getCep() {
				return cep;
			}
		
			public void setCep(String cep) {
				this.cep = cep;
			}
	
	
}
