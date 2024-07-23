package Rdates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trabalha com nanosegundos. Representa um ponto instantaneo dentro de uma timeline
		
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(LocalDateTime.now());
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano()); // 999.999.999
		System.out.println(Instant.ofEpochSecond(3));
		System.out.println(Instant.ofEpochSecond(3, 0));
		System.out.println(Instant.ofEpochSecond(3, 1_000_000));
		System.out.println(Instant.ofEpochSecond(3, -1_000_000));



	}

}
