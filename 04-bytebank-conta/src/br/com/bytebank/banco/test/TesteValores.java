package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteValores {
	
	public static void main(String[] args) {
		
//		Cliente cliente1 = new Cliente("João", "222.222.222-22");
//		
//		Conta conta = new Conta(443,3434);
//		Conta conta1 = new Conta(454,7878);
//		
//		conta.setTitular(new Cliente("dddd","4444"));
//		
//		System.out.println(conta.getTitular().getNome());
//		
//		conta.setAgencia(-50);
//		conta.setNumero(-123);
//		
//		System.out.println(Conta.getTotal());
		
		Conta conta1 = new ContaCorrente(454, 145);
		Cliente cliente1 = new Cliente();
		
		conta1.setTitular(cliente1);
		
		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta1);
		
	}
}
