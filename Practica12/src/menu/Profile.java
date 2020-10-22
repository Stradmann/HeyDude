package menu;

import java.util.Scanner;

import Utilities.UtilsMenu;
import modules.Person;

public class Profile {
	
	public static void profileMenu(Scanner read, Person user) {
		
		ProfileOptions options = new ProfileOptions();
		
		boolean exitMenu = false;
		
		while(!exitMenu) {
			
			options.showProfileOptions();
			
			String command = UtilsMenu.readInput(read);
			
			try {
				options.getOption(command);
			}catch(Exception e) {
				System.out.println("Unknown command");
			}
			
			switch(command) {
			
			case "Name":
				user.setFirstName(UtilsMenu.askForFirstName(read));
				break;
				
			case "Last Name":
				user.setLastName(UtilsMenu.askForLastName(read));
				break;
				
			case "Birthday":
				user.setBirthday(UtilsMenu.askForBirthday(read));
				break;
				
			case "Username":
				user.setUsername(UtilsMenu.askForUsername(read));
				break;
				
			case "Password":
				user.setPassword(UtilsMenu.askForPassword(read));
				break;
				
			case "Print":
				user.printProfile();
				break;
				
			case "Done":
				exitMenu = true;
				break;
			}
		}
	}
}
