import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	
		System.out.println("Give a number:");
		int number = Integer.valueOf(read.nextLine());
		
		if (number % 2 == 0) {
			System.out.println("Number " + number + " is even");
		}else {
			System.out.println("Number " + number + " is odd");
		}
		
		read.close();
	}
	
}
