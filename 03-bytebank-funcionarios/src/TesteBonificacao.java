
public class TesteBonificacao {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		g1.setSenha(2222);
		
		Designer d1 = new Designer();
		d1.setSalario(3000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2000);
		
		System.out.println("Gerente: " + g1.getBonificacao());
		System.out.println("Designer: " + d1.getBonificacao());
		System.out.println("EditorVideo: " + ev1.getBonificacao());
		
		ControleBonificacao controle1 = new ControleBonificacao();
		controle1.registra(g1);
		controle1.registra(d1);
		controle1.registra(ev1);
		
		System.out.println(controle1.getSoma());
	}

}
