package WeekDayCalculation;


public class Date {
	
	private int day;
	private int month;
	private int year;
	
	//CONSTRUCTOR
	public Date (String completeDate) {
		
		String[] date = completeDate.split(",");
		this.day = Integer.valueOf(date[0]);
		this.month = Integer.valueOf(date[1]);
		this.year = Integer.valueOf(date[2]);
	}
	
	//METHODS
	public boolean dateIsValid() {
		
	}
	
	public boolean checkYear(int year) {
		if(year >= 1978) {
			return true;
		}
		return false;
	}
	
	public boolean checkMonth(int month) {
		if (month > 0 && month <= 12) {
			return true;
		}
		return false;
	}
	
	public boolean checkDay(int year, int month, int day) {
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
			
		}
	}
	
	public boolean isLeapYear(int year) {
		if (year % 100 == 0 && year % 400 == 0) {
			return true;
		}else if (year % 4 == 0 && !(year % 100 == 0)) {
			return true;
		}else {
			return false;
		}
	}
	
	//GETTERS & SETTERS
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
}
