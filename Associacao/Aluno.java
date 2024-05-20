package Associacao;

import java.util.Scanner;

public class Aluno {

//	public static void main(String[] args) {
		
		private String nome;
		private int idade;
		private Seminario seminario;
		
		public Aluno(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
	
}
