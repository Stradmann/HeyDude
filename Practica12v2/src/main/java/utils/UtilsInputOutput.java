package utils;


import java.util.Scanner;

import modules.Date;

public class UtilsInputOutput {

	public static String askForName(Scanner read) {
		
		System.out.println("Whats your name?");
		return read.nextLine();
	}
	
	public static String askForLastName(Scanner read) {
		
		System.out.println("Whats your last name?");
		return read.nextLine();
	}
	
	public static Date askForBirthday(Scanner read) {
		
		System.out.println("what's your day of birth? (dd,mm,YYYY format)");
		String completeDate = read.nextLine();
		return UtilsString.convertStringToDate(completeDate);
	}
}
