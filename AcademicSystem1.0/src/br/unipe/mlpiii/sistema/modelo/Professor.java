package br.unipe.mlpiii.sistema.modelo;

public class Professor {
	private int matricula;
	private String nome;
	private int cpf;
	private int identidade;
	private String telefone;
	private String endereço;

	public Professor(int matricula, String nome, int cpf, int identidade,
			String telefone, String endereço) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.telefone = telefone;
		this.endereço = endereço;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
