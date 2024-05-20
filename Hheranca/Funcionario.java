package Hheranca;

public class Funcionario extends Pessoa {

	private double salario;
	

	public Funcionario(String nome) {
		super(nome);
	}
	
	
	public void imprime() { // A regra da Sobrescrita sempre vai importar os atributos da super classe(classe PAI).
		super.imprime(); // Esse formato "super" chama o método da classe PAI. Método "imprime() é do objeto Pessoa.
		System.out.println(this.salario);
	}
	
	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
