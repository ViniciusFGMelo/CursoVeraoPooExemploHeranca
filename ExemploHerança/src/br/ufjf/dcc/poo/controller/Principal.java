package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Funcionaro;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno("Afú", "M", "666", "M-111");
		Professor professor = new Professor("Ronney", "M", "123456", "M-654321");
		Funcionaro funcionario = new Funcionaro("Carol", "F", "00001", "M-1111");
		
	}
}
