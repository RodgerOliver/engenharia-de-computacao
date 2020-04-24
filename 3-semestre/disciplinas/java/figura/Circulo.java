import java.lang.Math.*;

class Circulo extends Figura {
	/* attributes */
	private double raio;

	/* constructor */
	public Circulo(double raio) {
		super("Círculo");
		this.raio = raio;
	}

	/* methods */
	public double calculaDiametro() {
		return this.raio * 2;
	}

	@Override
	public double calculaArea() {
		double area = Math.PI * Math.pow(this.raio, 2);
		return Math.round(area * 100.0) / 100.0;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = 2 * Math.PI * this.raio;
		return Math.round(perimetro * 100.0) / 100.0;
	}

	@Override
	public String dados() {
		return super.dados()
			+ "\nDiametro: " + this.calculaDiametro();
	}

	/* setters */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	/* getters */
	public double getRaio() {
		return this.raio;
	}

}
