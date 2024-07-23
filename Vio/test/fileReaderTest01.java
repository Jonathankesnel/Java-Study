package Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/src/file2.txt");
		try(FileReader fr = new FileReader(file)){
//			char[] in = new char[40];
//			fr.read(in);
//			for(char c : in) {
//				System.out.print(c);
//			}
			int i;
			while((i= fr.read()) != -1){
				System.out.print((char) i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
