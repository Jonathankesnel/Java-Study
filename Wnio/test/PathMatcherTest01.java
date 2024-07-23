package Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path1 = Paths.get("pasta/subpasta/file.bkp");
		Path path2 = Paths.get("pasta/subpasta/file.txt");
		Path path3 = Paths.get("pasta/subpasta/file.java");
		matches(path1, "glob:*.bkp");
		matches(path1, "glob:**/*.bkp"); // encontrar um arquivo específico
		matches(path2, "glob:**/*.{bkp,txt,java}"); // encontrar os 3 arquivos
		matches(path3, "glob:**/*.{bkp,txt,java}");
		matches(path1, "glob:**/*.???"); // encontrar um arquivo com 3 letras  por exemplo
		matches(path2, "glob:**/*.???"); // encontrar um arquivo com 3 letras  por exemplo
		matches(path3, "glob:**/*.???"); // encontrar um arquivo com 3 letras por exemplo (false pq java tem 4 letras )
		matches(path3, "glob:**/*.????"); // encontrar um arquivo com 3 letras específicas por exemplo



	}
	
	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(glob + ":" + matcher.matches(path));
	}
}
