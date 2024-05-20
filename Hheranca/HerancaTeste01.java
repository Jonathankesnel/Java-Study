package Hheranca;

public class HerancaTeste01 {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 59");
		endereco.setCep("73060-500");
		
		Pessoa pessoa = new Pessoa("Toyohisa Shimazu");

		pessoa.setCpf("24585258");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
	
		
		Funcionario funcionario = new Funcionario("Oda Nobunaga");
		funcionario.setCpf("55555555555");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(2000);
		System.out.println("------------------");
		
		funcionario.imprime();
	}
}
