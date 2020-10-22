package menu;

import java.util.Scanner;

import Utilities.UtilsMenu;
import modules.Person;


public class LogedMainMenu {
	
	public static void logedMainMenu(Scanner read, Person user) {
		
		LogedOptions options = new LogedOptions();
		
		boolean exitMenu = false;
		
		while(!exitMenu) {
			
			options.showLogedMainMenu();
			
			String command = UtilsMenu.readInput(read);
			
			try {
				options.getOption(command);
			}catch(Exception e){
				System.out.println("Unknown command");
			}
			
			switch(command) {
			
			case "Logout":
				exitMenu = true;
				break;
				
			case "Profile":
				user.editProfile(read, user);
				break;
				
			case "Studies":
				break;
				
			case "Accommodation":
				break;
				
			case "Leisure":
				break;
				
			case "WalesCard":
				break;
				
			case "Bar-Restaurant":
				break;
			}
		}
	}
}
