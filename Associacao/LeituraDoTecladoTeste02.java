package Associacao;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Grande software de previsão do futuro");
		System.out.println("Digite sua pergunta e eu responderei sim ou naõ");
		String pergunta = input.nextLine();
		
		if(pergunta.charAt(0) == ' ') {
			System.out.println("SIM");
		} else {
			System.out.println("NÃO");

		}

	}

}
