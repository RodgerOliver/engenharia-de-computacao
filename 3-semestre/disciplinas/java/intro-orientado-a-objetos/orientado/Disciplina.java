public class Disciplina {
	/* atributos */
	private int chDisciplina; // carga horária
	private String nomeDisciplina;

	/* métodos */
	public int calcFaltas() {
		int faltas = chDisciplina * 25 / 100;
		return faltas;
	}

	// métodos set (setam variáveis privadas)
	public void setNomeDisciplina(String novo_nome_disciplina) {
		this.nomeDisciplina = novo_nome_disciplina;
	}

	public void setCargaDisciplina(int nova_carga_disciplina) {
		this.chDisciplina = nova_carga_disciplina;
	}

	// métodos get (obtem variáveis privadas)
	public String getNomeDisciplina() {
		return this.nomeDisciplina;
	}

	public int getCargaDisciplina() {
		return this.chDisciplina;
	}
}
