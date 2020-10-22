package menu;

import java.util.Scanner;

import Utilities.UtilsMenu;
import databases.PersonDB;
import modules.Person;

public class Login {
	
	public static void loginProces(Scanner read, PersonDB usersDB) {
		
		boolean exitLogin = false;
		while(!exitLogin) {
			String username = UtilsMenu.askForUsername(read);
			Person user = usersDB.findByUsername(username);
			if (user == null) {
				System.out.println("This user is not registered");
				continue;
			}
			String password = UtilsMenu.askForPassword(read);
			if (!user.getPassword().equals(password)) {
				System.out.println("Incorrect password. Try to login again");
				continue;
			}else {
				System.out.println("You succesfully log in");
				LogedMainMenu.logedMainMenu(read, user);
				break;
			}
		}
	}
}
