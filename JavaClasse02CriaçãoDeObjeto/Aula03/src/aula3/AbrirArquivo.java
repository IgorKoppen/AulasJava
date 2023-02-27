package aula3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class AbrirArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("novoArquivo.txt");
				Scanner scan = new Scanner(is);
				
				while (scan.hasNextLine()){
					System.out.println(scan.nextLine());
				}
				is.close();
				scan.close();
	}

}
