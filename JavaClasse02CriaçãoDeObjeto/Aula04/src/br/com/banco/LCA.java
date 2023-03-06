package br.com.banco;

public class LCA implements Produto{

	@Override
	public double investir(double valor) {
		return valor * 1.02;
	}

}
