package Rdates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map nada mais é uma coleção de chave e valor.
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		System.out.println(shortIds);
		System.out.println(ZoneId.systemDefault()); // pegar a zona do seu sitema atual
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyoZone);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		ZonedDateTime zoneDateTime =  now.atZone(tokyoZone);
		System.out.println(zoneDateTime);
		
		
		Instant nowInstant = Instant.now();
		System.out.println(nowInstant);
		ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
		System.out.println(zonedDateTime2);
		
		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);
		ZoneOffset zoneOffSetManaus = ZoneOffset.of("-04:00");
		OffsetDateTime offSetDateTime = now.atOffset(zoneOffSetManaus);
		System.out.println(offSetDateTime);
		OffsetDateTime offSetDateTime1 = OffsetDateTime.of(now, zoneOffSetManaus);
		System.out.println(offSetDateTime1);
		
		OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffSetManaus);
		System.out.println(offsetDateTime2);
		
		JapaneseDate japaneseDate =  JapaneseDate.from(LocalDate.now());
		System.out.println(japaneseDate);
		LocalDate meijiEra = LocalDate.of(1900, 2, 1);
		JapaneseDate meijiEraLocalDate = JapaneseDate.from(meijiEra);
		System.out.println(meijiEraLocalDate);
	}

}
