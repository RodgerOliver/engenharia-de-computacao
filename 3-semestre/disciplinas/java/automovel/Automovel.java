class Automovel {
	/* attributes */
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	private int ano;
	private float preco;

	/* constructor */
	public Automovel(String marca, String modelo, String cor, String combustivel, int ano, float preco) {
		setMarca(marca);
		setModelo(modelo);
		setCor(cor);
		setAno(ano);
		setCombustivel(combustivel);
		setPreco(preco);
	}

	/* methods */
	public String toString() {
		return
		"Marca: "         + this.marca       +
		"\nModelo: "      + this.modelo      +
		"\nCor: "         + this.cor         +
		"\nCombustivel: " + this.combustivel +
		"\nAno: "         + this.ano         +
		"\nPreço: "       + this.preco;
	}

	public double quantoCusta() {
		double porcentagem = 0;

		if(this.combustivel.equalsIgnoreCase("gnv")) {
			porcentagem = 0.03;
		} else if(this.combustivel.equalsIgnoreCase("gasolina")) {
			porcentagem = 0.05;
		} else if(this.combustivel.equalsIgnoreCase("alcool")) {
			porcentagem = 0.07;
		} else if(this.combustivel.equalsIgnoreCase("flex")) {
			porcentagem = 0.10;
		} else if(this.combustivel.equalsIgnoreCase("diesel")) {
			porcentagem = 0.15;
		}

		if(porcentagem != 0) {
			return this.preco + (this.preco * porcentagem);
		}

		return -1;
	}

	/* setters */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	/* getters */
	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public int getAno() {
		return this.ano;
	}

	public String getCombustivel() {
		return this.combustivel;
	}

	public float getPreco() {
		return this.preco;
	}
}

/*
 *
 * GNV       +3%
 * Gasolina  +5%
 * Alcool    +7%
 * Flex      +10%
 * Diesel    +15%
 *
 */

