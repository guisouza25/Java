
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		//quando se trabalha com dois tipos distintos em uma mesma operação, 
		//o resultado é o maior deles. 1 é int(32 bits) e valor é char(16 bits)
		//não consegue jogar o resultado que é int para char. por isso o type casting
		
		valor = (char) (valor + 1); 
		System.out.println(valor);	
		
		String palavra = "Alura cursos online ";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
