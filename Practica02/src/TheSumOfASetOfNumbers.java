import java.util.Scanner;

public class TheSumOfASetOfNumbers {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Until what?");
		int limit = Integer.valueOf(read.nextLine());
		int sum = 0;
		int i = 0;
		while (i <= limit) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		read.close();
	}
}
