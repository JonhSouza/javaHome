package javaCurso;

import java.util.Scanner;

public class Atribuicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0, y = 4;

		while (x < 3) {
			y += 2;
			x += 1;
		}

		System.out.println(x);
		System.out.println(y);

		sc.close();
	}

}
