package br.com.banco;

public class Executavel {

	public static void main(String[] args) {
		Cliente client1 = new Cliente("Pedro", "RuaDasPerolas,127", "08/10/2002");
		Conta conta1 = new Conta(client1, 001, 1500.50);
		Cliente client2 = new Cliente("Enrico", "RuaSalvador,147", "08/10/2000");
		Conta conta2 = new Conta(client2, 002, 1500.50);

		conta1.exibirSaldo();
		conta2.exibirSaldo();
		conta1.deposito(500);

		conta1.tranferir(1500, conta2);

		conta1.exibirSaldo();
		conta2.exibirSaldo();
	}

}
