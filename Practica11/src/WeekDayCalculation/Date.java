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
		if (checkYear(this.getYear()) && checkMonth(this.getMonth()) && checkDay(this.getYear(), this.getMonth(), this.getDay())) {
			return true;
		}
		return false;
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
			if (isLeapYear(year) && day >= 1 && day <= 29) {
				return true;
			}else if (!isLeapYear(year) && day >= 1 && day <= 1) {
				return true;
			}
		}
		return false;
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
	
	public int daysAmount () {
		return entireYearsCount(this.getYear()) + entireMonthsCount(this.getYear(), this.getMonth()) + daysCount(this.getDay());
	}
	
	public int entireYearsCount(int year) {
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
	
	public int entireMonthsCount(int year, int month) {
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
	
	public int daysCount(int day) {
		int days = day;
		return days;
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
	
	//TOSTRING
	@Override
	public String toString () {
		return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
	}
}
