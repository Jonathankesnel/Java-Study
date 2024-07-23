package Rdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date  = LocalDate.parse("2027-08-06");
		LocalTime time = LocalTime.parse("09:45:00");
		System.out.println(localDateTime); // local date  + local time.
		System.out.println(date);
		System.out.println(time);
		LocalDateTime ldt1 = date.atTime(time);
		LocalDateTime ld2 = time.atDate(date);
		System.out.println(ldt1);
		System.out.println(ld2);
	}

}
