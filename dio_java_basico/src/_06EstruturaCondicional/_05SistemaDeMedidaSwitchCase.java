package _06EstruturaCondicional;

public class _05SistemaDeMedidaSwitchCase {

	public static void main(String[] args) {

		// Modo condicional switch / case

		String sigla = "M";

		switch (sigla) {
		case "P": {
			System.out.println("PEQUENO");
			break;
		}
		case "M": {
			System.out.println("M�DIO");
			break;
		}
		case "G": {
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}

		// exemplo 2

		// Modo condicional switch/case

		String plano = "M"; // M / T

		switch (plano) {
		case "T": {
			System.out.println("5Gb Youtube");
		}
		case "M": {
			System.out.println("WhatsApp e Instagram gr�tis");
		}
		case "B": {
			System.out.println("100 minutos de liga��o");
		}
		}

	}
}
