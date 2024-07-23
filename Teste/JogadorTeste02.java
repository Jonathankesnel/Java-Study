package Teste;

import Associacao.Jogador;
import Associacao.Time;

public class JogadorTeste02 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		Time time = new Time("Seleção brasileira");
		
		jogador1.setTime(time);
		jogador1.imprime();
	}

}
