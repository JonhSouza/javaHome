package javaCurso;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// identifique se o valor de A e B são múltiplos.

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe A: ");
		int A = sc.nextInt();
		System.out.println("Informe B: ");
		int B = sc.nextInt();

		if (A % B == 0) {
			System.out.println("São múltiplos!");
		}
		if (B % A == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}

		sc.close();
	}

}
