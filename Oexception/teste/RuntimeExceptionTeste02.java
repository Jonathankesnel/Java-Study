package Oexception.teste;

import java.io.IOException;

public class RuntimeExceptionTeste02 {
//Lançando exceção UNCHECKED
	public static void main(String[] args) {

		divisao(1,0);
			
		
		System.out.println("Código finalizado!");
	}
	/*
	 * @param a
	 * @param b não pode ser zero
	 * @return
	 * @throws IllegalArgumentException caso b seja zero
	 * */
	private static int divisao(int a, int b)  {
		if(b == 0) {
			
			throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
			//obs: Sempre que eu for fazer uma validação posso usar a exceção.
		}
		
		return a/b;
	}

}
