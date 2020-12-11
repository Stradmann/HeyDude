import java.util.Scanner;

public class Usernames {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		String username1 = "Alex";
		String username2 = "Emily";
		String password1 = "mightyducks";
		String password2 = "cat";
		
		System.out.println("Username:");
		String inputUsername = read.nextLine();
		System.out.println("Password:");
		String inputPassword = read.nextLine();
		
		boolean isCorrectLogin = (inputUsername.equals(username1) && inputPassword.equals(password1)) ||
				(inputUsername.equals(username2) && inputPassword.equals(password2));
		
		if (isCorrectLogin) {
			System.out.println("You are now logged into the system!");
		}else {
			System.out.println("Your username or password was invalid!");
		}
		
		read.close();
	}
}
