class Atleta {
	/* attributes */
	protected String nome;
	protected float peso;

	/* constructor */
	public Atleta(String nome, float peso) {
		this.nome = nome;
		this.peso = peso;
	}

	/* methods */
	public String defineCategoria() {
		if(this.peso <= 50.0) {
			return "Infantil";
		} else if(this.peso < 65.0) {
			return "Juvenil";
		}
		return "Adulto";
	}

	/* setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	/* getters */
	public String getNome() {
		return this.nome;
	}

	public float getPeso() {
		return this.peso;
	}

}
