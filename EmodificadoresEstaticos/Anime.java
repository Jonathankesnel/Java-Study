package EmodificadoresEstaticos;

public class Anime {

		private String nome;
		private static int[] episodios;
		//0 - Bloco de inicialização é executado quando a JVM carregar classe
		//1 - Alocado espaço em memória pro objeto
		//2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
		//3 - Bloco de inicialização é executado
		//4 - O construtor é executado
		static {
			System.out.println("Dentro do bloco de inicialização estático 1");
			episodios = new int[100];
			for(int i = 0; i < 100; i++) {
				episodios[i] = i+1;
			}
		}
		static {
			System.out.println("Dentro do bloco de inicialização estático 2");
			
		}
		static {
			System.out.println("Dentro do bloco de inicialização estático 3");
			
		}
		{
			System.out.println("Dentro do bloco de não estático ");

		}
		
		
		public Anime(String nome) {
			this.nome = nome;
		}
		public Anime() {
			
			for(int episodios: Anime.episodios) {
				System.out.println(episodios + " ");
			}
			System.out.println();
		}
		public String getNome() {
			return nome;
		}
//		public void setNome(String nome) {
//			this.nome = nome;
//		}
		public int[] getEpisodios() {
			return episodios;
		}

		
		
	}



