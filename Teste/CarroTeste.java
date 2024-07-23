package Teste;

import dominio.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.nome = "Lamborguini";
		carro.modelo = "Esportivo";
		carro.ano = 2023;
		
		Carro carro1 = new Carro();
		carro1.nome = "Corsinha";
		carro1.modelo = "Sedan";
		carro1.ano = 2008;
		
		Carro carro2 = new Carro();
		carro2.nome = "Santana";
		carro2.modelo = "Sedan";
		carro2.ano = 1996;
		
		System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
		System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
		System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

	}
	

}
