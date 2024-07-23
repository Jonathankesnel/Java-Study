package SobrecargaMetodos;

public class Anime {
	
	//Sobrecarga de métodos: São métodos de mesmo nome mas com a qtd de 
	//parametros ou tipos de parametros diferentes

	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	

	
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
	}
	
	public void init(String nome, String tipo, int episodios, String genero) {
		this.init(nome, tipo, episodios);
		this.genero = genero;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);


	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	public int getEpisodios() {
		return this.episodios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
