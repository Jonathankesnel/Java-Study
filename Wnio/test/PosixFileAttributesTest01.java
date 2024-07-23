package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {

	//USADO NO AMBIENTE LINUX
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("/home/kesnel/Projeto lista ToDo-java/Curso_Java_YT/pasta2/file.txt");
		PosixFileAttributes posixFileAttributes =  Files.readAttributes(path, PosixFileAttributes.class);
		System.out.println(posixFileAttributes.permissions());
		PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path,PosixFileAttributeView.class);
	 	Set<PosixFilePermission> PosixFilePermission = PosixFilePermissions.fromString("rw-rw-rw-");
		fileAttributeView.setPermissions(PosixFilePermission);
		System.out.println(fileAttributeView.readAttributes().permissions());
	}

}
