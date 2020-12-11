import java.util.Scanner;

public class Exercici15 {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Give a string:");
		String text = reader.nextLine();
		
		System.out.println("Give a integer:");
		int number = reader.nextInt();
		
		System.out.println("Give a double:");
		double floatNumber = reader.nextDouble();
		
		System.out.println("Give a boolean");
		boolean bool = reader.nextBoolean();
		
		System.out.println("You gave the string " + text);
		System.out.println("You gave the integer " + number);
		System.out.println("You gave the double " + floatNumber);
		System.out.println("You gave the boolean " + bool);
		
		reader.close();
	}
}
