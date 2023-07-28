package javaCurso;

import java.util.Scanner;

public class WhilePassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int password = 0;
		int pwCorrect = 2002;

		while (password != pwCorrect) {
			System.out.println("Digite a senha: ");
			password = sc.nextInt();
			if (password == pwCorrect) {
				System.out.println("Correct password.");
			} else {
				System.out.println("Invalid password.");
			}

		}

		sc.close();
	}

}
