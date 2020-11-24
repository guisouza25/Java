
public class TestaConta {

	public static void main(String[] args) {
		Conta c = new Conta();
	
			try {
				c.deposita();
			} catch (MyException e) {
				e.printStackTrace();
			}
		
		
		System.out.println("Fim");
	}

}
