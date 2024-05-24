package Kenumeracoes;

public enum TipoCliente {
	// Ajuda muito na inserção de dados. Pois evita que erros na constante.
	// Enumeração é muito utilizado quando você tem uma escolha dentro de 
	// Um número determinado de opções possíveis.
	// Os atributos de uma ENUM nunca podem ser alterados
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");

	private int VALOR; // Obs: int valor tem que vim sempre depois das enumerações
	private String nomeRelatorio;
	TipoCliente(int valor, String nomeRelatorio) {
		this.VALOR = valor;
		this.nomeRelatorio = nomeRelatorio;
	}
	
	
	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		
		for(TipoCliente tipoCliente: values()) {
			if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}
		}
		return null;
	}

	public int getVALOR() {
		return VALOR;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

	


	
}

	
