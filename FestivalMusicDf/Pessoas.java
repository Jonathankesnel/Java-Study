package FestivalMusicDf;

public class Pessoas {

	private String nome;
	private int idade;
	private Festival nomeFest;
	
	
	public Pessoas(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoas(String nome, int idade, Festival nomeFest) {
		this.nome = nome;
		this.idade = idade;
		this.nomeFest = nomeFest;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Festival getNomeFest() {
		return nomeFest;
	}

	public void setNomeFest(Festival nomeFest) {
		this.nomeFest = nomeFest;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
