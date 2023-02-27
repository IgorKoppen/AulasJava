package br.com.banco;

public class Conta {
	private Cliente cliente;
	private long numeroConta;
	private double saldo;

	public Conta(Cliente cliente, int numeroConta, double saldo) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public boolean deposito(double valor) {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo = this.saldo + valor;
			return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}

	public void tranferir(double valor, Conta conta) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.deposito(valor);
		}
	}

	public boolean sacar(double valor) {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}

	public void exibirSaldo() {
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Saldo: " + this.saldo);
	}

}
