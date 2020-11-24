
public class TestaLacos {
	
	public static void main(String[] args) {
		
		
		for(int tabuada = 1; tabuada <= 10; tabuada ++) {
			
			for(int multiplicador = 1; multiplicador <= 10; multiplicador ++) {
				
				int tabaudaCompleta = tabuada * multiplicador;
				
				System.out.println(tabuada + " x " + multiplicador + " = " + tabaudaCompleta);
			}
			
			System.out.println(" ");
		}
	}

}
