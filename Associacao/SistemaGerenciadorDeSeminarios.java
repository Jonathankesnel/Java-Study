package Associacao;



public class SistemaGerenciadorDeSeminarios {

	public static void main(String[] args) {
		
		Local local = new Local("Rua das Laranjeitas");
		Aluno aluno = new Aluno("Jonathan", 28);
		ProfessorSemi professor = new ProfessorSemi("Naruto", "Matemático");
		Aluno[] alunosParaSeminario = {aluno};
		Seminario seminario = new Seminario("SGBD", alunosParaSeminario,local );
		
		Seminario[] seminarioDisponiveis = {seminario};
		
		professor.setSeminarios(seminarioDisponiveis);
		
		professor.imprime();

	}
	
}
