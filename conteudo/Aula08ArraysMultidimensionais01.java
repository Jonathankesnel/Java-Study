package conteudo;

public class Aula08ArraysMultidimensionais01 {

	public static void main(String[] args) {

		//1,2,3,3,4 Meses
		//31, 28, 31, 30 ( dias_)
		
		int[][] dias = new int[3][3];
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 30;
//		System.out.println(dias[0][0]);
//		System.out.println(dias[0][1]);
//		System.out.println(dias[0][2]);
		
		dias[1][0] = 31;
		dias[1][1] = 28;
		dias[1][2] = 30;
		
		for(int i = 0; i < dias.length; i++) {
			for(int j = 0; j < dias[i].length;j++) {
				System.out.println(dias[i][j]);
			}
		}
		System.out.println("=============================");

		
//		for(int[] arrBase: dias) {
//			for(int num: arrBase) {
//				System.out.println(num);
//			}
//		}
		
		for(int[] choco: dias) {
			for(int num: choco) {
				System.out.println(num);
			}
		}
	}
}
