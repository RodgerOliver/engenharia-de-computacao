/*
 *
 * Classes abstratas não podem ser instanciadas
 * Toda classe que possue um método abstrato deve ser abstrada
 *
 */

public abstract class Figura {
	/* attributes */
	protected String tipo;

	/* constructor */
	public Figura(String tipo) {
		this.tipo = tipo;
	}

	/* methods */
	// os métodos abaixo devem ser sobreescritos
	public abstract double calculaArea();
	public abstract double calculaPerimetro();
	public String dados() {
		return "Informações da figura\n"
			+ "\nTipo: " + this.tipo
			+ "\nÁrea: " + this.calculaArea()
			+ "\nPerímetro: " + this.calculaPerimetro();
	}

	/* setters */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/* getters */
	public String getTipo() {
		return this.tipo;
	}

}
