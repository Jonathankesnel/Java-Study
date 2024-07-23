package Rdates;

import java.util.Calendar;
import java.util.Date;

public class CalendaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingão é o primeiro dia da semana");
		}
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		c.add(Calendar.DAY_OF_MONTH, 0); // add dias no mÊs
		//c.add(Calendar.HOUR, 15); // adc horas no dia
		c.roll(Calendar.HOUR, 12);
		Date date = c.getTime();
		System.out.println(date);
	}

}
