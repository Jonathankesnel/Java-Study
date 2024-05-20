package CadastroArenaX;

public class Pessoas {

	private String nome;
	private int idade;
	private Seminario seminario;
	
	public Pessoas(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}

	
	public Seminario getSeminario() {
		return seminario;
	}


	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
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
}
