class Lutador extends Atleta {
	/* attributes */

	/* constructor */
	public Lutador(String nome, float peso) {
		super(nome, peso);
	}

	/* methods */
	@Override
	public String defineCategoria() {
		if(this.peso <= 54.0) {
			return "Pluma";
		} else if(this.peso <= 60.0) {
			return "Leve";
		} else if(this.peso <= 75.0) {
			return "Meio-Leve";
		}
		return "Pesado";
	}

	/* setters */

	/* getters */

}
