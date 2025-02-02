package br.com.paulo.erp.exceptions;

import br.com.paulo.model.produto.Produto;

public class ProdutoForaDeEstoqueException extends RuntimeException {

	private static final long serialVersionUID = -6200914212377863370L;

	public ProdutoForaDeEstoqueException(Produto produto) {
		super("N�o h� estoque de: " + produto.getNome());
	}

}
