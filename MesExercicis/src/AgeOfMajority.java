import java.util.Scanner;

public class AgeOfMajority {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = Integer.valueOf(read.nextLine());
		
		if (age >= 18) {
			System.out.println("You have reached the age of majority!");
		}else {
			System.out.println("You have not reached the age of majority yet!");
		}
		
		read.close();
	}
}
