package Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormaterTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sempre que ver a palavra "Formater" você ta transformando um obj em uma string
		// e toda vez que você ver a palavra "parse", vc ta transformando uma string em obj.
		
		LocalDate date = LocalDate.now();
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println();
		
		LocalDate parse1 =  LocalDate.parse("20231215", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 =  LocalDate.parse("2023-12-15+05:00", DateTimeFormatter.ISO_DATE);
		LocalDate parse3 =  LocalDate.parse("2023-12-15", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(parse1);
		System.out.println(parse2);
		System.out.println(parse3);
		
		System.out.println();
		
		LocalDateTime now = LocalDateTime.now();
		String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(s4);
		LocalDateTime parse4 = LocalDateTime.parse("2023-12-15T12:59:31.83103111", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(parse4);
		//dia/MM/YY padrão de data no BR
		//MM/dd/YY padrão de data no EUA
		//YY/MM/dd padrão de data no JP
		//PARA MUDAR O PADRÃO DA DATA PARA A QUE EU QUERO
		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatBr = LocalDate.now().format(formatterBR);
		System.out.println(formatBr);
		LocalDate parseBR = LocalDate.parse("15/12/2023", formatterBR);
		
		System.out.println(parseBR);
		
		
		DateTimeFormatter formatterGR =  DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		String formatGR = LocalDate.now().format(formatterGR); // Transformando obj em string
		System.out.println(formatGR);
		// invertendo...
		LocalDate parseGR = LocalDate.parse("15.Dezember.2023", formatterGR); // Transformando de String para obj
		System.out.println(parseGR);
	}

}
