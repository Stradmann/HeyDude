package test2405;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		QuotesRepository quotesRepository = new QuotesRepository(entityManager);
		BookRepository bookRepository = new BookRepository(entityManager);
		
		Book myBook = new Book("My Book");
		
		Optional<Book> savedBook = bookRepository.save(myBook);
	}

	
}
