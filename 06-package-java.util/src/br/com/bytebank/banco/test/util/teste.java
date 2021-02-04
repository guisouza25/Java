package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class teste {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(111, 222);
		conta.deposita(50);
		System.out.println(conta.getValorImposto());
	}

}
