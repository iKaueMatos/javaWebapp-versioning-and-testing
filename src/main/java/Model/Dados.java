package Model;

public class Dados {
	
	private int id;
	private String texto1;
	private int texto2;
	private double texto3;
	
	
	//Construtor padrão 
	public Dados() {
		
	}
	
	
	
	//2 Construtor
	public Dados(int id,String texto1,int texto2,double texto3) {
		this.id = id;
		this.texto1 =texto1;
		this.texto2 = texto2;
		this.texto3 =texto3;
	}
	
	
	//3 Construtor
		public Dados(String texto1,int texto2,double texto3) {
			this.texto1 =texto1;
			this.texto2 = texto2;
			this.texto3 =texto3;
		}

		
		//Getters e Setters
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getTexto1() {
			return texto1;
		}



		public void setTexto1(String texto1) {
			this.texto1 = texto1;
		}



		public int getTexto2() {
			return texto2;
		}



		public void setTexto2(int texto2) {
			this.texto2 = texto2;
		}



		public double getTexto3() {
			return texto3;
		}



		public void setTexto3(double texto3) {
			this.texto3 = texto3;
		}
	
	
		
		
		
	
	
	
	
}
