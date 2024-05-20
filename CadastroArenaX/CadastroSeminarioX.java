package CadastroArenaX;

public class CadastroSeminarioX {

	public static void main(String[] args) {

		Local local = new Local("Asa sul");
		Pessoas pessoas = new Pessoas("Jonathan K.", 28);
		Pessoas pessoas1 = new Pessoas("Carla Magnum", 23);
		Pregadores pregadores = new Pregadores("Billy Grahm", "Restauração da Fé");
		Pessoas[] pessoaCadastrada = {pessoas, pessoas1};
		Seminario seminario = new Seminario("Voltando ao primeiro amor", pessoaCadastrada, local);
		
		Seminario[] seminariosDisponiveis = {seminario};
		
		pregadores.setSeminario(seminariosDisponiveis);
		
		pregadores.imprime();
	
	}
	
}
