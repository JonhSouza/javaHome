package javaCurso;

public class StringFunctions {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";

		String s1 = original.toLowerCase();
		System.out.println(original);
		System.out.println(s1);
		String s2 = original.toUpperCase();
		System.out.println(s2);
		String s3 = original.trim();
		System.out.println(s3);
		String s4 = original.substring(6);
		System.out.println(s4);
		String s5 = original.substring(6, 20);
		System.out.println(s5);
		String s6 = original.replace('a', 'x');
		System.out.println(s6);
		String s7 = original.replace("abc", "xyz");
		System.out.println(s7);
		int l1 = original.indexOf('a');
		int l2 = original.lastIndexOf('a');
		System.out.println(l1 + " e " + l2);

		String list = "potato lemon banana";
		String[] vect = list.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}
}