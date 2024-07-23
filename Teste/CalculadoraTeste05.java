package Teste;

import IntroducaoMetodos.Calculadora;

public class CalculadoraTeste05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		calculadora.somaArray(numeros);
		calculadora.somaVarArgs(1,2,3,4,5,6);

	}

}
