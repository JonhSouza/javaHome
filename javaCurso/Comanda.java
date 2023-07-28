package javaCurso;

import java.util.Scanner;

public class Comanda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resp = '?';
		double total = 0;
		do {

			System.out.printf(
					"Informe o pedido conforme a ID compatível:%n1: Cachorro quente (R$ 4,00)%n2: X salada (R$ 4,50)%n3: X bacon (R$ 5,00)%n4: Torrada simples (R$ 2,00)%n5: Refrigerante (R$ 1,50)%n");
			int pedido = sc.nextInt();
			System.out.println("Informe a quantidade: ");
			int quantidade = sc.nextInt();

			if (pedido == 1) {
				total += quantidade * 4.0;
			} else if (pedido == 2) {
				total += quantidade * 4.5;
			} else if (pedido == 3) {
				total += quantidade * 5.0;
			} else if (pedido == 4) {
				total += quantidade * 2.0;
			} else if (pedido == 5) {
				total += quantidade * 1.5;
			} else {
				System.out.println("Pedido inválido");

			}
			System.out.println("Deseja pedir mais alguma coisa? (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		System.out.printf("Seu pedido foi processado e teve um total de: %.2f", total);

		sc.close();
	}

}
