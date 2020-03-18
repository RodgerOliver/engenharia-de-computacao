import javax.swing.JOptionPane;

class Main {
	public static void main(String[] args) {
		String app_name = "Automovel v1.0";

		String marca       = "Chevrolet";
		String modelo      = "Onix";
		String cor         = "Branco";
		String combustivel = "Flex";
		int ano            = 2020;
		float preco        = 50000;

		Automovel carro1 = new Automovel(marca, modelo, cor, combustivel, ano, preco);

		String output = carro1.toString();
		output += "\n\nO preço final do seu carro é: R$" + carro1.quantoCusta();

		JOptionPane.showMessageDialog(null, output, app_name, 1);

	}
}
