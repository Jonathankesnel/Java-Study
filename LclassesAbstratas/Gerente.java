package LclassesAbstratas;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gerente{" + 
				"nome='" + nome + '\'' +
				", salario=" + salario + 
				'}';
	}

	@Override
	public void calculaBonus() {
		// TODO Auto-generated method stub
		this.salario += this.salario * 0.2;
		
	}

}
