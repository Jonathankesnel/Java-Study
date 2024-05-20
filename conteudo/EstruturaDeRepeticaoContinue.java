package conteudo;

public class EstruturaDeRepeticaoContinue {

	public static void main(String[] args) {
		double valorDoCarro = 30000;
		
		for(int parcela = (int) valorDoCarro; parcela >= 1 ; parcela--) {
			double valorParcela = valorDoCarro / parcela;
			if(valorParcela < 1000) {
				continue;
			}
			System.out.println("parcela " + parcela + " R$"+ valorParcela);

		}
		
		
		
		
	}
}
