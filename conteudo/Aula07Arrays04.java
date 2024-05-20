package conteudo;

public class Aula07Arrays04 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		int[] numeros2 = new int[] {1,2,3,4,5};
		int[] numeros3 = {1,2,3,4,5,6,7};
		
//		for(int i = 0; i < numeros3.length; i++) {
//			System.out.println(numeros3[i]);
//		}
		
		for(int num:numeros3) {
			System.out.println(num);
		}
		
	}
}
