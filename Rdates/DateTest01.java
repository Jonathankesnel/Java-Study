package Rdates;

import java.util.Date;

public class DateTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(1702301634071L); // Conta o tempo através de milisegundos
		
		date.setTime(date.getTime() + 3_600_000);
		System.out.println(date);
		
		
	}

}
