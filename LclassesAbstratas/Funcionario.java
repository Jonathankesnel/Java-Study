package LclassesAbstratas;

public abstract class Funcionario extends Pessoa{
	//Uma classe abstrata é criada para ser uma SUPER CLASSE.
	//Métodos abstratos só podem existir dentro de classes abstradas.
	// Porém, classes abstratas podem ter métodos concretos.
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}

	public abstract void calculaBonus();
	//Métodos abstratos não tem corpo
	// Quando se tem métodos abstratos devemos prover a implementação nas subclasses.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Funcionario{" + 
				"nome='" + nome + '\'' +
				", salario=" + salario + 
				'}';
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo...");
	}

}
