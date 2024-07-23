package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("pasta2/test.txt");
		
		if(Files.notExists(path)) Files.createFile(path);
		
//		Files.setAttribute(path, "dos:hidden", false);
//		Files.setAttribute(path, "dos:readonly", false);
		
		//Usando DosFileAttribute
		DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
		System.out.println(dosFileAttributes.isReadOnly());
		System.out.println(dosFileAttributes.isHidden());

		//usando DosFileAttributeView para alterar os atributos do arquivo
		DosFileAttributeView dosFileAtrributesView = Files.getFileAttributeView(path, DosFileAttributeView.class);
		dosFileAtrributesView.setHidden(true);
		dosFileAtrributesView.setReadOnly(true);
		
		System.out.println(dosFileAtrributesView.readAttributes().isHidden());
		System.out.println(dosFileAtrributesView.readAttributes().isReadOnly());

	}

}
