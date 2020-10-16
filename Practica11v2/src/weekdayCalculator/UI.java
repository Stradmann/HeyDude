package weekdayCalculator;

import java.util.Scanner;

public class UI {
	
	public static void startUI(Scanner read) {
		System.out.println(showWeekday(requestDate(read)));
	}
	
	public static Date requestDate(Scanner read) {
				
		boolean dateIsValid;
		Date date;
		
		do {
			System.out.println("Introduce a day post 01,01,1978 in dd,mm,YYYY format");
			String completeDate = read.nextLine();
			date = new Date(completeDate);
			dateIsValid = Operator.validDate(date);
		}while(!dateIsValid);
			return date;
	}
	
	public static String showWeekday(Date date) {
		return Operator.getWeekday(date);
	}
}
