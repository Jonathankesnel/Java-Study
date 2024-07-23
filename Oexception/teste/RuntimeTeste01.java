package Oexception.teste;

public class RuntimeTeste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CHECKED E UNCHECKED - PRECISO LEMBRAR!!!
		//Checked: Exceções que são checadas e filhas da classe exception diretamente.
		// essas exceções se não tratadas vão lançar um erro em tempo de compilação.
		// Unchecked: Exceções que são filhas da classe RuntimeException.
		//Quando lançadas pelo programa o problema é do desenvolvedor que fez algo errado.
		// Ex: Formatar um número que é uma letra = lança "NumberFormatException"
		// Ex: Fazer um cast de um objeto que não pode = lança "ClassCastException"
		//Ex: Tentar acessar um objeto que não existe = lança "NullPointException"
		//Ex: Tentar acessar uma posição no Array (list) que não existe = lança "IndexOutOfBoundException"
		
		int[] nums = {1,2};
		System.out.println(nums[2]);	
		
	}

}
