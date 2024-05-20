package conteudo;

public class SwitchCase {

	public static void main(String[] args) {
		byte dia = 5;
		// char, int, byte, short, enum, e string
		//usando o switch
		switch(dia) {
		case 1: 
			System.out.println("Segunda");
			break;
		case 2: 
			System.out.println("Terça");
			break;
		case 3: 
			System.out.println("Quarta");
			break;
		case 4: 
			System.out.println("Quinta");
			
		case 5: 
			System.out.println("Sexta");
			if(true) {
				System.out.println("Sextoooou");
			}
			break;
		
		case 6: 
		System.out.println("Sábado");
		}
		
		String sexo = "F";
		switch(sexo) {
		case "F":
			System.out.println("Feminino");
			break;
		case "M":
			System.out.println("Masculino");
			break;
		}
	}
}
