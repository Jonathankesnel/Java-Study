package Teste;

import dominio.Estudante01;
import dominio.ImpressoraEstudante;

public class EstudanteTeste03 {

	public static void main(String[] args) {
		Estudante01 estudante1 = new Estudante01();
		Estudante01 estudante2 = new Estudante01();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		estudante1.nome = "Midoriya";
		estudante1.idade = 15;
		estudante1.sexo = 'M';
		
		estudante2.nome = "Sakura";
		estudante2.idade = 16;
		estudante2.sexo = 'F';
		
		estudante1.imprime();
		estudante2.imprime();
	}
}
