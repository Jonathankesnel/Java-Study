package Vio.test;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWtriterTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				File file = new File("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/src/file2.txt");
				FileWriter writer = null;
				try(FileWriter  fw = new FileWriter(file, true);
						BufferedWriter bw = new BufferedWriter(fw)) {
					
					bw.write("Olá tuo bem?");
					bw.newLine();
					bw.flush();
					
					
				} catch (IOException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} 
	}

}
