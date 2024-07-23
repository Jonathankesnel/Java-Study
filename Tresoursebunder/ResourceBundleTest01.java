package Tresoursebunder;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "PT"));
		System.out.println(bundle.getString("oi"));
		System.out.println(bundle.getString("bom.dia"));
		System.out.println(bundle.getString("hi"));
		bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		//Obs: As chaves precisam ser iguais
		System.out.println(bundle.getString("oi"));
		System.out.println(bundle.getString("bom.dia"));
		//Locale("fr", "CA")
		//messages_fr_CA.properties ---  Se ele não achar esse arquivo ele vai tentar achar
		//messages_fr.properties --- vai tentar achar o arquivo so na lingua, se não achar, vai tentar
		//messages_en_US.properties--- se não achar nessa forma
		//messages_en.properties --- novamente, se não achar vai tentar a última forma que é o arquivo base
		//messages.properties --- último nível de consulta
		System.out.println(bundle.getString("hi"));

		
	}

}
