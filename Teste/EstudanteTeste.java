package Teste;

import dominio.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		estudante.nome = "Jonathan";
		estudante.idade = 25;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
	}
}
