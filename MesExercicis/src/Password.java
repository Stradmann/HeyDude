import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String password = "carrot";
		String secret = "Strugen!!";
				
		while(true) {
			
			System.out.println("Password:");
			String inputPassword = read.nextLine();
			
			if (inputPassword.equals(password)) {
				System.out.println("Right! \n The secret message is: " + secret);
				break;
			}else {
				System.out.println("Wrong :(");
			}
		}
		read.close();
	}
}
