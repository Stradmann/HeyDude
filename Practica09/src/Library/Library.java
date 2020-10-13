package Library;

import java.util.ArrayList;

public class Library {
	
	private String name;
	private ArrayList<Book> books;
	private ArrayList<Book> lookedForBooks = new ArrayList<Book>();
	
	//CONSTRUCTOR
	public Library (String name) {
		
		this.name = Utilities.prepareStringToStore(name);
		books = new ArrayList<Book>();
	}
	
	//METHODS
	public void addBook (String title, String publisher, int year) {
		
		Book book = new Book(title, publisher, year);
		books.add(book);
	}
	
	public ArrayList<Book> findedBooksByTitle (String title){
		
		lookedForBooks.clear();
		for (Book book : books) {
			if (book.getTitle().contains(title)) {
				lookedForBooks.add(book);
			}
		}
		return lookedForBooks;
	}
	
	public ArrayList<Book> findedBooksByPublisher (String publisher){
		
		lookedForBooks.clear();
		for (Book book : books) {
			if (book.getPublisher().contains(publisher)) {
				lookedForBooks.add(book);
			}
		}
		return lookedForBooks;
	}
	
	public ArrayList<Book> findedBooksByYear (int year){
		
		lookedForBooks.clear();
		for (Book book : books) {
			if (book.getYear() == year) {
				lookedForBooks.add(book);
			}
		}
		return lookedForBooks;
	}
	
	//GETTERS & SETTERS
	public String getName() {
		
		return this.name;
	}
	
	//TOSTRING
	public String toString() {
		
		String string = "Library " + this.getName() + "\n";
		for (Book book : books) {
			string += " " + book + "\n";
		}
		return string;
	}
}
