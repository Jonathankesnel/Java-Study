package Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Criando uma pasta
		File fileDiretorio = new File("boola");
		boolean isDiretorioCriado = fileDiretorio.mkdir();
		System.out.println("Folder is created? "+isDiretorioCriado);
		//Criando um arquivo dentro da pasta
		File fileArquivoDiretorio = new File(fileDiretorio , "arquivo.txt");
		boolean isFileCreated = fileArquivoDiretorio.createNewFile();
		System.out.println("arquivo.txt is created? "+isFileCreated);
		//para renomear arquivo
		File fileRename = new File(fileDiretorio, "arquivo_renomeado.txt");
		boolean isRenamed = fileArquivoDiretorio.renameTo(fileRename);
		System.out.println("arquivo.txt is renamed? "+isRenamed);
		// Renomear diretório
		File diretorioRenamed = new File("pasta2");
		boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
		System.out.println("Folder pasta is renamed? "+isDiretorioRenamed);
	}

}
