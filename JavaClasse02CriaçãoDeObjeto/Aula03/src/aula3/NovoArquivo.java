package aula3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class NovoArquivo {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("novoArquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner scan = new Scanner(System.in);
		
		String linha = scan.nextLine();
		bw.write(linha);
		
		bw.close();
		scan.close();

	}

}
