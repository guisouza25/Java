package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		cc1.deposita(100);
		
		SeguroDeVida segur1 = new SeguroDeVida();
		
		br.com.bytebank.banco.modelo.CalculadorImposto calculador = new CalculadorImposto();
		
		calculador.registra(cc1);
		calculador.registra(segur1);
		
		System.out.println(calculador.getTotalImposto());
		
		

	}

}
