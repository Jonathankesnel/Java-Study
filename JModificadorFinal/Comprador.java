package JModificadorFinal;

public class Comprador {

	private String nome;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comprador{" + 
				"nome='" + nome + '\'' + 
				'}';
	}


	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
