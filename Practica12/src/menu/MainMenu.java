package menu;

import java.util.Scanner;

import Utilities.UtilsMenu;
import controller.Registry;

public class MainMenu {
	
	public static void mainMenu(Scanner read) {
		
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
				Registry.registryProces(read);
				break;
				
			case "Login":
				System.out.println("acces to login options");
				break;
			}
		}
		
	}
}
