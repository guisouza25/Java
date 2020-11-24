package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class Teste_06_Sort {

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
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("----------------");
		
		
		Collections.sort(lista, new Comparator<Conta>() {
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());}});
			
		lista.sort(new ComparatorNumeroConta());
		lista.sort(new ComparatorTitular());
		Collections.sort(lista, new ComparatorTitular());
		Collections.reverse(lista);
		Collections.shuffle(lista);
		Collections.rotate(lista, 1);
		
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
		
		int[] numeros = new int[]{43, 15, 64, 22, 89};
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//-----------------------------------------------------------------------
		
		Integer[] ArrayNumeros = { 2, 7, 8, 9, 1, 2 };
		List<Integer> ListaNumeros = Arrays.asList(ArrayNumeros);
		
		ComparatorNumero comparadorNumero = new ComparatorNumero();
		
		Arrays.parallelSort(ArrayNumeros, comparadorNumero);
		for(int i = 0; i < ArrayNumeros.length; i ++) {
			System.out.println(ArrayNumeros[i]);
		}

		Collections.sort(ListaNumeros);
		System.out.println(ListaNumeros);
		
		Collections.sort(ListaNumeros, comparadorNumero);
		System.out.println(ListaNumeros);
		
		ListaNumeros.sort(null);
		System.out.println(ListaNumeros);
	}
}

class ComparatorTitular implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareToIgnoreCase(nomeC2);
	}
}

class ComparatorNumeroConta implements Comparator<Conta>  {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		//return c1.getNumero() - c2.getNumero();
		
		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}
}

class ComparatorNumero implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1.intValue() < o2.intValue()) {
			return -1;
		}
		if (o1.intValue() > o2.intValue()) {
			return 1;
		}
		return 0;
	}
}
