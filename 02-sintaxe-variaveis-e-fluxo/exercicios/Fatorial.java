
public class Fatorial {
	
	public static void main(String[] args) {
		
		int resultadoFatorial = 1;
		
		for(int n = 1; n <= 10; n++) {
			
			resultadoFatorial *= n;
			
			System.out.println(n + "! = " + resultadoFatorial);
		}		
	}
}
