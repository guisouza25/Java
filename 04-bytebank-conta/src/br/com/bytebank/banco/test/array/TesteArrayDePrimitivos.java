package br.com.bytebank.banco.test.array;

import java.util.Arrays;
import java.util.List;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		int[] numeros = {1,2,3,4,5};
		
		Integer[] numeros2 = {1,2,3,4,5};
		List<Integer> numeros3 = Arrays.asList(numeros2);
		
		
		
	}

}
