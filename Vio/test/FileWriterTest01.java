package Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileREader
//BufferedWriter
//BufferedREader
public class FileWriterTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/src/file2.txt");
		FileWriter writer = null;
		try {
			FileWriter  fw = new FileWriter(file);
			fw.write("Olá tuo bem?");
			
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
