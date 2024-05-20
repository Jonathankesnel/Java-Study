package conteudo;

public class ExercicioSwitchCase {

	//Utilizando Switch e dados os valores de 1 a 7 imprima se é dia útil ou fds; Considerando 1 como Domingo.

	public static void main(String[] args) {
		int dia = 5;
		
//		if(dia == 7 && dia == 1 ) {
//			System.out.println("Final de semana");
//		} else {
//			System.out.println("Dia útil");
//
//		}
		
		switch(dia) {
		case 1:
		case 7:
			System.out.println("final de semana");
			break;		
		case 2: 			
		case 3: 			
		case 4:			
		case 5:			
		case 6:
			System.out.println("dia útil");
			break;
		default: 
			System.out.println("Opção Inválida!");

		}
	}
	
		
	
}
