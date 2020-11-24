package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class Teste_03_ArrayList_Equals {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(11, 23);
		ContaCorrente cc3 = new ContaCorrente(11, 23);
		
		lista.add(cc1);
		lista.add(cc2);
			
		//o metodo equals está implementado na classe conta
		//o contais internamente usa o equals, entao eu posso 
		//implmenetar o equals de acordo com  minha regra de 
		//igualdade e impedir que seja instanciada uma nova 
		//conta com numero e agencia iguais.
		System.out.println(cc2.equals(cc3));
		
		boolean existe = lista.contains(cc3);
		System.out.println("Existe? " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

		System.out.println(lista);

	}

}
