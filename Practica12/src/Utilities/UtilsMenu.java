package Utilities;

import java.util.Scanner;

import modules.Date;

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
	
	public static String askForUsername(Scanner read) {
		
		System.out.println("Type your username:");
		return readInput(read);
	}
	
	public static String askForPassword(Scanner read) {
		
		System.out.println("Type your password:");
		return readInput(read);
	}
	
	public static Date askForBirthday(Scanner read) {
		
		System.out.println("Type yor birthday in dd,mm,YYYY format:");
		Date date = DateUtils.createDate(readInput(read));
		return date;
	}
}
