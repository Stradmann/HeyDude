package Library;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Library> libraries = new ArrayList<Library>();
		
		boolean exit = false;
		while (!exit) {
			
			System.out.println("What do you want to do?");
			System.out.println("Create new (L)ibrary\n(A)dd book to an existing Library\nSearch book by (T)itle\nSearch book by (P)ublisher\nSearch book by (Y)ear\nE(X)it");
			String answer = read.nextLine();
			answer = Utilities.toUpperCase(answer);
			
			switch(answer) {
			
			case "L":
				System.out.println("Whats the name of the library?");
				Library newLibrary = new Library(read.nextLine());
				libraries.add(newLibrary);
				System.out.println("You created " + newLibrary.getName() + "library");
				exit = false;
				break;
				
			case "A":
				System.out.println("In which library you want to add new book?");
				String searchedLibrary = Utilities.prepareStringToStore(read.nextLine());
				Library selectedLibrary = findLibrary(searchedLibrary, libraries);
				if (selectedLibrary != null) {
					System.out.println("Introduce data of the book to add:");
					System.out.println("Title:");
					String title = Utilities.prepareStringToStore(read.nextLine());
					System.out.println("Publisher:");
					String publisher = Utilities.prepareStringToStore(read.nextLine());
					System.out.println("Year:");
					int year = Integer.valueOf(read.nextLine());
					selectedLibrary.addBook(title, publisher, year);
					System.out.println("You added new book to " + selectedLibrary.getName() + "library");
				}
				exit = false;
				break;
				
			case "T":
				System.out.println("What title are you looking for?");
				String schTitle = Utilities.prepareStringToStore(read.nextLine());
				String printString = "";
				for(Library library :libraries) {
					ArrayList<Book> findedBooks = library.findedBooksByTitle(schTitle);
					if (findedBooks.size() != 0) {
						printString = "Library " + library.getName() + ":\n";
						for (Book book : findedBooks) {
							printString += " " + book + "\n";
						}
					}
					System.out.println(printString);
				}
				exit = false;
				break;
				
			case "P":
				
			}
		}
	}
	
	public static Library findLibrary(String name, ArrayList<Library> libraries) {
		
		for (Library library : libraries) {
			if (library.getName().equals(name)) {
				System.out.println("Library " + library.getName() + " found!");
				return library;
			}
		}
		System.out.println("This library does not exist. Please, type the name correctly.");
		return null;
	}
}
