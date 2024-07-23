package Qstring_test;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "         Luffy            ";
		String numeros = "012345";
		System.out.println(nome.charAt(3));
		System.out.println(nome.length()); // imprime o tamaho 
		System.out.println(nome.replace("f", "l")); // vai trocar todos os f por l.
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(numeros.length());
		System.out.println(numeros.substring(3, numeros.length()));
		System.out.println(nome.trim()); // elimina os espaços em branco no começo e no fim da string
		

	}

}
