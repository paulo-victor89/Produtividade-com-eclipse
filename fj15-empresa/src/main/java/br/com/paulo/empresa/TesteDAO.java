package br.com.paulo.empresa;

import java.util.List;

import br.com.paulo.empresa.dao.GastoDAO;
import br.com.paulo.empresa.modelo.Gasto;

public class TesteDAO {
	public static void main(String[] args) {
		GastoDAO dao = new GastoDAO();
		List<Gasto> todos = dao.buscaTodos();
		
		for (Gasto gasto : todos) {
			System.out.println(gasto);
		}
	}

}
