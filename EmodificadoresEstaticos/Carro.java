package EmodificadoresEstaticos;

public class Carro {

	private String nome;
	private double velociadeMaxima;
	private static double velocidadeLimite = 250;
	
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velociadeMaxima = velocidadeMaxima;
	}
	
//	public Carro(String nome2, int velocidadeMaxima) {
//		// TODO Auto-generated constructor stub
//	}

	public void imprime() {
		System.out.println("-------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velociadeMaxima);
		System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
		
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite() {
		return Carro.velocidadeLimite;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelociadeMaxima() {
		return velociadeMaxima;
	}
	public void setVelociadeMaxima(double velociadeMaxima) {
		this.velociadeMaxima = velociadeMaxima;
	}
		
}
