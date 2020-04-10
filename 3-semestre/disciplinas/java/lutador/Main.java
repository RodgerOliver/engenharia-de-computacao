import javax.swing.*;

class Main {
	public static void main(String[] args) {
		String app_name = "lutador v1.0";

		String categorias[] = {"Atleta", "Lutador"};

		String nome = JOptionPane.showInputDialog(null, "Nome do Personagem", app_name, 3);
		float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Peso do Personagem", app_name, 3));

		String tipo = (String)JOptionPane.showInputDialog(null, "Selecione a categoria do personagem", app_name, 3, null, categorias, categorias[0]);

		Atleta obj = null;
		if(tipo.equals(categorias[0])) {
			obj = new Atleta(nome, peso);

		} else {
			obj = new Lutador(nome, peso);
		}

		JOptionPane.showMessageDialog(null, obj.defineCategoria(), app_name, 1);
		System.exit(0);
	}
}
