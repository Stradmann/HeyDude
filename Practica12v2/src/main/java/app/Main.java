package app;

import com.mongodb.client.MongoDatabase;

import controller.Controller;
import dao.UserDAO;

public class Main {

	public static void main(String[] args) {
		
		MongoDatabase uniUsersDatabase = Controller.init();
		
		UserDAO userDAO = Controller.setSource(uniUsersDatabase);
	}
}
