package Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

	public static void main(String[] args) {
		
		// \d = retorna todos os dígitos
		// \D = retorna tudo o que não for dígito
		// \s = retorna todos os espaços em branco (\t \n \f \r )
		// \S = retorna todos os caracteres excluindo os em branco
		// \w = retorna tudo de a-z, A-z, digitos e _
		// \W = retorna tudo que não for incluso no \w
		// [range de caracteres]
		// quantificadores = pega determinada expressão baseada que o meta caracter representa
		// ? zero ou uma ocorrencia
		// * zero ou mais
		// + uma ou mais ocorrencias
		// {n,m} de n até m
		// () agrupamento
		// | o(v|c)o vai dar o match em "ovo" | "oco"
		// $ representa fim da linha
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto = "Luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
		System.out.println("Email válido:");
		System.out.println( "zoro@mail.br".matches(regex)); // valida o email
		System.out.println(texto.split(",")[1].trim());
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(texto);
		System.out.println("texto: " + texto);
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
