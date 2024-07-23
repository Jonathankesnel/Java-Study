package Qstring_test;

public class StringBuilderTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "William Suane";
		nome.concat("DevDojo");
		nome.substring(0,3);
		System.out.println(nome);
		StringBuffer sb = new StringBuffer("William Suane"); // StringBuilder não é imutável
		sb.append(" DevDojo").append(" Academy");
		sb.reverse(); // inverte a ordem da substring
		sb.reverse();
		sb.delete(0, 3); // delete os caracteres num periodo(inicio e fim).
		System.out.println(sb);
		//Esses métodoso são para StringBuilder e StringBuffer
	}

}
