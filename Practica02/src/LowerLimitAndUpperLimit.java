import java.util.Scanner;

public class LowerLimitAndUpperLimit {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Give the first number:");
		int lower = Integer.valueOf(read.nextLine());
		System.out.println("Give the second number:");
		int upper = Integer.valueOf(read.nextLine());
		
		while (lower <= upper) {
			System.out.print(lower + " ");
			lower++;
		}
		read.close();
	}
}
