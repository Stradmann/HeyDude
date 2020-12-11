import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("From what?");
		int lower = Integer.valueOf(read.nextLine());
		System.out.println("Until what?");
		int upper = Integer.valueOf(read.nextLine());
		int sum = 0;
		
		while (lower <= upper) {
			sum += lower;
			lower++;
		}
		System.out.println(sum);
		read.close();
	}
}
