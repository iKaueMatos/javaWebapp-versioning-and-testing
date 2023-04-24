package model;

import controller.Comandos;
import java.io.IOException;
import controller.RegisterData;

public class Produto extends Caracteristicas {
	
		public Produto(String name, String region, Double price){
		super.setNome(name);
		super.setRegion(region);
		super.setPreco(price);
	}
	
	
	public static int calculo(Produto organico, Produto tradicional){
			Double precoOrg = organico.getPreco();
			Double precoTrad = tradicional.getPreco();
			Double parte = precoTrad / 100;
			
			int cont = 1;
			while (precoTrad <= precoOrg){
				precoTrad = parte * cont;
				cont++;
			}
			int result = cont - 100;
			return result;
		}
	
	public static int comparison(String region)throws IOException {
		
		if (region.equals("norte")){
			 Produto produtoTrad  = new Produto("Uva", "Norte", 4.50);
			 Produto produtoOrg  = new Produto("Uva", "Norte", 9.90);
			 return calculo(produtoOrg, produtoTrad);
		} else if (region.equals("nordeste")){
			Produto produtoTrad  = new Produto("Milho", "Nordeste", 7.90);
			Produto produtoOrg  = new Produto("Milho", "Nordeste", 8.90);
			return calculo(produtoOrg, produtoTrad);
		} else if (region.equals("centroeste")){
			Produto produtoOrg  = new Produto("Batata", "Centro-Oeste", 8.99);
			 Produto produtoTrad  = new Produto("Batata", "Centro-Oeste", 6.86);
			 return calculo(produtoOrg, produtoTrad);
		} else if (region.equals("suldeste")){
			Produto produtoTrad  = new Produto("Alface", "Suldeste", 4.30);
			Produto produtoOrg  = new Produto("Alface", "Suldeste", 7.70);
			return calculo(produtoOrg, produtoTrad);
		} else {
			Produto produtoTrad  = new Produto("Banana", "Sul", 6.90);
			Produto produtoOrg  = new Produto("Banana", "Sul", 10.00);
			return calculo(produtoOrg, produtoTrad);
		}
		
		
	}
	
}
