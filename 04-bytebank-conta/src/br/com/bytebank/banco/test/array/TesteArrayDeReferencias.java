package br.com.bytebank.banco.test.array;

import java.util.Arrays;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TesteArrayDeReferencias {
	
	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(11,11);
		ContaPoupanca cp1 = new ContaPoupanca(11,22);
		Cliente cliente = new Cliente();
		
		referencias[0] = cc1;
		referencias[1] = cp1;
		referencias[2] = cliente;
		
		List newReferencias = Arrays.asList(referencias);
		ContaCorrente ref = (ContaCorrente) newReferencias.get(0);
		
		//Object referencia = referencias[1];
		//Fazendo o cast type
		ContaPoupanca referencia = (ContaPoupanca) referencias[1];
		System.out.println(referencia.getNumero());
		
		//Compilador verifica o array. Array do tipo Object
		//Cast type de um tipo mais genérico para um mais específico
		ContaPoupanca ref2 = (ContaPoupanca) referencias[1]; 
		
		//ClassCastException
//		ContaCorrente ref2 = (ContaCorrente) referencias[1];
		
		System.out.println(cp1.getNumero());
		System.out.println(ref.getNumero());
		
		
		//------------------------------------------------------
		
//		//Uso da forma literal
//		
//		Conta[] conta = {cc1,cp1};
//		System.out.println(conta[1].getNumero());
//		
//		
//		System.out.println(conta);
		
	}
	
	
}
