package br.com.paulo.erp;

import br.com.paulo.model.comercial.Cliente;

public class Pagamento {

	private Cliente cliente;
	private FormaDePagamento forma;
	private double valor;

	public Pagamento(Cliente cliente, FormaDePagamento forma, double valor) {
		this.cliente = cliente;
		this.forma = forma;
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public FormaDePagamento getForma() {
		return forma;
	}
	
	public double getValor() {
		return valor;
	}
}
