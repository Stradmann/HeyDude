package menu;

import java.util.Scanner;

import Utilities.UtilsMenu;
import controller.CreateDirective;
import controller.CreateStudent;
import databases.PersonDB;

public class Registry {

	public static void registryProces(Scanner read, PersonDB usersDB) {
		
		RegistryOptions registryOps = new RegistryOptions();
		
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
				CreateStudent.addStudent(read, usersDB);
				exitMenu = true;
				break;
				
			case "Directive":
				CreateDirective.addDirective(read, usersDB);
				exitMenu = true;
				break;
			}
		}
	}
}
