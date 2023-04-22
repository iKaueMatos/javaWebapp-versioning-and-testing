package model;

public abstract class Caracteristicas {

	private String nome;
	private Double preco;
	private String regiao;
	private Double carboidrato;
	private Double proteina;
	private Double gordura;
	private Integer valorEnergetico; 
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setCarboidrato(Double valor){
		this.carboidrato = valor;
	}
	
	public Double getCarboidratos(){
		return carboidrato;
	}
	
	public void setProteina(Double valor){
		this.proteina = valor;
	}
	
	public Double getProteina(){
		return proteina;
	}
	
	public void setGordura(Double valor){
		this.gordura = valor;
	}
	
	public Double getGordura(){
		return gordura;
	}
	
	public Integer valorEnergeticoCalc(){
		if(carboidrato < 4){
			System.out.println("Este produto não atende aos requisitos de informações nutricionais, por este motivo ele é invalido.");
		}
		
		else if(proteina < 4){
			System.out.println("Este produto não atende aos requisitos de informações nutricionais, por este motivo ele é invalido.");
		}
		
		else if(gordura < 9){
			System.out.println("Este produto não atende aos requisitos de informações nutricionais, por este motivo ele é invalido.");
		}
		
		else {
			Double temporaria1 = carboidrato * 4;
			Double temporaria2 = proteina * 4;
			Double temporaria3 = gordura * 9;
			temporaria1 = temporaria1 + temporaria2 + temporaria3;
			String valorEnergeticoi = Double.toString(temporaria1);
			//valorEnergeticoi = String.sub                           --> Parei aqui!.
			valorEnergetico = Integer.parseInt(valorEnergeticoi);
			return valorEnergetico; 
		}
	}
}
