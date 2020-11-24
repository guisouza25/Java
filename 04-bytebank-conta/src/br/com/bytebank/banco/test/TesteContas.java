package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoException;


public class TesteContas {

	public static void main(String[] args) throws SaldoException {
		
		
		ContaCorrente cc1 = new ContaCorrente(111, 111);
		cc1.deposita(100);
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cc1.transfere(10, cp1);
		
		Object cc2 = new ContaCorrente(111, 254);
		
		System.out.println("CC: " + cc1.getSaldo());
		System.out.println("CP: " + cp1.getSaldo());
		
		System.out.println(Conta.getTotal());
		
		System.out.println(cc1);
		System.out.println(cp1);
		System.out.println(cc2);
		
		
		
	}

}
