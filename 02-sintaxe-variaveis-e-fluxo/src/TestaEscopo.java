
public class TestaEscopo {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 2;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		//se declarar dentro do if ela existe apenas no if
		//essas vari�veis dentro do main s�o locais, e n�o tem valor padr�o
		//portanto, sempre precisa inicializar(declarar) a vari�vel para poder utilizar
		//se remover o else a vari�vel deixa de inicializar
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente vo�� n�o pode entrar");
		}
	}
}
		
	