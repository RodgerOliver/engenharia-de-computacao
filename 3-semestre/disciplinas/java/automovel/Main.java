import javax.swing.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

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
			return;
		}

		String output = "Informações do Carro\n";

		HashMap<String, Object> map = carro1.retornaInfo();
		for(Map.Entry<String, Object> info : map.entrySet()) {
			output += "\n" + info.getKey() + ": " + info.getValue();
		}

		output += "\n\nO preço final do seu carro é: R$" + carro1.quantoCusta();

		JOptionPane.showMessageDialog(null, output, app_name, 1);

	}
}
