package Kenumeracoes;

public class Cliente {

	
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cliente{" + 
				"nome='" + nome + '\'' +
				", tipoClente=" + tipoCliente.getNomeRelatorio() + 
				", tipoClenteInt=" + tipoCliente.getVALOR() + 
				", tipoPagamento=" + tipoPagamento + 
				'}';
	}
	
	
	
}
