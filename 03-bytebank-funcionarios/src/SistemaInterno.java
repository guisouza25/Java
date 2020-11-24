
public class SistemaInterno {

	public void autentica(Autenticavel a, int senha) {
		boolean autenticou = a.autentica(senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	}
	
}
