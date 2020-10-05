import java.util.Scanner;

public class TheLenghtOfAName {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Give a name:");
		String name = read.nextLine();
		System.out.println("Number of characters: " + calculateCharacters(name));
		read.close();
	}
	
	public static int calculateCharacters(String text) {
		int length = text.length();
		return length;
	}
}
