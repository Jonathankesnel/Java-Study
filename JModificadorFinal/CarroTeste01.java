package JModificadorFinal;

public class CarroTeste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();
		System.out.println(Carro.VELOCIDADELIMITE); 
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR); 
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Enzo");
		ferrari.imprime();
		
		

	}

}
