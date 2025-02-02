package br.com.paulo.empresa.leitor;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.Collection;

import org.junit.Test;

import br.com.paulo.empresa.modelo.Gasto;

public class ImportadorDeGastosTest {

	@Test
	public void deveRetornarUmaListaVaziaSeOArquivoPassadoForVazio() throws ParseException {
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);
		
		assertTrue("A lista n�o est� vazia!", gastos.isEmpty());
	}
	@Test
	public void deveRetornarUmGastoDeUmArquivoNoFormatoCorreto() throws ParseException {
		
		
		String conteudo = "CARTAO01012011010151542011000010000123 ajsdjajsdjajsd             22071983\r\n";
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());
		
		
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);
		
		assertEquals("Deveria conter um elemento!", 1, gastos.size());
	}

}
