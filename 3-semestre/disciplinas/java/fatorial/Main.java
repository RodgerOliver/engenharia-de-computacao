import javax.swing.*;

class Main {
	public static void main(String[] args) {
		String app_name = "Fatorial v1.0";

		byte num = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite um número", app_name, 1));
		Fatorial fat = new Fatorial(num);

		long fat_num = fat.calcular();
		String output = "";
		if(fat_num == -1) {
			output = "Erro: "+ fat.getNumero() + " é negativo";
		} else {
			output = fat.getNumero() + " fatorial é " + fat.calcular();
		}

		JOptionPane.showMessageDialog(null, output, app_name, 1);

	}
}
