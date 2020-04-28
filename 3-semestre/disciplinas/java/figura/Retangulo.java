class Retangulo extends Figura {
	/* attributes */
	private double comprimento;
	private double largura;

	/* constructor */
	public Retangulo(double comprimento, double largura) {
		super("Retângulo");
		this.comprimento = comprimento;
		this.largura = largura;
	}

	/* methods */
	@Override
	public double calculaArea() {
		return this.comprimento * this.largura;
	}

	@Override
	public double calculaPerimetro() {
		return (this.comprimento * 2) + (this.largura * 2);
	}

	/* setters */
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	/* getters */
	public double getComprimento() {
		return this.comprimento;
	}

	public double getLargura() {
		return this.largura;
	}

}
