package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

	public static void main(String[] args) {
		
		// \d = retorna todos os dígitos
		// \D = retorna tudo o que não for dígito
		// \s = retorna todos os espaços em branco (\t \n \f \r )
		// \S = retorna todos os caracteres excluindo os em branco
		// \w = retorna tudo de a-z, A-z, digitos e _
		// \W = retorna tudo que não for incluso no \w
		String regex = "\\W";
//		String texto = "abaaba";
		String texto2 = "@#hh_j2122 gvh#$21";

		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(texto2);
		System.out.println("texto: " + texto2);
		System.out.println("índice: 0123456789");
		System.out.println("regex " + regex);
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			System.out.print(matcher.start()+ " "+matcher.group()+ " \n");
		}

		
	}

}
