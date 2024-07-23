package Wnio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


class ListAllJavaorClass extends SimpleFileVisitor<Path> {
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{.java,class}");

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		if(matcher.matches(file)) {
			System.out.println(file.getFileName().toString());
		}
		 return FileVisitResult.CONTINUE;
	}
		
}
	


public class PathMatcherTest02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// crie um programa que retorne todos os arquivos que contenham "Test" no nome e que tenham tmb .java ou .class
		
		Path root = Paths.get(".");
		
		Files.walkFileTree(root, new ListAllJavaorClass());
	}


}
