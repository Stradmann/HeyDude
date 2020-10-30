package view;

import java.util.Scanner;

import modules.Date;
import modules.User;
import utils.UtilsInputOutput;

public class CreateUserInterface {

	public static User CreateUser(Scanner read) {
		
		String name = UtilsInputOutput.askForName(read);
		String lastName = UtilsInputOutput.askForLastName(read);
		Date birthday = UtilsInputOutput.askForBirthday(read);
		
		return new User(name, lastName, birthday);
		
	}
}
