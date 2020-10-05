import java.util.Scanner;

public class SeparatingFirstCharacters {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give a name:");
		String name = read.nextLine();
		
		if (name.length() >= 3) {
			for (int i = 0; i < 3; i++) {
				System.out.println( (i+1) + ". character: " + name.charAt(i));
			}
			
		}
		read.close();
	}
}
