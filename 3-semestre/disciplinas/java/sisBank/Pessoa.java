class Pessoa {
	/* attributes */
	private String nome;
	private String sobrenome;
	private String cpf;

	/* constructor */
	public Pessoa(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	/* methods */
	public String toString() {
		return this.nome + " " + this.sobrenome;
	}

	public String dados() {
		return "Dados do Correntista\n"
			+ "\nNome: " + this.nome
			+ "\nSobrenome: " + this.sobrenome
			+ "\nCPF: " + this.cpf;
	}

	/* setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/* getters */
	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getCpf() {
		return this.cpf;
	}

}
