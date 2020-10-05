import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give a word:");
		String word = read.nextLine();
		
		if (isPalindrome(word)) {
			System.out.println("The text is a palindrome!");
		}else {
			System.out.println("The text is not a palindrome!");
		}
		
		read.close();
		
	}
	
	public static String reverseWord(String word) {
		
		String reversed = "";
		for(int i = word.length()-1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}
		return reversed;
	}
	
	public static boolean isPalindrome (String word) {
		
		String reversedWord = reverseWord(word);
		if (word.equals(reversedWord)) {
			return true;
		}else {
			return false;
		}
	}
}
