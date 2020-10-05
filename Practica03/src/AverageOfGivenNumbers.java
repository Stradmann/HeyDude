import java.util.Scanner;

public class AverageOfGivenNumbers {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Give the first number:");
		int first = Integer.valueOf(read.nextLine());
		System.out.println("Give the second number:");
		int second = Integer.valueOf(read.nextLine());
		System.out.println("Give the third number:");
		int third = Integer.valueOf(read.nextLine());
		System.out.println("Give the fourth number");
		int fourth = Integer.valueOf(read.nextLine());
		
		System.out.println("Average: " + average(first, second, third, fourth));
		
		read.close();
	}
	
	public static double average(int number1, int number2, int number3, int number4) {
		return (double)sum(number1, number2, number3, number4) / 4;
	}
	
	public static int sum(int number1, int number2, int number3, int number4) {
		return number1 + number2 + number3 + number4;
	}
}
