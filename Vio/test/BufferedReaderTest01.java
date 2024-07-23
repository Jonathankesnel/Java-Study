package Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/src/file2.txt");
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)){
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
