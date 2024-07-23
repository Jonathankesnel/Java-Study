package Npolimorfismo_servico;

import Npolimorfismo_Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		System.out.println("Salvando na Memória");
	}
}
