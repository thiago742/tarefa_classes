package classes.tarefa;

/**
 * @author thiago
 */

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.ligarCarro();
		
		//Acelerando carro até velocidadeMax para testar o método
		carro.acelerarCarro();
		carro.acelerarCarro();
		carro.acelerarCarro();
		carro.acelerarCarro();
		carro.acelerarCarro();
		carro.acelerarCarro();
		carro.acelerarCarro();
		
		//freando carro
		carro.desacelerarCarro();
		carro.desacelerarCarro();
		carro.desacelerarCarro();
		carro.desacelerarCarro();

		
		//checando velocidadeAtual para testar o método
		carro.lerVelocimetro();
	}

}
