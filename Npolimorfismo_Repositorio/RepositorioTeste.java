package Npolimorfismo_Repositorio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Npolimorfismo_servico.RepositorioArquivo;
import Npolimorfismo_servico.RepositorioBancoDeDados;
import Npolimorfismo_servico.RepositorioMemoria;

public class RepositorioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Repositorio repositorio = new RepositorioMemoria();
		repositorio.salvar();
		List<String> List = new LinkedList<>();
		List.add("Goku");
		List.add("Vegeta");
		List.add("Kuririn");
		System.out.println(List);
	}

}
