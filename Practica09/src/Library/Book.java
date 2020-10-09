package Library;

public class Book {
	
	private String title;
	private String publisher;
	private int year;
	
	//CONSTRUCTOR
	public Book(String title, String publisher, int year) {
		
		this.title = Utilities.prepareStringToStore(title);
		this.publisher = Utilities.prepareStringToStore(publisher);
		this.year = year;
	}
	
	//GETTERS & SETTERS
	public String getTitle() {
		
		return this.title;
	}
	
	public String getPublisher() {
		
		return this.publisher;
	}
	
	public int getYear() {
		
		return this.year;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		
		return this.getTitle() + ", " + this.getPublisher() + ", " + this.getYear();
	}
}
