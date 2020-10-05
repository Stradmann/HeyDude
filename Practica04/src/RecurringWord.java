import java.util.Scanner;
import java.util.ArrayList;

public class RecurringWord {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		while(true) {
			System.out.println("Type a word:");
			String wordToCheck = read.nextLine();
			if (!words.contains(wordToCheck)) {
				words.add(wordToCheck);
			}else {
				System.out.println("You gave the word " + wordToCheck + " twice");
				break;
			}
		}
		read.close();
		
	}
}
