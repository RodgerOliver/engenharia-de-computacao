import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args){
		String app_name = "AppAcademia v.1.0";

		String nome = JOptionPane.showInputDialog(null, "Digite seu nome", app_name, 3);
		float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso", app_name, 3));
		float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura", app_name, 3));

		Atleta atleta1 = new Atleta(nome, peso, altura);

		JOptionPane.showMessageDialog(null, atleta1.retorno(), app_name, 1);
	}
}
