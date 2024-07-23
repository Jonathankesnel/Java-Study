package Rdates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		System.out.println(Calendar.getInstance());
		System.out.println(Month.JANUARY.getValue());
		LocalDate date = LocalDate.of(1996, Month.APRIL, 25);
		LocalDate agora = LocalDate.now();
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.lengthOfMonth());
		System.out.println(date.isLeapYear()); // verifica se o ano é bissexto. Se true = bissexto. 
		System.out.println(date.get(ChronoField.DAY_OF_MONTH));
		System.out.println(date);
		System.out.println(agora);
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		
		/*LocalDate foi uma classe implementada no Java 8
		 *LocalDate é imutável: Você não pode instaciar usando "New"
		 *Classe imutável significa que toda atualização criará um novo objeto e precisaria
		 *associar novamente a uma variável de referência */

	}

}
