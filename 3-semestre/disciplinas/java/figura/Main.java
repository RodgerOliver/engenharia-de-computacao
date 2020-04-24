import javax.swing.*;

public class Main {
	public static void main(String[] args){
		String app_name = "Figura v.1.0";

		String figura_tipos[] = {"Retângulo", "Círculo"};

		String tipo_figura = (String)JOptionPane.showInputDialog(null, "Selecione a figura desejada", app_name, 3, null, figura_tipos, figura_tipos[0]);

		Figura figura;
		if(tipo_figura.equals(figura_tipos[0])) {

			JTextField comprimento_field = new JTextField();
			JTextField largura_field = new JTextField();

			Object[] message = {
				"Comprimento:", comprimento_field,
				"Largura:", largura_field
			};

			JOptionPane.showConfirmDialog(null, message, "Digite as informações do retângulo", JOptionPane.DEFAULT_OPTION);

			double comprimento = Double.parseDouble(comprimento_field.getText());
			double largura = Double.parseDouble(largura_field.getText());

			figura = new Retangulo(comprimento, largura);
		} else {
			double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio do círculo", app_name, 3));
			figura = new Circulo(raio);
		}

		JOptionPane.showMessageDialog(null, figura.dados(), app_name, 1);

		System.exit(0);
	}
}
