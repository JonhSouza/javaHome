package javaCurso;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dia da semana em número: ");
		int x = sc.nextInt();
		String dia = null;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;

		case 3:
			dia = "Terça";
			break;

		case 4:
			dia = "Quarta";
			break;

		case 5:
			dia = "Quinta";
			break;

		case 6:
			dia = "Sexta";
			break;

		case 7:
			dia = "Sábado";
			break;
		}
		System.out.println("Dia da semana: " + dia + ".");

		sc.close();
	}

}
