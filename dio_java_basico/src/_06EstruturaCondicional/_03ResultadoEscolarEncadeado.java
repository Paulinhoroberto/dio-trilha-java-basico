package _06EstruturaCondicional;

public class _03ResultadoEscolarEncadeado {

	public static void main(String[] args) {
		int nota = 6;

		if (nota >= 7)
			System.out.println("Aprovado");
		else if (nota >= 5 && nota < 7)
			System.out.println("Recupera��o");
		else
			System.out.println("Reprovado");
	}
}
