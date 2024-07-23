package PWrappers_test;

public class WrapperTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos primitivos: 
		//Aqui usa a regra do tamanho de bits que to utilizando  
		byte byteP = 1;
		short shortP = 1;
		int intP = 1;
		long longP = 10L;
		float floatP = 10F;
		double doubleP = 100;
		char charP = 'W';
		boolean booleanP = false;
		
		// Para virar um wrapper basta os tipos primitivos começarem
		// com letra maiúscula, com exceção de int que vira Integer
		// e char que vira Character. Ex: 
		//Aqui usa a regra do polimorfismo
		//Esses são objetos.
		/* Autoboxing é um recurso do compilador Java, presente desde o JDK 5, 
		que faz a conversão entre tipos primitivos de dados e os 
		respectivos objetos cujas classes acondicionam um determinado 
		tipo primitivo. Por exemplo, converter um tipo primitivo int em um 
		objeto cuja classe é Integer. O processo inverso é chamado de unboxing.*/
		Byte byteW =  127;
		Short shortW = 1;
		Integer intW = 1; // autoboxing
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 100.6;
		Character charW = 'W';
		Boolean booleanW = false;
		
		int i = intW; //unboxing
		Integer intW2 = Integer.parseInt("1");
		boolean verdadeiro = Boolean.parseBoolean(null);
		System.out.println(verdadeiro);
		
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetterOrDigit('!')); // se não for numero ou letra retorna false
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		



		
	}

}
