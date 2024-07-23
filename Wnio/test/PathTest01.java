package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/pasta2/arquivo_renomeado.txt");
		Path p2 = Paths.get("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/pasta2, arquivo_renomeado.txt");
		Path p3 = Paths.get("/home", "/Projeto lista ToDo-java/Curso_Java_YT/pasta2", "arquivo_renomeado.txt");
		Path p4 = Paths.get("home", "kesnel", "Projeto lista ToDo-java", "Curso_Java_YT", "pasta2", "arquivo_renomeado.txt");

		System.out.println(p1.getFileName());
		System.out.println(p2.getFileName());
		System.out.println(p3.getFileName());
		System.out.println(p4.getFileName());

	}

}
