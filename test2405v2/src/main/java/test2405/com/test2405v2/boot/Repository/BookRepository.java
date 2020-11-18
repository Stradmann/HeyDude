package test2405.com.test2405v2.boot.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test2405.com.test2405v2.boot.Model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);

	Book findById(long id);
}

