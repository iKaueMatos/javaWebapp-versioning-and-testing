package controller;

import java.io.IOException;

public class Comandos {

	// Método validação string
	public static boolean validaString(String entrada) {
		
		entrada = entrada.toLowerCase();
		entrada = entrada.replaceAll("\\s+", ""); // Retira os espaços da entrada
		entrada = entrada.replaceAll("-", ""); 
		boolean resultado = entrada.matches("[a-z]{3,}");
		System.out.println(entrada); 
		
		return resultado; 
	}

	//Método validação area
	public static float validaArea(String numerico){
		
		String n1 = numerico;
		String n2 = numerico;
		n1 = n1.replaceAll("\\s+", "");
		n1 = n1.replace(",",".");
		n2 = n2.replaceAll(".", "");
		boolean resultado = n2.matches("[0-9]{1,10}");
		if (resultado = true) {
			float valida1 = Float.parseFloat(n1);
			System.out.println(valida1);
			return valida1;
		}
		
		float valor = 0;
		return valor;
		
	}

	// Estilo página generica
	public static String estiloPagina(String style) throws IOException {

		String estilo = "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>" + "<a class='dark' href='./form.jsp'>Voltar</a>";
		return estilo;

	}

	// Validação região

	public static String validationRegion(String region) throws IOException {
		
		region = region.toLowerCase();
		region = region.replaceAll("\\s+", "");
		region = region.replaceAll("-", ""); 
    	
    	if(region.equals("sul") || region.equals("sudeste") || region.equals("norte") || region.equals("nordeste") || region.equals("centrooeste")) {
    		System.out.println("Região válida");
    		String mensagem = "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>"
	        		+ "<div class='alert alert-success col-5 m-3' role='alert'>Região valida</div>";
		return mensagem;
		} else {
			System.out.println("Região inválida");
			String mensagem = ("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>" +
			"<div class='alert alert-danger' role='alert'>Região invalida </div>");
			
			return mensagem;
    	}
	}
	
	
	
}

