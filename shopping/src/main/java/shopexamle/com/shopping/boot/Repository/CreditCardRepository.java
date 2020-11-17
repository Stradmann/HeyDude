package shopexamle.com.shopping.boot.Repository;

import org.springframework.data.repository.CrudRepository;

import shopexamle.com.shopping.boot.Model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}
