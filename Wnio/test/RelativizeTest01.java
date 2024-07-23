package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dado dois paths como chegar no path2 partindo do path1?
		
		Path dir = Paths.get("/home/jonathan");
		Path clazz = Paths.get("/home/jonathan/jowebrabo/OlaMundo.java");
		Path pathToClazz = dir.relativize(clazz);
		System.out.println(pathToClazz);
		
		Path absoluto1 = Paths.get("/home/jonathan");
		Path absoluto2 = Paths.get("/usr/local");
		Path absoluto3 = Paths.get("/home/jonathan/jowebrabo/OlaMundo.java");
		Path relativo1 = Paths.get("temp");
		Path relativo2 = Paths.get("temp/temp.20211921");
		
		
		System.out.println("1 "+absoluto1.relativize(absoluto3));
		System.out.println("2 "+absoluto3.relativize(absoluto1));
		System.out.println("3 "+absoluto1.relativize(absoluto2));
		System.out.println("4 "+relativo1.relativize(relativo2));
		System.out.println("5 "+absoluto1.relativize(relativo1));

	
	}

}
