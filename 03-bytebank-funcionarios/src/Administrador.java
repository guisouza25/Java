
public class Administrador extends Funcionario implements Autenticavel {

	private ImplantacaoAutenticavel autenticador;

	public Administrador() {
		this.autenticador = new ImplantacaoAutenticavel();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public int getSenha() {
		return this.autenticador.getSenha();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		return 300;
	}

}
