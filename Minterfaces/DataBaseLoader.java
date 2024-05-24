package Minterfaces;

public class DataBaseLoader implements DataLoader, DataRemover {
// Diferente da Classe que não pode extender multiplas Classes. 
// As interfaces podem implementar multiplas Interfaces;
// Modificadores de acesso na ordem de englobação: private -> default -> protected -> public
	
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("Carregando dados do banco de dados");
	}

	
	public void remover() {
		// TODO Auto-generated method stub
		System.out.println("Removendo dados do banco de dados");

	}


	@Override
	public void checkPermission() {
		// TODO Auto-generated method stub
		System.out.println("Checando permissões no banco de dados");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro da retrieveMaxDataSize na Classe");
	}


}
