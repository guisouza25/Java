
public class TestaConversao {
	
	public static void main(String[] args) {
		
		//double guarda 64 bits, float e int apenas 32.
		//para o java, 3.14 é um double. Acontece mesmo problema ao tantar guardar double dentro de int
		//fazendo o casting problema resolvido(colocando f ao final).
		//como o double armazena 64 bits e o float 32 bits, pode haver perda de informação ao fazer o casting 
		
		float pontoFlutuante = 3.14f; //3.14 é double
		System.out.println(pontoFlutuante);
		int numero = (int) 3.14;
		System.out.println(numero); //há perda de informação
				
		double salario = 1270.50;
		int valor = (int) salario; //casting - fazer a conversão
		System.out.println(valor);
		
		long numeroGrande = 2147483647;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		double idade = 30.0;
		System.out.println((int)idade);		
		
		//byte x =  11656;
		//System.out.println(x);	
	}
}
