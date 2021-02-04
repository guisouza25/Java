package br.com.bytebank.banco.modelo;

public interface Tributavel {
	
	double getValorImposto();
	
	
	//default - herda o metodo 
//	default double getValorImposto() {
//		return 2;
//	}

}
