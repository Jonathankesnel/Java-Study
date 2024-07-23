package Npolimorfismo_test;

import Npolimorfismo.Computador;
import Npolimorfismo.Televisao;
import Npolimorfismo.Tomate;
import Npolimorfismo_servico.CalculadoraImposto;

public class ProdutoTeste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computador computador = new Computador("NUC10i07", 11000);
		Tomate tomate = new Tomate("Siciliano", 10);
		Televisao tv = new Televisao("Sansung 50\"", 5000);
		
		CalculadoraImposto.calcularImposto(computador);
		System.out.println("---------------------------------------------------");
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("---------------------------------------------------");
		CalculadoraImposto.calcularImposto(tv);
		
		

	}

}
