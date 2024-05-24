package JModificadorFinal;

public class Carro {
	private String nome;
	public static final double VELOCIDADELIMITE = 250;
	public final Comprador COMPRADOR = new Comprador();
	
	public final void imprime() {
		System.out.println(this.nome);
	}

	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
