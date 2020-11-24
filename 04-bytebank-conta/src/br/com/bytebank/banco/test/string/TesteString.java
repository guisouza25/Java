package br.com.bytebank.banco.test.string;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		String nome2 = nome.toUpperCase();
		String nome3 = nome.replace("A", "a");
		char nome4 = nome.charAt(2);
		int nome5 = nome.indexOf("ra");
		String nome6 = nome.substring(2);
		nome = nome.concat("+");
		
		System.out.println(nome);
		System.out.println(nome6);
		System.out.println(nome.length());
		System.out.println(nome.contains("Alu"));
		
		for(int i = 0; i < nome.length(); i ++) {
			System.out.println(nome.charAt(i));
		}
		
		
		String formulario = " ";
		String formulario2 = formulario.trim();
		System.out.println(formulario2.isEmpty());
		
		


	}

}
