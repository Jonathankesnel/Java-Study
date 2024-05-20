package CadastroArenaX;

public class Pregadores {

	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	public Pregadores(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	

	public Pregadores(String nome, String especialidade, Seminario[] seminario) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}
	
	public void imprime() {
		System.out.println("-------------------------------------");
		System.out.println("Pregador: " + this.nome);
		if(seminarios == null) return;
		System.out.println("## Seminários Cadastrados ##");
		for(Seminario seminario: this.seminarios) {
			System.out.println(seminario.getTitulo());
			System.out.println(seminario.getLocal().getLocal());
			if(seminario.getPessoas() == null ||  seminario.getPessoas().length == 0) continue;
			System.out.println("*** Alunos ***");
			for(Pessoas pessoa: seminario.getPessoas()) {
				System.out.println("Cadastrados: " + pessoa.getNome() + ", " + pessoa.getIdade());
			}
			
		} 
	
		
	}



	public Seminario[] getSeminario() {
		return seminarios;
	}



	public void setSeminario(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
