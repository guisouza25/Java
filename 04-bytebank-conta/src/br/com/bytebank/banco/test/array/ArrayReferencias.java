package br.com.bytebank.banco.test.array;

public class ArrayReferencias {
	
	private Object[] referencias;
	private int posicao;
	
	public ArrayReferencias() {
		this.referencias = new Object[10];
		this.posicao = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[posicao] = ref;
		posicao ++;
	}

	public int getQuantidadeElementos() {	
		return this.posicao;
	}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}
	
}
