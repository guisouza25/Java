package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class Teste_02_ArrayList_LinkedList {

	public static void main(String[] args) {
		
		//Generics < >. Tipifica o tipo de referência.
		List<Conta> lista = new LinkedList<>();
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(11, 23);
		ContaCorrente cc3 = new ContaCorrente(11, 24);
		ContaCorrente cc4 = new ContaCorrente(11, 25);
		//Cliente cliente1 = new Cliente("João", "222.222");
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		lista.remove(2);
		
		System.out.println("Tamanho: " + lista.size());
		
		//Com o <Conta> não precisa mais fazer o cast.
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		
		
		
		
		
		
		
//--------------------------------------
		
		for(int i = 0; i < lista.size(); i ++) {
			System.out.println(lista.get(i));
		}
		System.out.println("------------");
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("------------");
		
		
//--------------------------------------
		
		//Criar lista a partir de outra.
		ArrayList<Conta> novaLista = new ArrayList<>(lista);
		
		for(Conta i : novaLista) {
			System.out.println(i);
		}
		
	}

}
