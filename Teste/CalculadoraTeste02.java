package Teste;

import IntroducaoMetodos.Calculadora;

public class CalculadoraTeste02 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.multiplicaDoisNumeros(10, 20);
		System.out.println("-------------------------------------");
		calculadora.imprimeDivisaoDeDoisNumeros(86, 0);

	}
}
