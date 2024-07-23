package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasciFileAttributesTest02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("pasta2/novo2.txt");
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
		FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
		
		System.out.println("CreationTime"+ creationTime);
		System.out.println("lastModifiedTime"+ lastModifiedTime);
		System.out.println("lastAccessTime"+ lastAccessTime);
		
		// Para alterar os dados do arquivo basta usar as classes: BasicFilesAttributesView, DosFileAtributesView, PosixFileAtributesView
		// Essas classes darão métodos para alterar os dados de um arquivo
		System.out.println("-------------------------------------------------------");
		
		BasicFileAttributeView basicFileAttributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		
		
		 creationTime = basicFileAttributesView.readAttributes().creationTime();
		 lastModifiedTime = basicFileAttributesView.readAttributes().lastModifiedTime();
		 lastAccessTime = basicFileAttributesView.readAttributes().lastAccessTime();
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		basicFileAttributesView.setTimes(lastModifiedTime,newCreationTime , creationTime);
		
		System.out.println("CreationTime"+ creationTime);
		System.out.println("lastModifiedTime"+ lastModifiedTime);
		System.out.println("lastAccessTime"+ lastAccessTime);

	}

}
