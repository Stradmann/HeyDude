package controller;

import java.util.Scanner;

import Utilities.UtilsMenu;
import databases.PersonDB;
import modules.Directive;

public class CreateDirective {
	
	public static void addDirective(Scanner read, PersonDB persondb) {
		
		String firstName = UtilsMenu.askForFirstName(read);
		String lastName = UtilsMenu.askForLastName(read);
		
		Directive newDirective = new Directive (firstName, lastName);
		persondb.addPerson(newDirective);
		
		System.out.println("Congratulations! You have been regitered as Directive");
		System.out.println("Your username is: " + newDirective.getUsername() + ", and your password is: " + newDirective.getPassword());
	}
}
