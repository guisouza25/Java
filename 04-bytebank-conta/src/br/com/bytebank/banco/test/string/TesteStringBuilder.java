package br.com.bytebank.banco.test.string;

import br.com.bytebank.banco.modelo.Conta;

public class TesteStringBuilder {

	public static void main(String[] args) {

		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto);
		
	
		
//		StringBuilder meuTexto = new StringBuilder("Socorram");
//		meuTexto.append("-");
//		meuTexto.append("me");
//		meuTexto.append(", ");
//		meuTexto.append("subi ");
//		meuTexto.append("no ");
//		meuTexto.append("ônibus ");
//		meuTexto.append("em ");
//		meuTexto.append("Marrocos");
//		String text = meuTexto.toString();
//		System.out.println(text.length());
//		
//		String nome = "ALURA";
//		StringBuilder cs = new StringBuilder("hhhh");
//
//		nome = nome.replace("AL", cs);
//
//		System.out.println(nome);
		
		
	}
}
