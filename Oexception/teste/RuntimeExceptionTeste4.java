package Oexception.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste4 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			throw new RuntimeException();
		}catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
			
		}catch(RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}
		
		try {
			
			talvesLanceException();
		}catch(SQLException | FileNotFoundException e )/*Cuidado pois não podem estar na mesma linha de herança*/ {
		//	e = new RuntimeException()  /* pode somente com uma exceção
			e.printStackTrace();
		}

	}
	private static void talvesLanceException() throws SQLException , FileNotFoundException{
		
	}
}

/*Não podemos colocar um tipo exception mais genérico na frente de outro. Por 
 * exemplo não se pode colocar RuntimeException que é mais genérico na frente de outras
 * exceptions. Para resolver isso coloque as exceptions mais genéricas no final dos catchs.
 * 
 * */
 