import javax.swing.*;

public class Main {
	public static void main(String[] args){
		String app_name = "SisBank v.1.0";

		/* make form */
		String categorias[] = {"Conta Corrente", "Conta Especial"};

		JTextField titular_field         = new JTextField();
		JTextField numero_da_conta_field = new JTextField();
		JComboBox tipo_conta_field       = new JComboBox(categorias);
		tipo_conta_field.setSelectedIndex(0);

		Object[] message = {
			"Titular:", titular_field,
			"Numero Da Conta:", numero_da_conta_field,
			"Tipo da conta:", tipo_conta_field
		};

		/* show dialog with form */
		int option = JOptionPane.showConfirmDialog(null, message, app_name, JOptionPane.OK_CANCEL_OPTION);

		/* exit if Cancel*/
		if(option != 0) {
			JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
			System.exit(0);
		}

		/* get info */
		String titular = titular_field.getText();
		String numero_da_conta = numero_da_conta_field.getText();
		String tipo_conta = (String)tipo_conta_field.getSelectedItem();

		/* validade info */
		if(titular.equals("") || numero_da_conta.equals("") || tipo_conta.equals("")) {
			JOptionPane.showMessageDialog(null, "Parâmetros Inválidos", app_name, 1);
			System.exit(0);
		}

		/* create object */
		ContaCorrente conta = null;
		if(tipo_conta.equals(categorias[0])) {
			conta = new ContaCorrente(titular, numero_da_conta);
		} else {
			int get_limite = JOptionPane.showConfirmDialog(null, "Deseja colocar um limite específico?", app_name, JOptionPane.YES_NO_OPTION);
			if(get_limite == 0) {
				double limite = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite", app_name, 1));
				conta = new ContaEspecial(titular, numero_da_conta, limite);
			} else {
				conta = new ContaEspecial(titular, numero_da_conta);
			}
			// obter limite
		}

		/* make actions */
		int action;
		String acoes[] = {"Sacar", "Depositar", "Mostrar Dados"};
		JComboBox acao_field = new JComboBox(acoes);
		acao_field.setSelectedIndex(0);

		Object[] message2 = {
			"Qual ação deseja tomar? ", acao_field
		};

		/* execute actions */
		while(true) {
			action = JOptionPane.showConfirmDialog(null, message2, app_name, JOptionPane.OK_CANCEL_OPTION);
			String acao = (String)acao_field.getSelectedItem();

			/* exit if Cancel*/
			if(action != 0) {
				JOptionPane.showMessageDialog(null, "Programa Fechado", app_name, 1);
				System.exit(0);
			}

			if(acao.equals(acoes[0])) {
				conta.guiSacar();
			} else if(acao.equals(acoes[1])) {
				conta.guiDepositar();
			} else {
				JOptionPane.showMessageDialog(null, conta.dados(), app_name, 1);
			}

		}
	}
}
