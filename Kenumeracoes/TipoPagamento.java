package Kenumeracoes;

public enum TipoPagamento {

		DEBITO{

			@Override
			public double calcularDesconto(double valor) {
				
				return valor * 0.1;
			} // Isso aqui evita de ficar usando vários If/else no código!
			
		}, CREDITO{

			@Override
			public double calcularDesconto(double valor) {
				// TODO Auto-generated method stub
				return valor * 0.05;
			}
			
		};
		
		public abstract double calcularDesconto(double valor);
		// Um método abstrato não pode ter corpo.
		// Ele foi criado para apenas ser sobrescrito!
	
}
