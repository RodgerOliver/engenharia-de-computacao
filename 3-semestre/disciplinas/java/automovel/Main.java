import javax.swing.*;

class Main {
	public static void main(String[] args) {
		String app_name = "Automovel v1.0";

		/* get data */
		JTextField marca_field       = new JTextField();
		JTextField modelo_field      = new JTextField();
		JTextField cor_field         = new JTextField();
		JTextField combustivel_field = new JTextField();
		JTextField ano_field         = new JTextField();
		JTextField preco_field       = new JTextField();

		Object[] message = {
			"Marca:", marca_field,
			"Modelo:", modelo_field,
			"Cor:", cor_field,
			"Combustivel:", combustivel_field,
			"Ano:", ano_field,
			"Preco:", preco_field
		};

		int option = JOptionPane.showConfirmDialog(null, message, "Cadastro de Carro", JOptionPane.OK_CANCEL_OPTION);

		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Encerrado", app_name, 1);
			System.exit(0);
		}

		String marca = marca_field.getText();
		String modelo = modelo_field.getText();
		String cor = cor_field.getText();
		String combustivel = combustivel_field.getText();
		String ano = ano_field.getText();
		String preco = preco_field.getText();

		/* create object */
		Automovel carro1 = null;
		try {
			carro1 = new Automovel(marca, modelo, cor, combustivel, ano, preco);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e, app_name, 1);
			System.exit(0);
		}

		String output = "Informações do Carro\n";
		int i = -1;
		for(Object info: carro1.retornaInfo()) {
			i++;
			if(i % 2 == 0) {
				output += "\n" + info + ": ";
				continue;
			}
			output += info;
		}

		output += "\n\nO preço final do seu carro é: R$" + carro1.quantoCusta();

		JOptionPane.showMessageDialog(null, output, app_name, 1);

	}
}
