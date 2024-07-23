package Sobrescrita;

public class Anime {
	private String nome;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Anime{" + "nome='" + nome + '\'' + '}';
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
