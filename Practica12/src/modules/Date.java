package modules;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	//CONSTRUCTOR
	public Date (int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
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
