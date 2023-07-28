package javaCurso;

public class ConversaoVariavel {

	public static void main(String[] args) {
		// Fazendo o compilador entender a transformação de variável (cast)

		int a = 5;
		int b = 2;
		double resultado = (double) a / b;
		System.out.println(resultado);

		double c;
		int d;

		c = 5.0;
		d = (int) c;
		System.out.println(d);

	}

}
