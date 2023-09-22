package _06EstruturaCondicional;

public class _01CaixaEletronico {
	public static void main(String[] args) {

		double saldo = 25.0;
		double valorSolicitado = 17.0;

		//Condição Simples
		if (valorSolicitado < saldo)
			saldo = saldo - valorSolicitado;

		System.out.println(saldo);

	}

}
