
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println("Meu salário é " + salario);
		
		//System.out.println(idade); Não funciona, pois idade foi declarado depois
		
		//Estaticamente tipada
		
		double idade = 37; //Da esqueda para direita, atribuiu 37(int) 
						   //à idade e transformou em double(37.0)
		
		double divisao = idade / 2; //Quando idade chega aqui ele já é 37.0
		System.out.println(idade);
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		//O javaprimeiro executa a divisão(dois inteiros, resultado inteiro) 
		//depois passa o resultado para double
		
		double novaTentativa = 5 / 2;
		System.out.println(novaTentativa);
		
		double novaTentativa1 = 5.0 / 2;
		System.out.println(novaTentativa1);
	}

}
