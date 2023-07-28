package javaCurso;

import java.util.Scanner;

public class PlanoDeTelefone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os minutos: ");
		int minutos = sc.nextInt();
		int mPlano = 100, taxa = 0;
		int vPlano = 50;
		int total = vPlano + taxa;

		if (minutos > mPlano) {
			taxa = (minutos - mPlano) * 2;
			total = vPlano + taxa;
			System.out.printf("Seu valor excedeu o plano, você pagará uma taxa adicional de %d, totalizando %d.%n",
					taxa, total);
		} else {
			System.out.printf("Você pagará: %d.%n", vPlano);
		}
		sc.close();
	}

}
