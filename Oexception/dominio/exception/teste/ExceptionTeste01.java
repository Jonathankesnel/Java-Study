package Oexception.dominio.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		criarNovoArquivo();
	}
	public static void criarNovoArquivo() throws IOException  {
		File file = new File("Arquivo\\teste.txt");
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
		}catch(IOException e) {
			//NÃO PODE DEIXAR EM BRANCO ESSE BLOCO!!!
			//Evite colocar regra de negócio no catch!!!
			e.printStackTrace();
			throw e;
		}
	}
}
