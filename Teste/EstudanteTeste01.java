package Teste;

import dominio.Estudante;

public class EstudanteTeste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudante estudante = new Estudante();
		Estudante estudante01 = new Estudante();
		
		estudante.nome = "Sanji";

		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
		System.out.println("==========================");

		
		System.out.println(estudante01.nome);
		System.out.println(estudante01.idade);
		System.out.println(estudante01.sexo);



	}

}
