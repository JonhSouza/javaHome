package javaCurso;

import java.util.Scanner;

public class PlanoDeTelefone2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os minutos: ");
		int minutos = sc.nextInt();
		double vPlano = 50.00;

		if (minutos > 100) {
			vPlano += (minutos - 100) * 2;
			System.out.printf("VALOR DO PLANO MENSAL: %.2f.%n", vPlano);
		} else {
			System.out.printf("VALOR DO PLANO MENSAL: %.2f.%n", vPlano);
		}

		sc.close();
	}

}
