package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pastaPath = Paths.get("pasta");	
		if(Files.notExists(pastaPath)) {
//			Path pastaDirectory = Files.createDirectory(pastaPath);
		}
		//Criando sub diretórios
		Path subPastaPath = Paths.get("pasta2/subpasta/subsubpasta");
		Path subPastaDirectory = Files.createDirectories(pastaPath);
		Path filePath = Paths.get(subPastaPath.toString(), "fileJ.txt");
		if(Files.notExists(filePath)) {
			Path filePathCreated =  Files.createFile( filePath);
			
		}
		//copiando arquivos
		Path source = filePath; // origem
		Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); //Para copiar arquivo de uma origem para destino
		//StandardCopyOption.REPLACE_EXISTING copia o conteúdo de um arquivo para outro
	}

}
