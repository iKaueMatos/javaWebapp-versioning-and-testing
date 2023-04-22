package controller;
public class Comandos {
	
	//Método validação string
	
	public static boolean validaString(String entrada) {
		entrada = entrada.toLowerCase();
		entrada = entrada.replaceAll("\\s+", ""); //Retira os espaços da entrada
		boolean resultado = entrada.matches("[a-z]{3,}");
		System.out.println(entrada);
		return resultado;
	}
	
	
	//Método validação numerico
	
	public static float validaNumerico(String numerico){
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
	
	
	// Validação região
	
	public static String validaRegiao(String regiao) {
		
		regiao = regiao.toLowerCase();
		regiao = regiao.replaceAll("\\s+", "");
		regiao = regiao.replaceAll("-", ""); 
		
		
		return regiao;
	}

	
}
