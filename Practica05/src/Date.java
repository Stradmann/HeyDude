
public class Date {
	
	private int year;
	private int month;
	private int day;
	
	public Date (int year, int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean isLater (Date startDate, Date date) {
		
		if (startDate.getYear() < date.getYear()) {
			return true;
		}else if (startDate.getYear() == date.getYear() && startDate.getMonth() < date.getMonth()) {
			return true;
		}else if (startDate.getYear() == date.getYear() && startDate.getMonth() == date.getMonth() && startDate.getDay() < date.getDay()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEarlier (Date endDate, Date date) {
		
		if (endDate.getYear() > date.getYear()) {
			return true;
		}else if (endDate.getYear() == date.getYear() && endDate.getMonth() > date.getMonth()) {
			return true;
		}else if (endDate.getYear() == date.getYear() && endDate.getMonth() == date.getMonth() && endDate.getDay() > date.getDay()) {
			return true;
		}else {
			return false;
		}
	}
	
	//GETTERS & SETTERS
	public int getYear() {
		
		return this.year;
	}
	
	public void setYear (int year) {
		
		this.year = year;
	}
	
	public int getMonth() {
		
		return this.month;
	}
	
	public void setMonth (int month) {
		
		this.month = month;
	}
	
	public int getDay() {
		
		return this.day;
	}
	
	public void setDay (int day) {
		
		this.year = day;
	}
	
	//TO STRING
	@Override
	public String toString() {
		
		return day + "/" + month + "/" + year;
	}
}
