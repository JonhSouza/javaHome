package javaCurso;

import java.util.Scanner;

public class IdentifiqueMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três números inteiros: ");

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int higher = max(x, y, z);

		showResult(higher);

		sc.close();

	}

	public static int max(int a, int b, int c) {
		int aux = 0;
		if (a > b && a > c) {
			aux += a;
		} else if (b > a && b > c) {
			aux += b;
		} else {
			aux += c;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}

}
