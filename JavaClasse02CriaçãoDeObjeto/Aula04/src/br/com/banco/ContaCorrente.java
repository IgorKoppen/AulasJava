package br.com.banco;

public class ContaCorrente extends Conta {

	double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);
		this.saldoInvestimento = 0.0;
	}

	public void investir(double valor, int tipo) {
		boolean teste = this.sacar(valor);
		if (teste) {
			switch (tipo) {
			case 1:
				this.saldoInvestimento += valor * 1.01;
				break;
			case 2:
				this.saldoInvestimento += valor * 1.05;
				break;
			default:
				this.saldoInvestimento += valor * 1.1;
				break;
			}
		}
	}

	@Override
	public void exibirSaldo() {
	   double saldoTotal = this.saldo + this.saldoInvestimento;
	   System.out.println("Cliente: " + this.cliente.getNome());
	   System.out.println("Saldo: " + this.saldo);
	   System.out.println("Saldo investimento: " + this.saldoInvestimento);
	   System.out.println("Saldo total: " + saldoTotal);
	   
		
	}
}
