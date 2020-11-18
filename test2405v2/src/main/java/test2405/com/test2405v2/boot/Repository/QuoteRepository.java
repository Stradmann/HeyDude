package test2405.com.test2405v2.boot.Repository;

import org.springframework.data.repository.CrudRepository;

import test2405.com.test2405v2.boot.Model.Quote;


public interface QuoteRepository extends CrudRepository<Quote, Long> {

	Quote findById(long id);

}
