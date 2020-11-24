
public class TesteSistema {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSenha(2222);
		g1.setNome("Carlos");
		
		Administrador adm1 = new Administrador();
		adm1.setSenha(2223);
		
		Cliente c1 = new Cliente();
		c1.setSenha(1234);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(g1, 2222);
		sistema.autentica(adm1, 2223);
		sistema.autentica(c1, 1234);
		
		
	}
}
