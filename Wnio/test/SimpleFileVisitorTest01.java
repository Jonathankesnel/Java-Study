package Wnio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaFiles extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		
//		if(file.getFileName().endsWith(".java")) {
//			System.out.println("true");
//			
//		}
		//Desafio: Como imprimir todos os arquivos que terminam com ".java"? 
		if(file.getFileName().toString().endsWith(".java")) {
			
			System.out.println(file.getFileName().toString());
		}
		return FileVisitResult.CONTINUE;
		
	}
	
}

public class SimpleFileVisitorTest01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path root = Paths.get(".");
		Files.walkFileTree(root, new ListAllJavaFiles() );
	}

}
