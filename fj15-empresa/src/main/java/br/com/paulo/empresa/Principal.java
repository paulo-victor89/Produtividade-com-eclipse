package br.com.paulo.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.paulo.empresa.modelo.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1985, 3, 18);//yyyy-mm-day
		Funcionario funcionario = new Funcionario("Jos�", 25, dataNascimento);
		System.out.println(funcionario);
		
	}
}
