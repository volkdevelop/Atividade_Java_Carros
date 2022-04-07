package tarefa01;

public class Carro {
		private String numChassi;
		private double velocidadeMaxima;
		private double quilometragem;
		private double potencia;
		private String cor;
		private int qtdPortas;
		
	    public Carro(String numChassi, double velocidadeMaxima, double quilometragem, 
	    	double potencia, String cor) {
	    	this.numChassi = numChassi;
	    	this.velocidadeMaxima = velocidadeMaxima;
	    	this.quilometragem = quilometragem;
	    	this.potencia = potencia;
	    	this.cor = cor;
	    	this.qtdPortas= 4;
	    }
	    
	    public void ligar() {
	    	System.out.println("Ligando");
	    }
	    
	    public void desligar() {
	    	System.out.println("Desligando");
	    }
	    
	    public void acelerar(){
	    	System.out.println("Acelerando");
	    }
		
		public void frear() {
			System.out.println("Freando");
		}
	    
}
