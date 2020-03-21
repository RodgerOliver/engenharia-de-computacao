class Automovel {
	/* attributes */
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	private int ano;
	private float preco;

	/* constructor */
	public Automovel(String marca, String modelo, String cor, String combustivel, String ano, String preco) throws Exception {
		setMarca(marca);
		setModelo(modelo);
		setCor(cor);

		boolean ok_preco = setPreco(preco);
		if(!ok_preco) {
			throw new Exception("Preço não é um número.");
		}

		boolean ok_ano = setAno(ano);
		if(!ok_ano) {
			throw new Exception("Ano não é um número.");
		}

		boolean ok_com = setCombustivel(combustivel);
		if(!ok_com) {
			throw new Exception("Combustível não permitido.");
		}

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

	public boolean setAno(String ano) {
		if(Basic.isInteger(ano)) {
			this.ano = Integer.parseInt(ano);
			return true;
		}
		return false;
	}

	public boolean setCombustivel(String combustivel) {
		String[] combustiveis_permitidos = {"GNV", "Gasolina", "Alcool", "Flex", "Diesel"};

		for(String c: combustiveis_permitidos) {
			if(c.equalsIgnoreCase(combustivel)) {
				this.combustivel = c;
				return true;
			}
		}
		return false;
	}

	public boolean setPreco(String preco) {
		if(Basic.isFloat(preco)) {
			this.preco = Float.parseFloat(preco);
			return true;
		}
		return false;
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

