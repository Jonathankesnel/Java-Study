package Rdates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

class ObterProximoDiaUtil implements TemporalAdjuster {
	
	public Temporal adjustInto(Temporal temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		int addDays;
		switch(dayOfWeek) {
		case THURSDAY: addDays = 4; break;
		case FRIDAY: addDays = 3; break;
		case SATURDAY: addDays = 2; break;
		default: addDays = 1;
		}
		return temporal.plus(addDays, ChronoUnit.DAYS);
	}
}

public class ExercitantoTemporalAdjustersTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* para o ex: Sexta, sábado e domingo não são dias úteis.
		 * O programa deve apresentar que dado uma determinada
		 * ele deve retornar o próximo dia útil.
		 * Por ex: Se der a data quinta, ele deve retornar segunda que é dia útil e pular
		 * sexta, sábado e domingo que não são dias úteis.
		 * */
		
		
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfWeek());
		
		now = LocalDate.now().with(new ObterProximoDiaUtil());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		now = LocalDate.now().withDayOfMonth(18).with(new ObterProximoDiaUtil());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		now = LocalDate.now().withDayOfMonth(24).with(new ObterProximoDiaUtil());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
		
		
		
		
	}

}
