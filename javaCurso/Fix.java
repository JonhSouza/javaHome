package javaCurso;

import java.util.Locale;

public class Fix {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String product1 = "computer";
		String product2 = "office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("products:");
		System.out.printf("%s, wich price is: %.2f.%n%s, wich price is: %.2f.%n", product1, price1, product2, price2);
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %s.%n", age, code, gender);
		System.out.println("");
		System.out.printf("Measue with eight decimal places: " + measure + ".%nRouded (three decimals places): %.3f.%n",
				measure);

	}

}
