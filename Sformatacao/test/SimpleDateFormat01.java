package Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
		/*Tudo que eu queira que seja ignorado dentro do date.format
		 * eu coloco em aspas simples. Por exemplo acima 'de'*/
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		try {
			System.out.println(sdf.parse("Amsterdam 13 de dezembro de 2023"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
