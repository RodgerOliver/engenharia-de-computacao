import javax.swing.*;

class metodosEstaticos {
	/* attributes */
	private static String app_name = "metodosEstáticos v1.0";

	/* methods */
	public static int maior(int n1, int n2, int n3) {
		int maior;

		if(n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		}

		if(n3 > maior) {
			maior = n3;
		}

		return maior;
	}

	public static int dobro(int n) {
		return n * 2;
	}

	public static int ePar(int n) {
		return n % 2;
	}

	public static int somaDeDoisNumeros(int n1, int n2) {
		return n1 + n2;
	}

	public static String multiplosDois() {
		String out = "";
		for(int i = 2; i <= 1024; i *= 2) {
			out = out + i + ", ";
		}
		String res = out.substring(0, out.length() - 2);

		return res;
	}

	public static boolean ePrimo(int n) {
		boolean res = true;

		int i, c;
		c = 0;
		for(i = 1; i <= n; i++) {
			if(n % i == 0) {
				c++;
			}
			if(c > 2) {
				res = false;
				return res;
			}
		}
		return res;
	}

	/* guis */
	public static int[] guiMaior() {
		/* build form */
		JTextField n1_field = new JTextField();
		JTextField n2_field = new JTextField();
		JTextField n3_field = new JTextField();

		Object[] message = {
			"Numero 1:", n1_field,
			"Numero 2:", n2_field,
			"Numero 3:", n3_field
		};

		int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}

		/* get info */
		int n1 = Integer.parseInt(n1_field.getText());
		int n2 = Integer.parseInt(n2_field.getText());
		int n3 = Integer.parseInt(n3_field.getText());

		int[] out = {
			metodosEstaticos.maior(n1, n2, n3),
			n1, n2, n3
		};

		return out;
	}

	public static int[] guiDobro() {
		/* build form */
		JTextField num_field = new JTextField();

		Object[] message = {
			"Numero:", num_field,
		};

		int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}

		/* get info */
		int n = Integer.parseInt(num_field.getText());

		int[] out = {
			metodosEstaticos.dobro(n),
			n
		};

		return out;
	}

	public static Object[] guiEPar() {
		/* build form */
		JTextField num_field = new JTextField();

		Object[] message = {
			"Numero:", num_field,
		};

		int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}

		/* get info */
		int n = Integer.parseInt(num_field.getText());

		int num_result = metodosEstaticos.ePar(n);
		String string_result = "ímpar";
		if(num_result == 0) {
			string_result = "par";
		}

		Object[] out = {
			string_result,
			n
		};

		return out;
	}

	public static int[] guiSomaDeDoisNumeros() {
		/* build form */
		JTextField n1_field = new JTextField();
		JTextField n2_field = new JTextField();

		Object[] message = {
			"Numero 1:", n1_field,
			"Numero 2:", n2_field,
		};

		int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}

		/* get info */
		int n1 = Integer.parseInt(n1_field.getText());
		int n2 = Integer.parseInt(n2_field.getText());

		int[] out = {
			metodosEstaticos.somaDeDoisNumeros(n1, n2),
			n1, n2
		};

		return out;
	}

	public static Object[] guiEPrimo() {
		/* build form */
		JTextField num_field = new JTextField();

		Object[] message = {
			"Numero:", num_field,
		};

		int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}

		/* get info */
		int n = Integer.parseInt(num_field.getText());

		boolean num_result = metodosEstaticos.ePrimo(n);
		String string_result = "não é";
		if(num_result) {
			string_result = "é";
		}

		Object[] out = {
			string_result,
			n
		};

		return out;
	}

}
