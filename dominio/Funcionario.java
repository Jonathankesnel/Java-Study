package dominio;

public class Funcionario {


	private String nome;
	private int idade;
	private double salarios[];
	private double media;
	
	public void imprimeDados() {
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Idade do funcionário: " + this.idade);
		
		if(salarios != null) {
			for(double salarios: salarios ) {
				System.out.println(salarios + " ");
			}
			for(int i = 0; i < salarios.length; i++) {
				System.out.println("salario " + ( i + 1 ) + " = " + salarios[i] );
			}
		}

	}
	
	public void mediaSalarial() {
		if(salarios != null) {
			for(double salarios: salarios) {
				media += salarios;
			}
			media /= salarios.length;
			System.out.println("A média salarial do funcionário " + this.nome + " é de: " + media);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMedia() {
		return media;
	}

	

	
	

}

