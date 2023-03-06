package br.com.banco;

import java.text.ParseException;

public class Executavel {

	public static void main(String[] args) {
		try {
			CDB cdb = new CDB();
			LCI lci = new LCI();
			Fundos fundos = new Fundos();
			Cliente client1;
			Cliente client = new Cliente("Pedro", "RuaDasPerolas,127","08/10/2002");
			ContaCorrente conta1 = new ContaCorrente(client, 0011);
			Cliente client2 = new Cliente("Enrico", "RuaSalvador,147","08/10/2000");
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
					conta2.resgatar(1000);
				    conta2.investir(lci, 1000);
				    conta2.exibirSaldo();
				    conta2.resgatar(1000);
					conta2.exibirSaldo();
					Conta.exibirContator();
					
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
