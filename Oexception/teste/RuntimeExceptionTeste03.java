package Oexception.teste;

public class RuntimeExceptionTeste03 {

	public static void main(String[] args) {

		abreConexao2();
	}
	
	private static String abreConexao() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			return "Conexão aberta";
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("Fechando recurso liberado pelo Sistema Op");
			
		}
		return null;
	}
	
	private static void abreConexao2() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Escrevendo dados no arquivo");
			// Obs: Só o try não é válido. Preciso do catch ou finally. try + finally = muito raro
			throw new RuntimeException();
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("Fechando recurso liberado pelo Sistema Op");
			
		}
		
	}

}
