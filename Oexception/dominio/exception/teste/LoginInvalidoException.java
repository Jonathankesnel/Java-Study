package Oexception.dominio.exception.teste;

public class LoginInvalidoException extends Exception{
	
	public LoginInvalidoException() {
		super("Login Inválido!");
	}
	
	public LoginInvalidoException(String message) {
		super(message);
	}
}
