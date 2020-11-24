package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste_04_WrapperInteger {

	public static void main(String[] args) {
		
		Double idade = Double.valueOf(60);
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue()); //unboxing
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		int primitivo = idadeRef.intValue(); //unboxing - agora é um primitivo
		
		String s = args[0];
		
		//int numero = Integer.parseInt(s);
		Integer numero = Integer.valueOf(s);
			
		int a = numero + 90;
		System.out.println(s);
		System.out.println(numero);
		System.out.println(a);
		
		
		ArrayList<Integer> lista = new ArrayList<>();
	
		lista.add(idadeRef); //ok
		lista.add(primitivo); //autoboxing
		
		int i1 = lista.get(0); //unboxing
		Integer i2 = lista.get(1);
		
		
	}

}
