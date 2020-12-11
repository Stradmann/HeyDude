import java.util.Scanner;

public class UpToACertainNumber {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Give the max number:");
		int maxNumber = Integer.valueOf(read.nextLine());
		int i = 0;
		while(i < maxNumber) {
			i++;
			System.out.print(i + " ");
		}
		read.close();
	}
}
