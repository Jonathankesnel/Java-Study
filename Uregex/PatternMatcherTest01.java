package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Expressões regulares: LInguagem desenvolvida que utiliza meta caracteres
		// e vai encontrar padrões no texto
		
		// tmb é utilizado para validações. por exemplo validar um email
		
		String regex = "aba";
//		String texto = "abaaba";
		String texto2 = "abababa";

		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(texto2);
		System.out.println("texto: " + texto2);
		System.out.println("índice: 0123456789");
		System.out.println("regex " + regex);
		System.out.println("Posições encontradas");
		while(matcher.find()) {
			System.out.print(matcher.start()+ " ");
		}

		
	}

}
