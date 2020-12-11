import java.util.Scanner;

public class LeapYear {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
	
		System.out.println("Tell me the year:");
		int year = Integer.valueOf(read.nextLine());
		
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("Is a Leap Year");
		}else if (year % 4 == 0 && !(year % 100 == 0)) {
			System.out.println("Is a Leap Year");
		}else {
			System.out.println("Is not a Leap Year");
		}
		
		read.close();
	}
}
