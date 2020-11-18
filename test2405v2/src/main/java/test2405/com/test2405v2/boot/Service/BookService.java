package test2405.com.test2405v2.boot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test2405.com.test2405v2.boot.Model.Book;
import test2405.com.test2405v2.boot.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public Iterable<Book> findAll() {

		return repository.findAll();
	}
}
