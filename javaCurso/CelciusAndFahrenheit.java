package javaCurso;

import java.util.Scanner;

public class CelciusAndFahrenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.println("Informe a temperatura em Celcius: ");
			double C = sc.nextDouble();
			double F = C * 1.8 + 32;
			System.out.printf("O equivalente em F: %.1f.%n", F);
			System.out.println("Deseja refazer (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
