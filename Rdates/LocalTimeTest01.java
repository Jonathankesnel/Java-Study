package Rdates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.of(23, 32, 12);
		LocalTime timeNow = LocalTime.now();
		System.out.println(time);
		System.out.println(timeNow);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		System.out.println(LocalTime.MIN); // começo do dia
		System.out.println(LocalTime.MAX); // final do dia - Muito útil para gerar relatórios
	}

}
