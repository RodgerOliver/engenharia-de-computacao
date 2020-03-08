/*
 *
 * Constructor is called when a class is instanciated
 *
 */

public class Atleta {
	private String nome;
	private float peso;
	private float altura;

	/* contructor */
	public Atleta(String nome, float peso, float altura) {
		this.setNome(nome);
		this.setPeso(peso);
		this.setAltura(altura);
	}

	public float calculaIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public String retorno() {
		float imc = this.calculaIMC();
		String mensagem;
		
		if(imc < 18.6) {
			mensagem = "abaixo do peso";
		} else if(imc <= 24.9) {
			mensagem = "com o peso normal";
		} else if(imc < 30) {
			mensagem = "com excesso de peso";
		} else {
			mensagem = "obeso";
		}

		return "Seu peso é " + this.peso + ".\nSua altura é " + this.altura
		+ ".\n" + this.nome + ", você está " + mensagem + ".";
	}

	/* getters */
	public String getNome() {
		return this.nome;
	}

	public float getPeso() {
		return this.peso;
	}

	public float getAltura() {
		return this.altura;
	}

	/* setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
