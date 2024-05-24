package Minterfaces;

public class DataLoaderTeste01 {

	public static void main(String[] args) {
		DataBaseLoader dataBaseLoader = new DataBaseLoader();
		FileLoader fileLoader = new FileLoader();
		dataBaseLoader.load();
		fileLoader.load();
		dataBaseLoader.remover();
		fileLoader.remover();
		dataBaseLoader.checkPermission();
		fileLoader.checkPermission();
		dataBaseLoader.retrieveMaxDataSize();
		DataLoader.retrieveMaxDataSize();
	}
}
