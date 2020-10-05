import java.util.Scanner;

public class SeparatingCharacters {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give a name:");
		String name = read.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println( (i+1) + ". character: " + name.charAt(i));			
		}
		read.close();
	}
}
