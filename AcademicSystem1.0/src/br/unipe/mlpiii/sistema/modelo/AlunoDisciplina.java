package br.unipe.mlpiii.sistema.modelo;

public class AlunoDisciplina {

	private Aluno aluno;
	private Disciplina disciplina;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private Integer falta1;
	private Integer falta2;
	private Integer falta3;
	private boolean reprovado;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Integer getFalta1() {
		return falta1;
	}

	public void setFalta1(Integer falta1) {
		this.falta1 = falta1;
	}

	public Integer getFalta2() {
		return falta2;
	}

	public void setFalta2(Integer falta2) {
		this.falta2 = falta2;
	}

	public Integer getFalta3() {
		return falta3;
	}

	public void setFalta3(Integer falta3) {
		this.falta3 = falta3;
	}

	public Double getMedia() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}

	public Integer getTotalFalta() {
		return this.falta1 + this.falta2 + this.falta3;
	}

	public boolean isReprovado() {
		return reprovado;
	}

	public void setReprovado(boolean reprovado) {
		this.reprovado = reprovado;
	}
}