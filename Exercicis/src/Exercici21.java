import java.util.Scanner;

public class Exercici21 {
	
public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int firstNum = Integer.parseInt(reader.nextLine());
		System.out.println("Give the second number:");
		int secondNum = Integer.parseInt(reader.nextLine());
		System.out.println("The average is: " + ((float)(firstNum+secondNum)/2));
		
		reader.close();
	}

}
