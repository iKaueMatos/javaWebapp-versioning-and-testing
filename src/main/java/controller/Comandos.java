package controller;

public class Comands {
	
	//Método validação string
	
	public static boolean validaString(String entrada) {
		entrada = entrada.toLowerCase();
		entrada = entrada.replaceAll("\\s+", ""); //Retira os espaços da entrada
		boolean resultado = entrada.matches("[a-z]{3,}");
		System.out.println(entrada);
		return resultado;
	}
	
	
	//Método validação numerico
	
	public static boolean validaNumerico(String numerico){

		String n1 = "690";
		
		numerico = numerico.replaceAll("\\s+", "");
		boolean resultado = numerico.matches("[0-9]{1,10}");
		
		
		return resultado;
	} 
	
	
	
}
