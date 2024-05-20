package FestivalMusicDf;

public class Festival {

	private String nomeFest;
	private Local local;
	private Pessoas[] pessoas;

	public Festival(String nomeFest) {
		this.setNomeFest(nomeFest);
	}
	
	

	public Festival(String nomeFest, Local local) {
		super();
		this.nomeFest = nomeFest;
		this.local = local;
	}



	public Festival(String nomeFest, Local local, Pessoas[] pessoas) {
		super();
		this.nomeFest = nomeFest;
		this.local = local;
		this.pessoas = pessoas;
	}



	public String getNomeFest() {
		return nomeFest;
	}

	public void setNomeFest(String nomeFest) {
		this.nomeFest = nomeFest;
	}



	public Local getLocal() {
		return local;
	}



	public void setLocal(Local local) {
		this.local = local;
	}



	public Pessoas[] getPessoas() {
		return pessoas;
	}



	public void setPessoas(Pessoas[] pessoas) {
		this.pessoas = pessoas;
	}



	
}
