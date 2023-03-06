package br.com.banco;

public class ContaCorrente extends Conta {

	double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);
		this.saldoInvestimento = 0.0;
	}

	public void investir(Produto produto, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
	}
	public void resgatar(double valor) {
		if(this.saldoInvestimento >= valor){
			this.saldoInvestimento -= valor;
			this.deposito(valor);
		}else{
			System.out.println("Saldo de investimento insuficiente");
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
