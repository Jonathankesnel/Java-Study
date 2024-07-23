package Teste;

import dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.nome = "Djalma";
		professor.idade = 66;
		professor.sexo = 'M';

		
		System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
	}
}
