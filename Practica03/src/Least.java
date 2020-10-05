import java.util.Scanner;

public class Least {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int first = Integer.valueOf(read.nextLine());
		System.out.println("Give the second number:");
		int second = Integer.valueOf(read.nextLine());
		
		System.out.println("Least: " + least(first, second));
		
		read.close();
	}
	
	public static int least (int number1, int number2) {
		if (number1 <= number2) {
			return number1;
		}else {
			return number2;
		}
	}
}
