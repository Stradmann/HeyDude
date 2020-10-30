package view;

import java.util.Scanner;

import controller.Controller;
import controller.MenuController;
import dao.UserDAO;
import modules.User;

public class MainMenu {

	public static void mainMenu(MenuController menuController, String selectedMenu, Scanner read, UserDAO userDAO) {
		
		boolean exitMenu = false;
		
		while(!exitMenu) {
			
			menuController.showMenu(selectedMenu);
			String command = read.nextLine();
			
			try {
				menuController.getOption(selectedMenu, command);
			}catch(Exception e) {
				System.out.println("Unknown command");
			}
			
			switch(command) {
			
			case "Quit":
				exitMenu = true;
				break;
				
			case "Register":
				User user = CreateUserInterface.CreateUser(read);
				Controller.add(userDAO, user);
				
				break;
				
			case "Login":
				break;
			}
		}
	}
}
