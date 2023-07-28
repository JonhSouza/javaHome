package javaCurso;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// ler dois valores e mostrar a soma deles.

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int valor1 = sc.nextInt();
		System.out.println("Informe outro número inteiro: ");
		int valor2 = sc.nextInt();
		int soma = valor1 + valor2;

		System.out.printf("A soma de %d e %d é: %d.%n", valor1, valor2, soma);

		sc.close();
	}

}
