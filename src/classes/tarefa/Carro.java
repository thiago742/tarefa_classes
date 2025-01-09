package classes.tarefa;

public class Carro {
	
	private boolean ligado = false;
	private int velocidadeMax = 210;
	private int velocidadeAtual = 0;
	
	
	public void ligarCarro() {
		ligado = true;
	}

	public void acelerarCarro() {
		if (ligado) {
			if (velocidadeAtual < velocidadeMax) {
			velocidadeAtual += 30;
			}
			if (velocidadeAtual == velocidadeMax) {
				System.out.println("Cuidado! velocidade máxima atingida, desacelere ou mantenha a velocidade!");
			}
		} else {
			System.out.println("Ligue o carro!");
		}
	}
	
	public void desacelerarCarro() {
		if (velocidadeAtual >= 10) {
			velocidadeAtual -= 10;
		}
	}
	
	public void lerVelocimetro() {
		System.out.println("Velocidade Atual: " + velocidadeAtual);
	}
}
