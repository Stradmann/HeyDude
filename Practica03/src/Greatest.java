import java.util.Scanner;

public class Greatest {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int first = Integer.valueOf(read.nextLine());
		System.out.println("Give the second number:");
		int second = Integer.valueOf(read.nextLine());
		System.out.println("Give the third number:");
		int third = Integer.valueOf(read.nextLine());
		
		System.out.println("Greatest: " + least(first, second, third));
		
		read.close();
	}
	
	public static int least (int number1, int number2, int number3) {
		if (number1 >= number2 && number1 >= number3) {
			return number1;
		}else if (number2 >= number3) {
			return number2;
		}else {
			return number3;
		}
	}
}
