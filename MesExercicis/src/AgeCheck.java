import java.util.Scanner;

public class AgeCheck {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Your age:");
		int age = Integer.valueOf(read.nextLine());
		
		if (age >= 0 && age <= 120) {
			System.out.println("OK");
		}else {
			System.out.println("Impossible!");
		}
		
		read.close();
	}
}
