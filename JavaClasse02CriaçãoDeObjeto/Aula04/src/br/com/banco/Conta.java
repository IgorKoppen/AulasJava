package br.com.banco;

public abstract class Conta {
	//Abstract na class proibe instancia da class main
	protected final Cliente cliente;
	protected final long numeroConta;
	protected double saldo;
	private static long contador;

	public static void exibirContator(){
		System.out.println("Contas: " + contador);
	}
	
	public Conta(Cliente cliente, int numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		contador++;
	}
	
	public boolean deposito(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
			return true;
		}
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

	
	public abstract void exibirSaldo();
		

}
