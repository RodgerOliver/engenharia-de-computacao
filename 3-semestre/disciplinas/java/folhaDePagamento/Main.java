import javax.swing.*;

class Main {
	public static void main(String[] args) {
		String app_name = "folhaDePagamento v1.0";

		String categorias[] = {"Funcionário", "Funcionário Comissionado"};

		String nome = JOptionPane.showInputDialog(null, "Nome do Funcionário", app_name, 3);
		String carteira = JOptionPane.showInputDialog(null, "Carteira do Funcionário", app_name, 3);
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário do Funcionário", app_name, 3));

		String tipo_funcionario = (String)JOptionPane.showInputDialog(null, "Selecione a categoria do funcionário", app_name, 3, null, categorias, categorias[0]);

		Funcionario func = null;
		if(tipo_funcionario.equals(categorias[0])) {
			func = new Funcionario(nome, carteira, salario);

		} else {
			double vendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Vendas do Funcionário", app_name, 3));
			double percentual = Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual Sobre as Vendas", app_name, 3));
			func = new FuncionarioComissionado(nome, carteira, salario, vendas, percentual);
		}

		JOptionPane.showMessageDialog(null, func.dadosFuncionarios(), app_name, 1);
		System.exit(0);
	}
}
