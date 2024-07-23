package Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale localeDefault = Locale.getDefault();
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALIAN;
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localeJP);
		nfa[2] = NumberFormat.getInstance(localeBR);
		nfa[3] = NumberFormat.getInstance(localeIT);
		double valor = 1_000.2130;
		for(NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.getMaximumFractionDigits());
			System.out.println(numberFormat.format(valor));
		}
		String valorString = "1000.2130";
		try {
			System.out.println(nfa[0].parse(valorString)); // no parse() casa haja algum caractere inválido ele ignora todo o resto. 
			// POr exemplo nesse trecho. Ele ignora o restante do numero pois tem um "_" logo depois do 1. Caso haja uma letra antes do primeiro número retornará uma excecão
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
