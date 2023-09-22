package _07EstruturaRepeticao;

import java.util.Random;

public class _05ExDoWhile {

	// ExemploDoWhile.java

	public static void main(String[] args) {
		System.out.println("Discando...");

		do {
			// excutando repetidas vezes at� algu�m atender
			System.out.println("Telefone tocando");

		} while (tocando());

		System.out.println("Al� !!!");
	}

	private static boolean tocando() {
			boolean atendeu = new Random().nextInt(3)==1;
			System.out.println("Atendeu? " + atendeu);
			//negando o ato de continuar tocando
			return ! atendeu;
		}
}