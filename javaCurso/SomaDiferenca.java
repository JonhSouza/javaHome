package javaCurso;

import java.util.Scanner;

public class SomaDiferenca {

	public static void main(String[] args) {
		// Receba 4 valores inteiros (A,B,C,D) e em seguida mostre a diferença de A e B,
		// e a diferença de C e D.

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		int A = sc.nextInt();

		System.out.println("Informe o valor de B: ");
		int B = sc.nextInt();

		System.out.println("Informe o valor de C: ");
		int C = sc.nextInt();

		System.out.println("Informe o valor de D: ");
		int D = sc.nextInt();

		int diferencaAB = 0;
		int diferencaCD = 0;

		if (A > B) {
			diferencaAB = A - B;
		} else {
			diferencaAB = B - A;
		}

		if (C > D) {
			diferencaCD = C - D;
		} else {
			diferencaCD = D - C;
		}

		System.out.printf("a diferença entre A:%d e B:%d é %d.%n", A, B, diferencaAB);
		System.out.printf("a diferença entre C:%d e D:%d é %d.%n", C, D, diferencaCD);

		sc.close();
	}

}
