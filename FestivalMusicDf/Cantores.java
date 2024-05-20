package FestivalMusicDf;

public class Cantores {
	
	private String nome;
	private String nomeBanda;
	private Festival[] festival;
	private Festival nomeFest;
	
	public Cantores(String nome, String nomeBanda) {
		
		this.nome = nome;
		this.nomeBanda = nomeBanda;
	}

	public Cantores(String nome, String nomeBanda, Festival[] festival) {
		super();
		this.nome = nome;
		this.nomeBanda = nomeBanda;
		this.festival = festival;
	}
	
	public void imprime() {
		System.out.println("---------------------------");
		System.out.println("Cantor: " + this.getNome() + " da Banda: " + this.nomeBanda);
		if(festival == null) return;
		System.out.println("## Seminários Cadastrados ##");
		for(Festival festival : this.festival) {
			System.out.println("Nome do Festival: " + festival.getNomeFest());
			System.out.println("Local do evento: " + festival.getLocal());
			if(festival.getPessoas() == null || festival.getPessoas().length == 0) continue;
			System.out.println("** Pessoas Cadastradas **");
			for(Pessoas pessoas : festival.getPessoas()) {
				System.out.println("Cadatrado: " + pessoas.getNome());
				System.out.println("Idade: " + pessoas.getIdade());
			}
		}
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public Festival[] getFestival() {
		return festival;
	}

	public void setFestival(Festival[] festival) {
		this.festival = festival;
	}

	public Festival getNomeFest() {
		return nomeFest;
	}

	public void setNomeFest(Festival nomeFest) {
		this.nomeFest = nomeFest;
	}

}
