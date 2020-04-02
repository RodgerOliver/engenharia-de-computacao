import javax.swing.*;

class Main {
	public static void main(String[] args) {
		String app_name = "ProdutoDeDoisNumeros v1.0";
		ProdutoDeDoisNumeros obj = null;

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º numero", app_name, 3));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º numero", app_name, 3));

		obj = new ProdutoDeDoisNumeros(num1, num2);

		String output =
			obj.getNumero1() + " x " + obj.getNumero2()
			+ "\nFor:      "+ obj.calcular_for()
			+ "\nWhile:    "+ obj.calcular_while()
			+ "\nDo While: "+ obj.calcular_do_while();

		JOptionPane.showMessageDialog(null, output, app_name, 1);

	}
}
