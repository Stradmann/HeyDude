import java.util.Scanner;

public class Exercici22 {

public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int firstNum = Integer.parseInt(reader.nextLine());
		System.out.println("Give the second number:");
		int secondNum = Integer.parseInt(reader.nextLine());
		System.out.println("Give the third number:");
		int thirdNum = Integer.parseInt(reader.nextLine());
		System.out.println("The average is: " + ((float)(firstNum+secondNum+thirdNum)/3));
		
		reader.close();
	}
}
