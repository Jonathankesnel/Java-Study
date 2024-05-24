package Npolimorfismo;

public class Tomate extends Produto {
	private static final double IMPOSTO_POR_CENTO = 0.06;
	private String dataValidade;
	
	public Tomate(String nome, double valor) {
		super(nome, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		System.out.println("Calculando imposto do tomate");
		return this.valor * IMPOSTO_POR_CENTO;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
}
