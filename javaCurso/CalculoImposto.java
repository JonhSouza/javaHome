package javaCurso;

import java.util.Scanner;

public class CalculoImposto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua renda: ");
		double renda = sc.nextDouble();
		double imposto;

		if (renda < 2000.00) {
			System.out.println("ISENTO");
		} else if (renda >= 2000.01 && renda < 3000.00) {
			imposto = renda * 0.08;
			System.out.printf("Imposto pago: %.2f%n", imposto);
		} else if (renda >= 3000.01 && renda < 4500.00) {
			imposto = renda * 0.18;
			System.out.printf("Imposto pago: %.2f%n", imposto);
		} else if (renda >= 4500.01) {
			imposto = renda * 0.28;
			System.out.printf("Imposto pago: %.2f%n", imposto);
		} else {
			System.out.println("Informação inválida");
		}
		sc.close();
	}

}
