package weekdayCalculator;

public class Operator {
	
	public static boolean validDate(Date date) {
		if (checkYear(date.getYear()) && checkMonth(date.getMonth()) && checkDay(date.getYear(), date.getMonth(), date.getDay())) {
			return true;
		}
		return false;
	}
	
	public static boolean checkYear(int year) {
		if(year >= 1978) {
			return true;
		}
		return false;
	}
	
	public static boolean checkMonth(int month) {
		if (month > 0 && month <= 12) {
			return true;
		}
		return false;
	}
	
	public static boolean checkDay(int year, int month, int day) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day >= 1 && day <= 31) {
				return true;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day >=1 && day <=30) {
				return true;
			}
		}if (month == 2) {
			if (isLeapYear(year) && day >= 1 && day <= 29) {
				return true;
			}else if (!isLeapYear(year) && day >= 1 && day <= 1) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 100 == 0 && year % 400 == 0) {
			return true;
		}else if (year % 4 == 0 && !(year % 100 == 0)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int daysAmount (Date date) {
		return entireYearsCount(date.getYear()) + entireMonthsCount(date.getYear(), date.getMonth()) + daysCount(date.getDay());
	}
	
	public static int entireYearsCount(int year) {
		int days = 0;
		for (int i = 1978; i < year; i++) {
			if (isLeapYear(i)) {
				days += 366;
			}else {
				days += 365;
			}
		}
		return days;
	}
	
	public static int entireMonthsCount(int year, int month) {
		int days = 0;
		for (int i = 1; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				days += 31;
			}else if (i == 4 || i == 6 || i == 9 || i == 11){
				days += 30;
			}else if (i == 2 && isLeapYear(year)) {
				days += 29;
			}else if (i == 2 && !isLeapYear(year)) {
				days += 28;
			}
		}
		return days;
	}
	
	public static int daysCount(int day) {
		int days = day;
		return days;
	}
	
	public static String getWeekday(Date date) {
		int daysAmount = daysAmount(date);
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
		
		return date + " was " + weekDay;
	}
}
