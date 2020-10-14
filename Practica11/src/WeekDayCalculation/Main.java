package WeekDayCalculation;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		boolean validDate = false;
		
		while (!validDate)
		System.out.println("Introduce a day post 01,01,1978 in dd,mm,YYYY format");
		String completeDate = read.nextLine();
		Date dateToCheck = new Date(completeDate);
	}
}
