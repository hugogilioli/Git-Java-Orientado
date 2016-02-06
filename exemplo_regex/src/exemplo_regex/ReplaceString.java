package exemplo_regex;

public class ReplaceString {

	public static void main(String[] args) {

		String texto = ("O valor do produto é: @xxx@");
		String novoTexto = texto.replaceAll("@x+@", "2.50"); // o character +
																// quer dizer
																// que posso ter
																// 1 ou mais x
		System.out.println(novoTexto);

	}
}
