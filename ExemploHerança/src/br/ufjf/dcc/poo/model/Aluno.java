package br.ufjf.dcc.poo.model;

public class Aluno extends Pessoa {

	private String matricula;
	
	public Aluno(String nome, String sexo, String cpf, String rg) {
		super(nome, sexo, cpf, rg);
		// TODO Auto-generated constructor stub
	}

	public String getMatricula() {
		return matricula;
	}
}
