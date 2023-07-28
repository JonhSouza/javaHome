package javaCurso;

import java.util.Scanner;

public class SistemaDeCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Informe o pedido conforme a ID compatível: 1 = álcool 2 = gasolina 3 = diesel 4 = finalizar");
		System.out.println("Informe o ID:");
		int idS = sc.nextInt();

		int alcohol = 1, gasoline = 2, diesel = 3, end = 4;
		String grateful = "Thanks!";

		while (idS != end) {
			if (idS == alcohol) {
				System.out.println("Colocando álcool.");
				System.out.println("Informe o ID:");
				idS = sc.nextInt();
				while (idS != end) {
					System.out.println("Código incorreto.");
					System.out.println("Informe o ID:");
					idS = sc.nextInt();
				}
			} else if (idS == gasoline) {
				System.out.println("Colocando gasolina.");
				System.out.println("Informe o ID:");
				idS = sc.nextInt();
				while (idS != end) {
					System.out.println("Código incorreto.");
					System.out.println("Informe o ID:");
					idS = sc.nextInt();
				}
			} else if (idS == diesel) {
				System.out.println("Colocando diesel.");
				System.out.println("Informe o ID:");
				idS = sc.nextInt();
				while (idS != end) {
					System.out.println("Código incorreto.");
					System.out.println("Informe o ID:");
					idS = sc.nextInt();
				}

			} else {
				System.out.println("Inválido.");
				System.out.println("Informe o ID:");
				idS = sc.nextInt();
			}
		}
		System.out.println(grateful);
		sc.close();
	}

}
