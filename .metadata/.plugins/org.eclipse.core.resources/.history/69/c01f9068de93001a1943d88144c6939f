package br.com.paulo.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.paulo.empresa.modelo.Funcionario;
import br.com.paulo.empresa.modelo.Gasto;

public class TestaGasto {
	
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1989, 3, 14);//yyy mm day
		Funcionario funcionario = new Funcionario("Vinicius", 9, dataNascimento);
		Calendar hoje = Calendar.getInstance();// retorna o dia e hora atual
		
		Gasto gasto1 = new Gasto(40, "Taxi", funcionario, hoje);
		Gasto gasto2 = new Gasto(20, "Comida", funcionario, hoje);
		Gasto gasto3 = new Gasto(10, "Padaria", funcionario, hoje);
		
		System.out.println(gasto1);
		System.out.println(gasto2);
		System.out.println(gasto3);
	}

}
