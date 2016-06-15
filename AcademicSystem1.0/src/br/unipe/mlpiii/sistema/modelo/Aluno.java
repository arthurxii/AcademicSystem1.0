package br.unipe.mlpiii.sistema.modelo;

public class Aluno {
	private int id;
	private String nome;
	private String matricula;
	private String identidade;
	private String curso;
	private String cre;
	private String telefone;
	private Disciplina disciplina;
	private String cpf;

	public Aluno(String nome, String identidade, String cpf, String telefone,
			String matricula, String curso, String cre, String rua,
			String numero, String cep, String estado, String pais,
			int disciplina2) {

	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCre() {
		return cre;
	}

	public void setCre(String cre) {
		this.cre = cre;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Endereco endereco;

}