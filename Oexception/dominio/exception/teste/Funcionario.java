package Oexception.dominio.exception.teste;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

	public void salvar() throws LoginInvalidoException, ArithmeticException{
		System.out.println("Salvando Funcionário");
	}
}
