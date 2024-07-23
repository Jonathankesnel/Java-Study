package Uregex;

public class ScannetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Levi, Eren, Mikasa, true, 200";
		String[] nomes = texto.split(",");
		for(String nome: nomes) {
			System.out.println(nome.trim());
		}
	}

}
