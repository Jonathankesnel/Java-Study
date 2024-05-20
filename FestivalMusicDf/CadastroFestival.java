package FestivalMusicDf;

public class CadastroFestival {

	public static void main(String[] args) {
		
		Local local = new Local("Rua das Laranjeiras, Rua 40, Parque da Cidade");
		Cantores cantores = new Cantores("Brunão", "Banda: Morada");
		Pessoas pessoas = new Pessoas("Bruna Brandão", 23);
		Pessoas pessoas1 = new Pessoas("Emiliano", 25);
		Pessoas[] pessoasCadastradas = {pessoas, pessoas1};
		Festival festival = new Festival("Music To Life", local, pessoasCadastradas);
		Festival[] festivaisDisponiveis = {festival};
		
		cantores.setFestival(festivaisDisponiveis);
		cantores.imprime();
		
		
	}
}
