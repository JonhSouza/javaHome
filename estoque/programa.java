package estoque;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("<Entre com o produto>");
		System.out.println("");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();

		System.out.println("<<<<<<<<<<PRODUTO>>>>>>>>>>");
		System.out.println("");
		System.out.println(produto);
		System.out.println("______________________________");
		System.out.println("Entre com a adição de estoque: ");

		int quantidade = sc.nextInt();

		produto.adicaoEstoque(quantidade);

		System.out.println("Estoque Atualizado: " + produto);
		System.out.println("______________________________");
		System.out.println("Entre com a remoção de estoque: ");
		quantidade = sc.nextInt();

		produto.remocaoEstoque(quantidade);

		System.out.println("Estoque Atualizado: " + produto);

		sc.close();
	}

}
