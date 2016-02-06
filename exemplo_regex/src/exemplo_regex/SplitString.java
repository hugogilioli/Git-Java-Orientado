package exemplo_regex;

public class SplitString {

	public static void main(String[] args) {

		String texto = "O23java3é435uma45linguagem1orientada89a1objetos.";

		String[] palavras = texto.split("\\d+"); //Se houver um ou mais dígitos (0 a 9) entre cada palavra
												//será quebrado uma linha.
												//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}
