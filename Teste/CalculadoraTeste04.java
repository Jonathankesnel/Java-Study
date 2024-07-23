package Teste;

import IntroducaoMetodos.Calculadora;

public class CalculadoraTeste04 {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		int a = 1;
		int b = 2;
		calculadora.alteraDoisNumeros(a, b);
		System.out.println(a);
		System.out.println(b);

		
	}
}
