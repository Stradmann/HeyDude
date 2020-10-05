import java.util.Scanner;

public class ReversingAName {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	
		System.out.println("Give a name:");
		String name = read.nextLine();
		for (int i = (name.length()-1); i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		read.close();
	}
}
