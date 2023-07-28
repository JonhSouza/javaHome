package javaCurso;

import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a hora inicial do jogo?");
		int timeStart = sc.nextInt();
		System.out.println("Qual a hora em que o jogo se encerrou?");
		int timeEnd = sc.nextInt();

		if (timeStart > timeEnd) {
			System.out.println("O JOGO DUROU " + (24 - (timeStart - timeEnd)) + " HORA(S)");
		} else if (timeStart > timeEnd) {
			System.out.println("O JOGO DUROU " + (timeEnd - timeStart) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

		sc.close();
	}

}
