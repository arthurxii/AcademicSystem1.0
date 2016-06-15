package br.unipe.mlpiii.sistema.modelo;

public class Disciplina {
	protected int id;
	protected String nome, ementa, periodo, professor;

	public Disciplina(int id, String nome, String periodo, String ementa,
			String professor) {
		this.id = id;
		this.nome = nome;
		this.periodo = periodo;
		this.ementa = ementa;
		this.professor = professor;
	}

	public Disciplina() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
