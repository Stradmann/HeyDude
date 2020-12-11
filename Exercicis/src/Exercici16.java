import java.util.Scanner;

public class Exercici16 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many days would you like to convert to seconds?");
		int numOfDays = Integer.valueOf(reader.nextLine());
		System.out.println(CountingSecondsInDays(numOfDays));
		
		reader.close();
	}
	
	public static int CountingSecondsInDays(int numDays) {
		
		return numDays * 24 * 60 * 60;
	}
}
