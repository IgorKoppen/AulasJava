import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.LinkedList;
public class Executavel {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		long inicio = System.currentTimeMillis();
		System.out.println("Inicio: " + inicio);
		for (int i = 0; i <= 5000000; i++) {
			hashSet.add(r.nextInt(10000));
		}
		long fim = System.currentTimeMillis();
		System.out.println("Fim: " + fim);
		System.out.println(fim - inicio);
	}

}
