package controller;

import java.util.Scanner;

import Utilities.UtilsMenu;
import modules.Student;
import databases.PersonDB;

public class CreateStudent {
	
	public static void addStudent(Scanner read, PersonDB persondb) {
		
		String firstName = UtilsMenu.askForFirstName(read);
		String lastName = UtilsMenu.askForLastName(read);
		
		Student newStudent = new Student (firstName, lastName);
		persondb.addPerson(newStudent);
		
	}
}
