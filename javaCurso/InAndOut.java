package javaCurso;

import java.util.Scanner;

public class InAndOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantity: ");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		System.out.println("Number: ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x > 10 && x < 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println("value in: " + in + ".");
		System.out.println("value out: " + out + ".");
		sc.close();
	}

}
