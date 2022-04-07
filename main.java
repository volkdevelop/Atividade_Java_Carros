package tarefa01;
import tarefa01.Carro;

public class main {

	public static void main(String[] args) {
			
		Carro gol = new Carro("1234", 200, 0, 50, "vermelho");
		Carro toro= new Carro("4343",350,0,350,"branco");
		Carro siena= new Carro("3567",220,0,90,"preto");
		
		gol.ligar();
		toro.acelerar();
		siena.frear();
				
	}

}
