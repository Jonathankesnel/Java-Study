package Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vai gerar um arquivo zipado
		Path arquivoZip = Paths.get("pasta/arquivo.zip");
		Path arquivoParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
		zip(arquivoZip, arquivoParaZipar);
		
	}
	private static void zip(Path arquivoZip, Path arquivoParaZipar) {
		try(ZipOutputStream zipOutPutStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)){
				for(Path file : directoryStream) {
					ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
					zipOutPutStream.putNextEntry(zipEntry);
					Files.copy(file, zipOutPutStream);
					zipOutPutStream.closeEntry();
				}
				System.out.println("Arquivo criado com sucesso!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
