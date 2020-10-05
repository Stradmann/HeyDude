import java.util.Scanner;

public class FirstCharacter {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Give a name:");
		String name = read.nextLine();
		System.out.println("First character: " + firstCharacter(name));
		read.close();
	}
	
	public static char firstCharacter(String text) {
		char first = text.charAt(0);
		return first;
	}
}
