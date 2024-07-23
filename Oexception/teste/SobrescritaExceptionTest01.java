package Oexception.teste;

import java.io.FileNotFoundException;

import Oexception.dominio.exception.teste.Funcionario;
import Oexception.dominio.exception.teste.LoginInvalidoException;
import Oexception.dominio.exception.teste.Pessoa;

public class SobrescritaExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		try {
				funcionario.salvar();
		} catch (LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
