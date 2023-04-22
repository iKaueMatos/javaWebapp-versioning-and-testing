package model;

public class Data {
	private int id;
	private double energeticValue;
	private double weight;
	private double price;
	private String name;
	private String region;


    //Construtor padrão 
    public Data() {

    }

    //2 Construtor
    public Data(int id,String name,String region,double energeticValue,double weight,double price) {
        this.id = id;
        this.setName(name);
        this.setRegion(region);
        this.setEnergeticValue(energeticValue);
        this.setWeight(weight);
        this.setPrice(price); 
    }

	private void setPrice(double price2) {
		// TODO Auto-generated method stub
		
	}

	private void setRegion(String region2) {
		// TODO Auto-generated method stub
		
	}



	private void setEnergeticValue(double energeticValue2) {
		// TODO Auto-generated method stub
		
	}



	//3 Construtor
    public Data(int id,String name,String region) {
        this.id = id;
        this.setName(name);
        this.setRegiao(region);
    }

       
        //Getters e Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        
		public double getEnergeticValue() {
			return energeticValue;
		}

		public void setValorEnergetico(double energeticValue) {
			this.energeticValue = energeticValue;
		}

		/**
		 * @return the regiao
		 */
		public String getRegion() {
			return getRegion();
		}
		
		/**
		 * @param regiao the regiao to set
		 */
		public void setRegiao(String region) {
			this.region = region;
		}

		/**
		 * @param preco the preco to set
		 */
		public void setPreco(double price) {
			this.price = price ;
		}

		/**
		 * @return the nome
		 */
		public String getName() {
			return getName();
		}

		/**
		 * @param nome the nome to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the peso
		 */
		public double getWeight() {
			return weight;
		}

		/**
		 * @param peso the peso to set
		 */
		public void setWeight(double weight) {
			this.weight = weight;
		}
}