package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {

	public static void main(String[] args) {
		
		// \d = retorna todos os dígitos
		// \D = retorna tudo o que não for dígito
		// \s = retorna todos os espaços em branco (\t \n \f \r )
		// \S = retorna todos os caracteres excluindo os em branco
		// \w = retorna tudo de a-z, A-z, digitos e _
		// \W = retorna tudo que não for incluso no \w
		// [range de caracteres]
		// . 1.3 = 123, 133, 1@3, 1A3
//		String regex = "[a-zA-C]"; // dessa forma consigo um range de letras minúsculas de a até z e de A até C
//		String texto = "abaaba";
		String regex = "0[xX][0-9a-fA-F]";
		String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";

		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(texto2);
		System.out.println("texto: " + texto2);
		System.out.println("índice: 0123456789");
		System.out.println("regex " + regex);
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			System.out.print(matcher.start()+ " "+matcher.group()+ " \n");
		}
		
//		int numeroHex = 0x1; // Para escrever número hexadecimais em java precisa incluir
//		// no início "0x ou 0X"
//		System.out.println(numeroHex);

		
	}

}
