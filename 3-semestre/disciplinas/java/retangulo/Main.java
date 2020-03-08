import java.io.Console;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String app_name = "App Reatangulo v.1.0";

		Retangulo retangulo1 = new Retangulo();

		/* obter atributos */
		// Console console = System.console();
		// float comprimento = Float.parseFloat(console.readLine("Qual o compromento do retângulo? "));
		// float largura = Float.parseFloat(console.readLine("Qual a largura do retângulo? "));

		float comprimento = Float.parseFloat(JOptionPane.showInputDialog(null,
			"Digite o comprimento do retângulo",
			app_name, 3));

		float largura = Float.parseFloat(JOptionPane.showInputDialog(null,
			"Digite a largura do retângulo",
			app_name, 3));

		/* setar */
		retangulo1.setComprimento(comprimento);
		retangulo1.setLargura(largura);

		float area = retangulo1.calculaArea();
		float perimetro = retangulo1.calculaPerimetro();

		/* printar */
		// System.out.println("Área: " + area + "; Perímetro: " + perimetro);

		JOptionPane.showMessageDialog(null,
			retangulo1.dados(),
			app_name, 1);
	}
}
