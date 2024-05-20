package conteudo;

public class EstruturaDeRepeticao {
	//while, do-while, for;

	public static void main(String[] args) {
		
		int count = 1;
		while(count <= 10) {
			System.out.println(count += 2);
		}
		
		count = 0;
		do {
			System.out.println("dentro do do-while" + count++);
			count++;

		} while(count < 10);
		
		for(int i = 0; i < 10; i++) { 
			System.out.println("For " + i);
		}
	}
}
