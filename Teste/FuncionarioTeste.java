package Teste;

//import dominio.DadosFuncionario;
import dominio.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Funcionario funcionario1 = new Funcionario();
//	
//		funcionario1.nome = "Malak";
//		funcionario1.idade = 45;
//		funcionario1.salarios = new double[] {1200, 987.35, 2000};
//		
//		funcionario1.imprime();
//		funcionario1.mediaSalarial();
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		funcionario1.setNome("Kayo H.");
		funcionario1.setIdade(28);
		funcionario1.setSalarios(new double[]  {2500 , 3000.50, 4000});
		
		
		
		funcionario2.setNome("Ana");
		funcionario2.setIdade(25);
		funcionario2.setSalarios(new double[]  { 5000, 2000.50, 5000}); 
		
		
		
		funcionario3.setNome("Bruna L.");
		funcionario3.setIdade(21);
		funcionario3.setSalarios(new double[]  { 3500, 100.50, 4000});
		
		funcionario1.imprimeDados();
		funcionario1.mediaSalarial();
		
		System.out.println("----------------------------------------");
		
		funcionario2.imprimeDados();
		funcionario2.mediaSalarial();
		
		System.out.println("----------------------------------------");
		
		funcionario3.imprimeDados();
		funcionario3.mediaSalarial();
		System.out.println(funcionario1.getMedia());
		
		
		
		
		
	}

}
