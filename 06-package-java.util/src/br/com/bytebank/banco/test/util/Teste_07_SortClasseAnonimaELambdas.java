package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class Teste_07_SortClasseAnonimaELambdas {

	public static void main(String[] args) {

		Conta cc1 = new Conta(22, 33);
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Nico");
		cc1.setTitular(cliente1);
		cc1.deposita(333.0);
		
		Conta cc2 = new Conta(22, 44);
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Guilherme");
		cc2.setTitular(cliente2);
		cc2.deposita(444.0);
		
		Conta cc3 = new Conta(22, 11);
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Paulo");
		cc3.setTitular(cliente3);
		cc3.deposita(111.0);
		
		Conta cc4 = new Conta(22, 22);
		Cliente cliente4 = new Cliente();
		cliente4.setNome("Ana");
		cc4.setTitular(cliente4);
		cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
	
		
		//Function Object
//		ComparatorNumeroConta2 comparador = new ComparatorNumeroConta2();
		
		
		//---------------Classe anônima--------------------------------------------
		
		lista.sort(new Comparator<Conta>() { //classe anonima
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());}});
		
		
		//Function Object
		Comparator<Conta> comp = new Comparator<Conta>() {
		public int compare(Conta c1, Conta c2) {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareToIgnoreCase(nomeC2);}};
		
		
		//----------------Lambdas--------------------------------------------------
		
		lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );
		
		Collections.sort(lista, (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );

		Collections.sort(lista, (c1, c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareToIgnoreCase(nomeC2); } );
		
		Comparator<Conta> comp2 = (c1,  c2) -> {
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();
				return nomeC1.compareToIgnoreCase(nomeC2);};
				//return Integer.compare(nomeC1.length(),nomeC2.length()); };
		
		//-----------------------------------------------------------------
				
		lista.sort( comp2 );		
		
		lista.forEach( (conta) -> System.out.println(conta.getTitular().getNome()) );
	
		lista.forEach(new Consumer<Conta>() {
			public void accept(Conta t) {
				System.out.println(t.getTitular().getNome());}});
		
//		for (Conta conta : lista) {
//			System.out.println(conta.getTitular().getNome());
//		}
		
		List<String> frutas = new ArrayList<String>();
		frutas.add("melancia");
		frutas.add("abacate");
		frutas.add("banana");
		
		frutas.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		System.out.println(frutas.toString());
	
	}
}




