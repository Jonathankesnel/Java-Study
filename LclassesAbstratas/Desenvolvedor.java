package LclassesAbstratas;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.05;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Desenvolvedor{" + 
				"nome='" + nome + '\'' +
				", salario=" + salario + 
				'}';
	}

}
