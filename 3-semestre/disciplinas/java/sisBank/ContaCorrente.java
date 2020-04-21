import javax.swing.*;

class ContaCorrente {
	// repetição de código
	String app_name = "ContaCorrente v.1.0";
	/* attributes */
	protected Pessoa titular;
	protected String numero_da_conta;
	protected double saldo;

	/* constructor */
	public ContaCorrente(String nome, String sobrenome, String cpf, String numero_da_conta) {
		this.titular = new Pessoa(nome, sobrenome, cpf);
		this.numero_da_conta = numero_da_conta;
		this.saldo = 0.0;
	}

	/* methods */
	public boolean sacar(double valor) {
		if(this.saldo >= valor && valor >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// public boolean sacar(double valor) {
	// 	if(getSaldo() >= valor) {
	// 		this.saldo -= valor;
	// 		return true;
	// 	}
	// 	return false;
	// }

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public String dados() {
		return "Informações Bancárias\n"
			+ "\nTitular: " + this.titular.nomeCompleto()
			+ "\nConta: " + this.numero_da_conta
			+ "\nSaldo: R$" + this.saldo;
	}

	public void guiSacar() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja sacar", app_name, 1));
		boolean retorno = this.sacar(valor);
		if(!retorno) {
			JOptionPane.showMessageDialog(null, "Saldo indisponível", app_name, 1);
		}
	}

	public void guiDepositar() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja depositar", app_name, 1));
		this.depositar(valor);
	}

	/* setters */
	public void setTitular(String nome, String sobrenome, String cpf) {
		this.titular.setNome(nome);
		this.titular.setSobrenome(sobrenome);
		this.titular.setCpf(cpf);
	}

	public void setNumero_da_conta(String numero_da_conta) {
		this.numero_da_conta = numero_da_conta;
	}

	/* getters */
	public String getTitular() {
		return this.titular.dados();
	}

	public String getNumero_da_conta() {
		return this.numero_da_conta;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
