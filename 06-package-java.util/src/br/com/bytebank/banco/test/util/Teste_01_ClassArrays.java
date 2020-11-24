package br.com.bytebank.banco.test.util;

import java.util.Arrays;
import java.util.List;

public class Teste_01_ClassArrays {

	public static void main(String[] args) {
		
		Integer numero = new Integer(20);
		
		Integer[] numeros = { 2, 5, 7, 9, 7, 5, 4 };
		//Arrays.parallelSort(numeros);
		
		List<Integer> listaNumeros = Arrays.asList(numeros);

		for(Integer i : numeros) {
			System.out.println(i + ",");
		}
		
		System.out.println(listaNumeros);
		
		
	}

}
