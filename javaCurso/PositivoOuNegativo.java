package javaCurso;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		// leia um número e identifique se é negativo ou não

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int x = sc.nextInt();

		if (!(x < 0)) {
			System.out.println("Número inteiro positivo.");
		} else {
			System.out.println("Número inteiro negativo.");
		}

		sc.close();
	}

}
