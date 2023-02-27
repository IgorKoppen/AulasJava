package br.com.banco;

public class Executavel {

	public static void main(String[] args) {
		Cliente client1 = new Cliente("Pedro", "RuaDasPerolas,127", "08/10/2002");
		ContaCorrente conta1 = new ContaCorrente(client1, 0011);
		Cliente client2 = new Cliente("Enrico", "RuaSalvador,147", "08/10/2000");
		ContaCorrente conta2 = new ContaCorrente(client2, 2);
/*
		conta1.exibirSaldo();
		conta2.exibirSaldo();
		conta1.deposito(500);

		conta1.tranferir(1500, conta2);

		conta1.exibirSaldo();
		conta2.exibirSaldo();
		*/
		conta2.deposito(1000);
		conta2.exibirSaldo();
		conta2.investir(100, 3);
		conta2.exibirSaldo();
	}

}
