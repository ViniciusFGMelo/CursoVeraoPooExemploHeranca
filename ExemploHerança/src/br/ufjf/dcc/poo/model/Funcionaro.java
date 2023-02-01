package br.ufjf.dcc.poo.model;

public class Funcionaro extends Pessoa{

	private String registro;
	
	public Funcionaro(String nome, String sexo, String cpf, String rg) {
		super(nome, sexo, cpf, rg);
		// TODO Auto-generated constructor stub
	}

	public String getRegistro() {
		return registro;
	}
}
