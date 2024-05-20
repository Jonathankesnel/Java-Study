package Hheranca;

public class Pessoa {

	protected String nome; // Protected fornece o acesso da variável em outras classes. Porém se vc estiver
	// em outro pacote deverá usar "extends" para extender a classe que tem o protected e poder usar a variável
	protected String cpf;
	protected Endereco endereco;
	
	public Pessoa(String nome) {
		
		this.nome = nome;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(cpf);
		System.out.println(this.endereco.getRua() + " "+ this.endereco.getCep());

	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
