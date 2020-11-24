package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	// o construtor não é herdado
	// mesmo inserindo este construtor especifico,
	// o java implicitamente tenta chamar o construtor da classe mãe

	public ContaCorrente(int agencia,int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoException {
		double taxa = 0.2;
		double valorSaque = valor + taxa;
		super.saca(valorSaque);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente. " + super.toString();
	}

}