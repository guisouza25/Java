
public class TesteConexao {

	public static void main(String[] args) {

		//aqui eu preciso fazer um tratamento pois quero obrigatoriamente 
		//que a conex�o sejafechada caso haja uma exception durante a 
		//transmiss�o de dados. try-with-resources
		
		
//		try (Conexao conexao = new Conexao()){
//			conexao.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		

		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro na conex�o");
		} finally {
			if(con != null) {
				con.close();
			}
		}
		
		
		
		
	}

}
