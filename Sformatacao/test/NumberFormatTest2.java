package Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale localeDefault = Locale.getDefault();
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALIAN;
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getCurrencyInstance(); // com getCurrencyInstance() consigo pegar o valor atual padrão no meu pc
		nfa[1] = NumberFormat.getCurrencyInstance(localeJP); // Aqui eu to pegando o valor padrão no Japão e por ai vai
		nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
		nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
		double valor = 1000.2130;
		for(NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.getMaximumFractionDigits());
			numberFormat.setMaximumFractionDigits(2); // setMaximumFractionDigits() consigo controlar quantas casas decimais quero ver
			System.out.println(numberFormat.format(valor)); // format() imprime o valor formatado
		}
		String valorString = "￥1,000.21";
		try {
			System.out.println(nfa[1].parse(valorString)); // no parse() casa haja algum caractere inválido ele ignora todo o resto. 
			// POr exemplo nesse trecho. Ele ignora o restante do numero pois tem um "_" logo depois do 1. Caso haja uma letra antes do primeiro número retornará uma excecão
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
