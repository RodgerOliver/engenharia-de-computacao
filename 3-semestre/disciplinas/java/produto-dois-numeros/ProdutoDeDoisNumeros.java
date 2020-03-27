class ProdutoDeDoisNumeros {
	/* atributos */
	private int numero1;
	private int numero2;

	/* construtor */
	public ProdutoDeDoisNumeros(int n1, int n2) {
		this.numero1 = n1;
		numero2 = n2;
	}

	/* methods */
	public int calcular_for() {
		int out = 0;
		for(int i = 0; i < numero1; i++) {
			out += numero2;
		}
		return out;
	}

	public int calcular_while() {
		int out = 0;
		int i = 0;
		while(i < numero1) {
			out += numero2;
			i++;
		}
		return out;
	}

	public int calcular_do_while() {
		int out = 0;
		int i = 0;
		do {
			out += numero2;
			i++;
		} while(i < numero1);
		return out;
	}

	/* getters */
	public int getNumero1() {
		return this.numero1;
	}

	public int getNumero2() {
		return this.numero2;
	}

	/* setters */
	public void setNumero1(int num1) {
		this.numero1 = num1;
	}

	public void setNumero2(int num2) {
		this.numero2 = num2;
	}
}
