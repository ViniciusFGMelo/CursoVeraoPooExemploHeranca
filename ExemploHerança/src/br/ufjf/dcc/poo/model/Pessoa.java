package br.ufjf.dcc.poo.model;

public abstract class Pessoa {

	private String nome;
	private String sexo;
	private String cpf;
	private String rg;
	
	public Pessoa(String nome, String sexo, String cpf, String rg) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}
}
