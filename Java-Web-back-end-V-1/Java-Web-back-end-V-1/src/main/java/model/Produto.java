package model;

public class Produto extends Caracteristicas {
	
		public Produto(String name, String region, Double price){
		super.setNome(name);
		super.setRegion(region);
		super.setPreco(price);
	}
	
	public static int comparison(Produto organico, Produto tradicional){
		Double precoOrg = organico.getPreco();
		Double precoTrad = tradicional.getPreco();
		Double parte = precoTrad / 100;
		
		
		int cont = 1;
		while (precoTrad <= precoOrg){
			precoTrad = parte * cont;
			cont++;
		}
		return cont - 100;
	}
	
}
