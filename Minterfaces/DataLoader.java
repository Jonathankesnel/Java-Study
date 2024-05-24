package Minterfaces;

public interface DataLoader {
	//Dentro de uma interface os métodos são public e abstracts por natureza do Java.
	public static final int MAX_DATA_SIZE = 10;
	void load();
	
	default void checkPermission() {
		// Usando a palavra default você pode iniciar um método concreto na interface que será
		//Padrão para todas as outras classes que estão implementando.
		System.out.println("Fazendo checagem de permissão");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro da retrieveMaxDataSize da interface");
	}

}
