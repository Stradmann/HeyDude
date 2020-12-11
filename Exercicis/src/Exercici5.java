import java.util.Scanner;

public class Exercici5 {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Write your message:");
		String message = reader.nextLine();
		
		System.out.println(message);
		
		reader.close();
	}
}
