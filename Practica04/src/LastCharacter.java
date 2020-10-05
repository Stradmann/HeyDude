import java.util.Scanner;

public class LastCharacter {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Give a name:");
		String name = read.nextLine();
		System.out.println("Last character: " + lastCharacter(name));
		read.close();
	}
	
	public static char lastCharacter(String text) {
		char last = text.charAt(text.length()-1);
		return last;
	}
}
