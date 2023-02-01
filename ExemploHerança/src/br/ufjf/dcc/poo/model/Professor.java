package br.ufjf.dcc.poo.model;

public class Professor extends Pessoa{

	private String siape;
	
	public Professor(String nome, String sexo, String cpf, String rg) {
		super(nome, sexo, cpf, rg);
		// TODO Auto-generated constructor stub
	}

	public String getSiape() {
		return siape;
	}
}
