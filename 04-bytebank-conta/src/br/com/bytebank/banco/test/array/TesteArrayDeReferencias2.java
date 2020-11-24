package br.com.bytebank.banco.test.array;

public class TesteArrayDeReferencias2 {

	public static void main(String[] args) {
		
		String nome = "alura teste";
		String[] dividido = nome.split("a");

		for (int i = 0; i < dividido.length; i++) {
			System.out.println(dividido[i].trim());
		}
		System.out.println(dividido);

		//---------------------------------------------------
		
//		String[] meuVetor = nome.split("a");
//		int posicaoInicial = 0;
//		if (meuVetor[0].equals("")) {
//
//			posicaoInicial++;
//		}
//		for (int i = posicaoInicial; i < meuVetor.length; i++) {
//			System.out.println(dividido[i].trim());
//		}
		
	}

}
