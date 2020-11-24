package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public double getSaldo() {
		return super.getSaldo() + this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

}
