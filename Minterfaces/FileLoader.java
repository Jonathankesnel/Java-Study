package Minterfaces;

public class FileLoader implements DataLoader, DataRemover{

	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Carregando dados de um arquivo");
	}

	@Override
	public void remover() {
		// TODO Auto-generated method stub
		System.out.println("Deletando dados de um arquivo");

	}

	@Override
	public void checkPermission() {
		// TODO Auto-generated method stub
		System.out.println("Checando permissões no arquivo");
	}
	
}
