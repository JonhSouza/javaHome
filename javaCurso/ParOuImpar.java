package javaCurso;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("É par!");
		} else {
			System.out.println("É ímpar!");
		}

		sc.close();
	}

}
