package br.com.bytebank.banco.test.array;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteClasseArrayReferencias {

	public static void main(String[] args) {
		
		ArrayReferencias lista = new ArrayReferencias();
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(11, 23);
		
		lista.adiciona(cc1);
		lista.adiciona(cc2);
		
		int tamanho = lista.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) lista.getReferencia(0);
		System.out.println(ref.getNumero());
		
		

	}

}
