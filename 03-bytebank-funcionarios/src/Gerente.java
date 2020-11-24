
public class Gerente extends Funcionario implements Autenticavel {

	private ImplantacaoAutenticavel autenticador;

	public Gerente() {
		this.autenticador = new ImplantacaoAutenticavel();
	}
	
	@Override
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
		return super.getSalario();
	}

	

	


}
