package Utilities;

import java.util.Scanner;

public class UtilsMenu {
	
	public static String readInput(Scanner read) {
		
		return read.nextLine();
	}
	
	public static String askForFirstName(Scanner read) {
		
		System.out.println("What's your first name?");
		return readInput(read);
	}
	
	public static String askForLastName(Scanner read) {
		
		System.out.println("What's your last name?");
		return readInput(read);
	}
}
