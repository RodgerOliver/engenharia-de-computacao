import java.io.Console;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// instanciar objeto
		Disciplina programacao = new Disciplina();

		// obter atributos
		Console console = System.console();
		String nome_disciplina = console.readLine("Informe o nome da disciplina: ");
		int ch_disciplina = Integer.parseInt(console.readLine("Informe a carga horária da disciplina: "));

		// setar atributos
		programacao.setNomeDisciplina(nome_disciplina);
		programacao.setCargaDisciplina(ch_disciplina);

		// chamar método
		int faltas = programacao.calcFaltas();

		// print
		String output_final = "Faltas permitidas na disciplina \"" + programacao.getNomeDisciplina() + "\": " + faltas;
		System.out.println(output_final);

		// show dialog box
		JOptionPane.showMessageDialog(null, output_final, "Janela de Output", JOptionPane.INFORMATION_MESSAGE);
	}
}

/*
 * $ # run in bash
 * $ javac Main.java -d classes && java -cp class/ Main
 */
