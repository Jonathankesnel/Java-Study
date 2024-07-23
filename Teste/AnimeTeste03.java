package Teste;

import Eblocosinicializacao.Anime;

public class AnimeTeste03 {

	public static void main(String[] args) {
		Anime anime = new Anime();

		for(int episodio: anime.getEpisodios()) {
			System.out.print(episodio + " ");
		}
	}
}
