package Oexception.teste;

import java.util.Scanner;

import Oexception.dominio.exception.teste.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			logar();
		}catch(LoginInvalidoException e) {
			e.printStackTrace();
		}

	}
	
	private static void logar() throws LoginInvalidoException {
		Scanner teclado = new Scanner(System.in);
		String username = "Goku";
		String senha = "ssj";
		System.out.println("Usuário: ");
		String usernameDigitado = teclado.nextLine();
		System.out.println("Senha: ");
		String senhaDigitada = teclado.nextLine();
		if(!username.equals(usernameDigitado) || !senha.equals(senhaDigitada)) {
			throw new LoginInvalidoException("Usuário ou senha inválidos");
		}
		
		System.out.println("Usuário logado com sucesso");
	}

}
