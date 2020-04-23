class ContaEspecial extends ContaCorrente {
	/* attributes */
	private double limite; // cheque especial

	/* constructor */
	public ContaEspecial(Pessoa titular, String numero_da_conta, double limite) {
		super(titular, numero_da_conta);
		this.limite = limite;
	}

	public ContaEspecial(Pessoa titular, String numero_da_conta) {
		super(titular, numero_da_conta);
		this.limite = 2000;
	}

	/* methods */
	@Override
	public boolean sacar(double valor) {
		if((this.saldo + this.limite) >= valor && valor >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// @Override
	// public double getSaldo() {
	// 	return super.getSaldo() + this.limite;
	// }

	@Override
	public String dados() {
		double saldo_total = this.saldo + this.limite;
		return "Informações Bancárias\n"
			+ "\nTitular: " + this.titular.nomeCompleto()
			+ "\nConta: " + this.numero_da_conta
			+ "\nSaldo: R$" + this.saldo
			+ "\nLimite: R$" + this.limite
			+ "\nSaldo Total: R$" + saldo_total;
	}

	/* setters */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	/* getters */
	public double getLimite() {
		return this.limite;
	}

}
