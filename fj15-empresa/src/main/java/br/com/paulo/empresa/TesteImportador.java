package br.com.paulo.empresa;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Collection;

import br.com.paulo.empresa.leitor.ImportadorDeGastos;
import br.com.paulo.empresa.modelo.Gasto;

public class TesteImportador {

	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		String conteudo = "CARTAO01012011000010000123 Jose da Silva                22071983\r\n"
				+ "CARTAO01012011000010000123 Jose da Silva               22071983\r\n"
				+ "CARTAO01012011000010000123 Jose da Silva                22071983\r\n";

		ImportadorDeGastos importador = new ImportadorDeGastos();

		Collection<Gasto> list = importador.importa(new ByteArrayInputStream(conteudo.getBytes("UTF-8")));

		for (Gasto gasto : list) {
			System.out.println(gasto.getTipo());
			System.out.println(gasto.getValor());
			System.out.println(gasto.getFuncionario().getNome().trim());
			System.out.println();
		}
	}

}
