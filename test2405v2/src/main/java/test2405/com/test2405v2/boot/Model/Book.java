package test2405.com.test2405v2.boot.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Quote> quotes = new ArrayList<Quote>();
	
	protected Book() {}
	
	public Book(String title) {
		super();
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Quote> getQuotes() {
		return quotes;
	}

	public void addQuote(Quote quote) {
		quotes.add(quote);
		quote.setBook(this);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	
	
}
