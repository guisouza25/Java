package br.com.bytebank.banco.modelo;

/**
 * A classe conta é a superclass que representa a especificação de todos os
 * tipos de contas que existem no Bytebank.
 * 
 * @author José Guilherme Ferreira
 */
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	
	//Atributo do tipo referência para a classe Cliente, que representa o titular
	//de uma conta.
	
	private transient Cliente titular; //Também precisa ser serializable. 
									   //transient indica que não precisa ser serializable
									   //e não vai ser gravado no arquivo na serializacao

	//Atributo da classe conta(não de cada objeto), para computar o total de contas
	//criadas.
	
	private static int total;

	/**
	 * Construtor para um novo objeto do tipo conta recebendo
	 * o numero da agência e da conta.
	 * 
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	/**
	 * Seposita algum valor na conta.
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Saca algum valor do saldo da conta e lança uma exceção
	 * caso o saldo seja insuficiente.
	 * 
	 * @param valor
	 * @throws SaldoException
	 */
	
	public void saca(double valor) throws SaldoException {
		if (this.saldo < valor) {
			throw new SaldoException("Saldo insuficiente");
		} else {
			this.saldo -= valor;
		}
	}
	
	/**
	 * Transfere um valor de uma conta para outra conta de destino
	 * lançando uma exceção caso o saldo da conta de origem seja
	 * insuficiente.
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoException
	 */
	public void transfere(double valor, Conta destino) throws SaldoException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero da conta não pode ser negativo");
			return; // como é void o return nao deixa executar a linha seguinte
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Numero da agência não pode ser negativo");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	/**
	 * @return Retorna o total de contas que foram instanciadas.
	 */
	public static int getTotal() {
		return total;
	}
	
	/**
	 * Verifica se duas contas são iguais

	 * @param ref
	 * @return
	 */
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref; //fazendo o cast
		if (outra.numero == this.numero && outra.agencia == this.agencia) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero
				+ ", Agência: " + this.agencia;
	}

	
//	@Override
//	public int compareTo(Conta outra) {
//		//return (this.numero < conta.numero) ? -1 : ((this.numero == conta.numero) ? 0 : 1);
//		return Double.compare(this.saldo, outra.saldo);
//	}

	
	

	

	

	
}
