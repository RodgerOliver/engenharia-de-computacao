class Fatorial {
	/* atributos */
	private byte num;

	/* construtor */
	public Fatorial(byte n) {
		this.num = n;
	}

	/* methods */
	public long calcular() {
		long out = 1;
		if(num < 0) {
			return -1;
		}

		for(long i = 1; i <= num; i++) {
			out *= i;
		}
		return out;
	}

	/* getters */
	public byte getNumero() {
		return this.num;
	}

	/* setters */
	public void setNumero(byte num) {
		this.num = num;
	}
}
