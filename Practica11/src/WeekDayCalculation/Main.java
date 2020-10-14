package WeekDayCalculation;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		boolean validDate = false;
		Date dateToCheck = null;
		
		while (!validDate) {
			System.out.println("Introduce a day post 01,01,1978 in dd,mm,YYYY format");
			String completeDate = read.nextLine();
			dateToCheck = new Date(completeDate);
			validDate = dateToCheck.dateIsValid();
		}
		
		int daysAmount = dateToCheck.daysAmount();
		int weekDayCode = daysAmount % 7;
		String weekDay = "";
		
		switch(weekDayCode) {
		case 0:
			weekDay = "Saturday, Day of Saturn";
			break;
		case 1:
			weekDay = "Sunday, Day of Sun";
			break;
		case 2:
			weekDay = "Monday, Day of Moon";
			break;
		case 3:
			weekDay = "Tuesday, Day of Mars";
			break;
		case 4:
			weekDay = "Wednesday, Day of Mercury";
			break;
		case 5:
			weekDay = "Thursday, Day of Jupiter";
			break;
		case 6:
			weekDay = "Friday, Day of Venus";
			break;
		}
		
		System.out.println(dateToCheck + " was " + weekDay);
		read.close();
	}
	
}
