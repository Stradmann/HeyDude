package weekdayCalculator;

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
