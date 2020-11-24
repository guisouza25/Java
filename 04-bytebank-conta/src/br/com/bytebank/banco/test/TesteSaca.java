package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoException;

public class TesteSaca {

	public static void main(String[] args) throws SaldoException {

		ContaCorrente c = new ContaCorrente(123, 321);
		ContaCorrente c2 = new ContaCorrente(124, 323);

		c.deposita(200);

		try {
			c.transfere(300, c2);
		} catch (SaldoException ex) {
			
		}
		
		
		System.out.println(c.getSaldo());
		System.out.println(c2.getSaldo());
	}

}
