package LclassesAbstratas;

public class Teste {
	
	public static void main(String[] args) {

		Gerente gerente = new Gerente("Nami", 5000);
		System.out.println(gerente);
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 12000);
		System.out.println(desenvolvedor);
		gerente.imprime();
		desenvolvedor.imprime();
	}
	
}
