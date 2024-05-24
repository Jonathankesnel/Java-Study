package Npolimorfismo;

public class ProdutoTeste02 {
	
	//Polimorfismo é a associação de um variável de referÊncia padrão ou genérica no caso
	// produto que está associada com uma Computador ou tomate que são objetos.

	public static void main(String[] args) {
		Produto produto = new Computador("Ryze 9", 3000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		System.out.println("---------------------------------");
		Produto produto2 = new Tomate("Cereja", 20);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
		
		

	}
}
