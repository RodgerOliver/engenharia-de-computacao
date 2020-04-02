package jogo;
import java.util.Random;

public class adivinheNumero {
	/* atributos */
	private int num;
	private int tentativas;

	/* construtor */
	public adivinheNumero() {
		geraValorAleatorio();
	}

	/* metodos */
	private void geraValorAleatorio() {
		Random random = new Random();
		this.num = random.nextInt(11); // de 0 a 10
	}

	public boolean acertou(int input) {
		this.tentativas++;
		return input == this.num;
	}

	/* getters */
	public int getNum() {
		return this.num;
	}

	public int getTentativas() {
		return this.tentativas;
	}

	/* setters */

}
