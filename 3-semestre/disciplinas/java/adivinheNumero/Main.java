import javax.swing.*;
import jogo.*;

class Main {

	public static void main(String[] args) {
		Main program = new Main();

		program.mine();
	}

	private void mine() {
		String app_name = "Jogo v1.0";

		adivinheNumero jogo = new adivinheNumero();

		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente adivinhar o número", app_name, 3));
		boolean acertou = false;
		int icon;

		do {
			if(jogo.getTentativas() != 0) {
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente novamente", app_name, 3));
			}
			acertou = jogo.acertou(num);

		} while(!acertou && jogo.getTentativas() < 10);

		String output = "";
		if(acertou) {
			output = "Parabéns!! Você acertou o número " + jogo.getNum() + " em " + jogo.getTentativas() + " tentativas.";
			icon = 1;
		} else {
			output = "Você errou!! O número era " + jogo.getNum();
			icon = JOptionPane.WARNING_MESSAGE;
		}

		JOptionPane.showMessageDialog(null, output, app_name, icon);
	}

	private void other() {
		String app_name = "Jogo v1.0";

		adivinheNumero jogo = new adivinheNumero();

		int num;
		boolean acertou = false;
		int continua = 0;
		String output;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor entre 0 e 10", app_name, 3));
			acertou = jogo.acertou(num);

			if(acertou) {
				output = "Parabéns! Você acertou o número " + jogo.getNum() +
					" em " + jogo.getTentativas() + " tentativas.";

				JOptionPane.showMessageDialog(null, output, app_name, 1);

			} else {
				output = "Você errou! Deseja tentar novamente?";
				continua = JOptionPane.showConfirmDialog(null, output, app_name, JOptionPane.YES_NO_OPTION, 3);
			}

		} while(continua == 0 && acertou == false);

		if(!acertou) {
			output = "Você não acertou, tente novamente mais tarde.";
			JOptionPane.showMessageDialog(null, output, app_name, JOptionPane.WARNING_MESSAGE);
		}
	}
}
