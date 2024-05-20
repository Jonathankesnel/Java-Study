package CadastroArenaX;

public class Seminario {

	private String titulo;
	private Pessoas[] pessoas;
	private Local local;
	
	

	public Seminario(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	

	public Seminario(String titulo, Pessoas[] pessoas, Local local) {
		super();
		this.titulo = titulo;
		this.pessoas = pessoas;
		this.local = local;
	}



	public Pessoas[] getPessoas() {
		return pessoas;
	}



	public void setPessoas(Pessoas[] pessoas) {
		this.pessoas = pessoas;
	}






	public Local getLocal() {
		return local;
	}



	public void setLocal(Local local) {
		this.local = local;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
