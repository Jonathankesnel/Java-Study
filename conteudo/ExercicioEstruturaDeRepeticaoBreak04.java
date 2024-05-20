package conteudo;

public class ExercicioEstruturaDeRepeticaoBreak04 {
// dado o valor de um carro descubra em quantas vezes ele pode ser parcelado;
	// valor da parela>= 1000;
	public static void main(String[] args) {
		double valorDoCarro = 30000;
		
		for(int parcela = 1; parcela <= valorDoCarro; parcela++) {
			double valorParcela = valorDoCarro / parcela;
			if(valorParcela < 1000) {
				break;
			} 
			
			System.out.println("parcela " + parcela + " R$"+ valorParcela);
			System.out.println("Fora do if, mas dentro do for " + parcela);
		}
		
		
		
		
	}
}
