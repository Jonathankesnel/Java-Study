package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormallizeTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directorioProjeto = "Wnio.test.home.jonathan.dev";
		String arquivoTxt = "../../arquivo.txt";
		Path path1 = Paths.get(directorioProjeto,  arquivoTxt);
		System.out.println(path1);
		System.out.println(path1.normalize());


	}

}
