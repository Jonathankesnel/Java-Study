package Rdates;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime aniversario = LocalDateTime.of(1996, Month.AUGUST, 6, 12, 0, 0);
		LocalDateTime now = LocalDateTime.now();
		ChronoUnit.DAYS.between(aniversario, now);
		System.out.println(ChronoUnit.DAYS.between(aniversario, now));
		System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
		System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
		System.out.println(ChronoUnit.YEARS.between(aniversario, now));

	}

}
