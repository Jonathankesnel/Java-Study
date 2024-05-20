package conteudo;

public class Aula07Arrays02 {

	public static void main(String[] args) {
	//Não pode-se dar new com tipos primitivos: byte, short, int, long, float, double = 0;
		// char '\u0000'
		// boolean  false;
		// string null;
		String[] nomes = new String[3];
		nomes[0] = "Goku";
		nomes[1] = "Kurosaki";
		nomes[2] = "Luffy";
		//nomes[3] = "Hinata";
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		nomes = new String[5];
	}
}
