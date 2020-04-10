/*
 *
 * super is an alias of the father's class
 *
 */

class FuncionarioComissionado extends Funcionario {
	/* attributes */
	private double totalDeVenda;
	private double percentualDeComissao;

	/* constructor */
	public FuncionarioComissionado(String nome, String carteiraDeTrabalho, double salarioBase, double totalDeVenda, double percentualDeComissao) {
		/* a primeira instrução de uma classe estendida deve ser a chamada do construtor da classe pai */
		/* isso é necessário somente quando o construtor não for vazio */
		super(nome, carteiraDeTrabalho, salarioBase);
		this.totalDeVenda = totalDeVenda;
		this.percentualDeComissao = percentualDeComissao;
	}

	/* methods */
	public double calculaSalarioTotal() {
		return getSalarioBase() + (this.totalDeVenda * this.percentualDeComissao / 100);
	}

	@Override /* anotação para documentação, não é necessário mas é recomendado */
	public String dadosFuncionarios() {
		return super.dadosFuncionarios() +
			"\nTotal de Vendas: " + this.totalDeVenda +
			"\nPercentual de Comissão: " + this.percentualDeComissao +
			"\nSalário Total: R$ " + this.calculaSalarioTotal();
	}

	/* setters */
	public void setTotalDeVenda(double totalDeVenda) {
		this.totalDeVenda = totalDeVenda;
	}

	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
	}

	/* getters */
	public double getTotalDeVenda() {
		return this.totalDeVenda;
	}

	public double getPercentualDeComissao() {
		return this.percentualDeComissao;
	}
}
