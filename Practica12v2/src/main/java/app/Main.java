package app;

import java.util.Scanner;

import com.mongodb.client.MongoDatabase;

import controller.Controller;
import controller.MenuController;
import dao.UserDAO;
import view.MainMenu;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		MongoDatabase uniUsersDatabase = Controller.init();
		
		UserDAO userDAO = Controller.setSource(uniUsersDatabase);
		
		MenuController menuController = new MenuController();
		MainMenu.mainMenu(menuController, "Main Menu", read, userDAO);
	}
}
