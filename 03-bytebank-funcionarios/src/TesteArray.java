
public class TesteArray {

	public static void main(String[] args) {
		
		Funcionario[] referencias = new Funcionario[5];

		referencias[0] = new Designer();
		referencias[1] = new Gerente();

		Gerente ref = (Gerente) referencias[1];
		System.out.println(ref);
	}

}
