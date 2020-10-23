package app;

import modules.Book;
import modules.Author;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Author> authors = start();
		
		boolean exitMenu = false;
		while(!exitMenu) {
			System.out.println("What do you want to do?");
			System.out.println("Create new (B)ook, (A)ssign new book, (Q)uit");
			String command = read.nextLine();
			
			switch (command) {
			
			case "b":
			case "B":
				createBook(read, authors.get(1));
				break;
				
			case "a":
			case "A":
				assign(read, authors);
				break;
				
			case "q":
			case "Q":
				exitMenu = true;
				break;
			}
		}
		
		
	}
	
	public static ArrayList<Author> start() {
		
		Book book1 = new Book("the mountain", "The american", 1980, "Folks", 20.50);
		Book book2 = new Book("the country", "The american", 1982, "Folks", 22.50);
		Book book3 = new Book("the road", "The american", 1984, "Folks", 24.50);
		
		Author author1 = new Author("The american", "americacountryroadsonmountain@gmail.com", 'M');
		Author author2 = new Author("Gregory Picker", "intheabby@gmail.com", 'M');
		Author author3 = new Author("Sofy Sofa", "totalrelax@gmail.com", 'F');
		
		ArrayList<Author> authors = new ArrayList<Author>();
		Collections.addAll(authors, author1, author2, author3);
		
		Collections.addAll(author1.getBooks(), book1, book2, book3);
		return authors;
	}
	
	public static void createBook(Scanner read, Author author) {
		
		System.out.println("What's the title?");
		String title = read.nextLine();
		System.out.println("what's the year of publication?");
		int year = Integer.valueOf(read.nextLine());
		System.out.println("Who is the publisher?");
		String publisher = read.nextLine();
		System.out.println("How much it costs?");
		double cost = Double.valueOf(read.nextLine());
		
		Book newBook = new Book(title, author.getName(), year, publisher, cost);
		author.getBooks().add(newBook);
		System.out.println(newBook);
	}
	
	public static void assign(Scanner read, ArrayList<Author> authors) {
		
		System.out.println("Whos is the author?");
		String authorName = read.nextLine();
		boolean authorExist = false;
		for (Author author : authors) {
			if(authorName.equals(author.getName())) {
				authorExist = true;
				createBook(read, author);
				break;
			}
		}
		if (!authorExist) {
			System.out.println("This author does not exist here");
		}
	}
}
