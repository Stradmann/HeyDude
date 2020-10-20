package controller;

import java.util.Scanner;

import Utilities.UtilsMenu;
import menu.RegistryOptions;
import databases.PersonDB;

public class Registry {

	public static void registryProces(Scanner read) {
		
		RegistryOptions registryOps = new RegistryOptions();
		PersonDB usersDataBase = new PersonDB();
		
		boolean exitMenu = false;
		
		while (!exitMenu) {
			
			registryOps.showRegistryOptions();
			
			String command = UtilsMenu.readInput(read);
			
			try {
				registryOps.getOption(command);
			}catch(Exception e) {
				System.out.println("Unknown command");
			}
			
			switch(command) {
			
			case "Cancel":
				exitMenu = true;
				break;
				
			case "Student":
				CreateStudent.addStudent(read, usersDataBase);
				break;
				
			case "Directive":
				break;
			}
		}
	}
}
