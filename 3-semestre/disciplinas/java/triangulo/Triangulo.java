class Triangulo {
	/* attributes */
	private float lado1;
	private float lado2;
	private float lado3;

	/* constructor */
	public Triangulo(float lado1, float lado2, float lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/* methods */
	public boolean ehTriangulo() {
		return lado1 < (lado2 + lado3) &&
			lado2 < (lado1 + lado3) &&
			lado3 < (lado1 + lado2);
	}

	public byte tipoTriangulo() {
		if(!this.ehTriangulo()) {
			return -1;
		}

		if(lado1 == lado2 && lado1 == lado3) {
			return 0; //triangulo equilatero
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return 1; // triangulo isoceles
		} else {
			return 2; // triangulo escaleno
		}
	}

	/* getters */
	public float getLado1() {
		return this.lado1;
	}

	public float getLado2() {
		return this.lado2;
	}

	public float getLado3() {
		return this.lado3;
	}

	/* setters */
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}
}
