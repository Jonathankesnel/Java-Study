package Qstring_test;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String no java são imutáveis
		String nome = "William"; // String constant pool
		String nome2 = "William";
		nome = nome.concat(" Suiane");
		System.out.println(nome);
		System.out.println(nome == nome2);
		String nome3 = new String("William");// 1 variável de referÊncia, 2 objeto do tipo string, 3 uma string no pool de string
		System.out.println(nome2 == nome3);
		System.out.println(nome2 == nome3.intern());


	}

}
