package br.com.bytebank.banco.test.util;


import java.util.ArrayList;
import java.util.List;

public class Teste_05_OutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(6.3); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Double.valueOf(29);
		
		List<Number> lista = new ArrayList();
		
		lista.add(50);
		lista.add(45.89);
		
		System.out.println(lista);
		
		
	}

}
