
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println("Meu sal�rio � " + salario);
		
		//System.out.println(idade); N�o funciona, pois idade foi declarado depois
		
		//Estaticamente tipada
		
		double idade = 37; //Da esqueda para direita, atribuiu 37(int) 
						   //� idade e transformou em double(37.0)
		
		double divisao = idade / 2; //Quando idade chega aqui ele j� � 37.0
		System.out.println(idade);
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		//O javaprimeiro executa a divis�o(dois inteiros, resultado inteiro) 
		//depois passa o resultado para double
		
		double novaTentativa = 5 / 2;
		System.out.println(novaTentativa);
		
		double novaTentativa1 = 5.0 / 2;
		System.out.println(novaTentativa1);
	}

}
