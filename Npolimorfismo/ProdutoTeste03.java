package Npolimorfismo;

import Npolimorfismo_servico.CalculadoraImposto;

public class ProdutoTeste03 {

	public static void main(String args[]) {
		Produto produto = new Computador("Ryzen 9", 5000);
		Tomate tomate = new Tomate("Siciliano", 10);
		tomate.setDataValidade("11/12/2023");
		
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("---------------------------------------------------");
		CalculadoraImposto.calcularImposto(produto);

	}
}
