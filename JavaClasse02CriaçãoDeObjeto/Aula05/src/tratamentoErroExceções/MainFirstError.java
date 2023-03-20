package tratamentoErroExceções;

public class MainFirstError {

	public static void main(String[] args) {

		int v1 = 1, v2 = 0, res = 0;
		char lista[] = { 1, 2, 3 };

		for (int i = 0; i < lista.length; i++) {
			try {
				if (i == 0) {
					res = v1 / v2;
				} else
					lista[3] = 4;
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Execeção: " + e);
			}
			System.out.println("i = " + i);
			System.out.println("res = " + res);
		}

	}

}
