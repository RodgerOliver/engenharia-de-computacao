/*
 *
 * [visibilidade] [tipo] [nome_da_variavel]
 *
 * visibilidade:
 *   - private (encapsulamento)
 *   - public
 *   - protected
 *
 * tipo:
 *   - int
 *   - float
 *   - byte
 *   - String
 *   - void
 *
 * Sobrecarga de método
 *   - vários métodos com o mesmo nome mas parâmetros
 *     diferentes para executar ações distintas
 *
 * JOptionPane.showInputDialog(position, body_text, title_text, icon);
 *
 */

public class Retangulo {
	/* atributos */
	private float comprimento;
	private float largura;

	public float calculaPerimetro() {
		return this.comprimento*2 + this.largura*2;
	}

	public float calculaArea() {
		return this.comprimento * this.largura;
	}

	public String dados() {
		return "Dados do retângulo:\n  Comprimento: " + this.comprimento
		+ "\n  Largura: " + this.largura + "\n  Área: " + this.calculaArea()
		+ "\n  Perímetro: " + this.calculaPerimetro();
	}

	/* Metodos De Acesso */
	/* setter */
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	/* getter */
	public float GetComprimento() {
		return this.comprimento;
	}

	public float GetLargura() {
		return this.largura;
	}
}
