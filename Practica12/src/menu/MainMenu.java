package menu;

import java.util.Scanner;

import Utilities.UtilsMenu;
import databases.PersonDB;

public class MainMenu {
	
	public static void mainMenu(Scanner read, PersonDB usersDB) {
		
		OptionsMainMenu mainMenu = new OptionsMainMenu();
		
		boolean exitMenu = false;
		while (!exitMenu) {
			
			mainMenu.showMainMenu();
			
			String command = UtilsMenu.readInput(read);
			
			try {
				mainMenu.getOption(command);
			}catch(Exception e){
				System.out.println("Unknown command");
			}
			
			switch(command) {
			
			case "Quit":
				exitMenu = true;
				break;
				
			case "Register":
				Registry.registryProces(read, usersDB);
				break;
				
			case "Login":
				Login.loginProces(read, usersDB);
				break;
			}
		}
		
	}
}
