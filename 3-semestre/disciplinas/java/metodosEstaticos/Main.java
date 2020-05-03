import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		String app_name = "metodosEstáticos v1.0";

		/* build form */
		String metodos[] = {"Maior", "Dobro", "É Par", "Soma de Dois números", "Múltiplos de 2", "É Primo"};

		JComboBox metodo_field = new JComboBox(metodos);
		metodo_field.setSelectedIndex(0);

		Object[] message = {
			"Escolha uma opção:", metodo_field
		};

		while(true) {
			/* show form */
			int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

			/* exit if Cancel */
			if(option != 0) {
				JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
				System.exit(0);
			}

			/* get info */
			String metodo = (String)metodo_field.getSelectedItem();

			/* execute static method */
			String output = "";
			if(metodo.equals(metodos[0])) {
				int[] res = metodosEstaticos.guiMaior();
				output = "O maior número entre "+ res[1] +", "+ res[2] +" e "+ res[3] + " é: " + res[0];

			} else if(metodo.equals(metodos[1])) {
				int[] res = metodosEstaticos.guiDobro();
				output = "O dobro de "+ res[1] +" é: "+ res[0];

			} else if(metodo.equals(metodos[2])) {
				Object[] res = metodosEstaticos.guiEPar();
				output = "O número "+ res[1] +" é " + res[0];

			} else if(metodo.equals(metodos[3])) {
				int[] res = metodosEstaticos.guiSomaDeDoisNumeros();
				output = res[1] +" + "+ res[2] +" = "+ res[0];

			} else if(metodo.equals(metodos[4])) {
				String res = metodosEstaticos.multiplosDois();
				output = res;

			} else {
				Object[] res = metodosEstaticos.guiEPrimo();
				output = "O número "+ res[1] + " " + res[0] + " primo";
			}

			JOptionPane.showMessageDialog(null, output, app_name, 1);

		}
	}
}
