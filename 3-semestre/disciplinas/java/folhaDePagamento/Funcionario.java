class Funcionario {
	/* attributes */
	private String nome;
	private String carteiraDeTrabalho;
	private double salarioBase;

	/* constructor */
	public Funcionario(String nome, String carteiraDeTrabalho, double salarioBase) {
		this.nome = nome;
		this.carteiraDeTrabalho = carteiraDeTrabalho;
		this.salarioBase = salarioBase;
	}

	/* methods */
	public String dadosFuncionarios() {
		return "Demonstrativo de Pagamento de " + this.nome.toUpperCase() +
			"\nCarteira de Trabalho: " + this.carteiraDeTrabalho +
			"\nSalário Base: R$ " + this.salarioBase;
	}

	/* setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	/* getters */
	public String getNome() {
		return this.nome;
	}

	public String getCarteiraDeTrabalho() {
		return this.carteiraDeTrabalho;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}
}
