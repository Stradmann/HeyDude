package shopexamle.com.shopping.boot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopexamle.com.shopping.boot.Model.Customer;
import shopexamle.com.shopping.boot.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Iterable<Customer> findAll() {

		return repository.findAll();
	}
}
