package Teste;

import IntroducaoMetodos.Calculadora;

public class CalculadoraTeste01 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.somaDoisNumeros();
		System.out.println("finalizando calculadora");
		calculadora.subtraiDoisNumeros();
	}
}
