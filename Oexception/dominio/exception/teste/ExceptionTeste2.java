package Oexception.dominio.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		criarNovoArquivo();
	}
	private static void criarNovoArquivo() {
		File file = new File("Arquivo\\teste.txt");
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
		}catch(IOException e) {
			//NÃO PODE DEIXAR EM BRANCO ESSE BLOCO!!!
			//Evite colocar regra de negócio no catch!!!
			e.printStackTrace();
		}
	}
}
