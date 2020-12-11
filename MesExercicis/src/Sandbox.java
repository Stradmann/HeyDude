import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Sandbox {
	public static void main (String[] args) {
		Random random = new Random();
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(24);
		integers.add(56);
		integers.add(16);
		integers.add(32);
		Collections.sort(integers);
		for (int i = 0; i < integers.size(); i++) {
			System.out.print(integers.get(i) + ", ");
		}
		
		System.out.println("\n -------------------------------------");
		
		Integer[] enteros = new Integer[5];
		
		
		read.close();
		
		System.out.println("--------------------------------------");
		int secretnumber = random.nextInt(11);
		System.out.println(secretnumber);
	}
}
