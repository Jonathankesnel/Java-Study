package conteudo;

public class EstruturaDeRepeticao03 {

	//imprima de os primeiros 25 numeros de um dado valor;
	
	public static void main(String[] args) {
		int valorMax = 50;
		for(int i = 0; i < valorMax; i++) {
			if( i > 25) {
				break;
			}
			System.out.println(i);
		}
	}
}
