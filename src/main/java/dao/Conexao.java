package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Trabalhador;

public class Conexao {
	String url = "jdbc:mysql://server12mysql.mysql.database.azure.com:3306/apsjava";
	public void conectar() {

		 
	       try {
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection conn = DriverManager.getConnection(url, "Kaue", "Bontlindo12/");
	           System.out.println("Conectado ao banco de dados com sucesso");
	       }catch (Exception e) {
	           System.out.println("Erro");
	       }
	   }
	
	public void insert(Trabalhador trabalhador) {
		String nome = trabalhador.getNome();
		String sobrenome = trabalhador.getSobrenome();
		String localidade = trabalhador.getLocalidade();
		String telefone = trabalhador.getTelefone();
		String idade = trabalhador.getIdade();
		String cep = trabalhador.getCep();
		String uf = trabalhador.getUf();
		String bairro = trabalhador.getBairro();
		String url = "jdbc:mysql://server12mysql.mysql.database.azure.com:3306/apsjava";
		String comando = "INSERT INTO Trabalhadores (nome, sobrenome, localidade, telefone, idade, cep, uf, bairro) VALUES ('"+ nome +"','"+sobrenome+"','"+localidade+"','"+telefone+"','"+idade+"','"+cep+"','"+uf+"','"+bairro+"');";
		try {
			Connection conn = DriverManager.getConnection(url, "Kaue", "Bontlindo12/");
			//AQUI VAI O CÓDIGO
			PreparedStatement adicionar = conn.prepareStatement(comando);
			adicionar.executeUpdate();
			System.out.println("insert executado com sucesso");
			conn.close();
		} catch(Exception e) {
			System.out.println("Erro ao executar o insert");
		}
	}
	
	public void select() {
		String url = "jdbc:mysql://server12mysql.mysql.database.azure.com:3306/apsjava";
		String comando = "SELECT * FROM Trabalhadores;";
		int numero = 0;
		try {
			Connection conn = DriverManager.getConnection(url, "Kaue", "Bontlindo12/");
			PreparedStatement pesquisa = conn.prepareStatement(comando);
			ResultSet resultado = pesquisa.executeQuery();
			while (resultado.next()) {
				numero++;
				String nome = resultado.getString("nome");
				String sobrenome = resultado.getString("sobrenome");
				String localidade = resultado.getString("localidade");
				String telefone = resultado.getString("telefone");
				String idade = resultado.getString("idade");
				String cep = resultado.getString("cep");
				String uf = resultado.getString("uf");
				String bairro = resultado.getString("bairro");
				System.out.println("\nNome: "+nome+"\nSobrenome: "+sobrenome+"\nLocalidade: "+localidade+"\nTelefone: "+telefone+"\nIdade: "+idade+"\nCEP: "+cep+"\nUF: "+uf+"\nBairro: "+bairro+".");
			}
			System.out.println(numero + " resultados encontrados.");
			conn.close();
		} catch (Exception e) {
			System.out.println("Erro no select");
		}
	}
	
	
	
	
	
//	JA FOI EXECUTADO!!!!!!!!!!
	
//	public static void createTable() {	
//		String url = "jdbc:mysql://server12mysql.mysql.database.azure.com:3306/apsjava";
//		String comando = "create table Trabalhadores (id INT(3) NOT NULL AUTO_INCREMENT, nome VARCHAR(20) NOT NULL, sobrenome VARCHAR(50) NOT NULL, localidade VARCHAR(200) NOT NULL, telefone VARCHAR(200) NOT NULL, idade VARCHAR(2) NOT NULL, cep VARCHAR(200) NOT NULL, uf VARCHAR(3) NOT NULL, bairro VARCHAR(200), primary key(id));";
//		try {
//			Connection conn = DriverManager.getConnection(url, "Kaue", "Bontlindo12/");
//			PreparedStatement adicionar = conn.prepareStatement(comando);
//			adicionar.execute();
//			System.out.println("tabela criada");
//			conn.close();
//		} catch (Exception e) {
//			System.out.println("Erro ao criar dados");
//		}	
//	}
	
  }
