package com.TestUf2406.TestUF2406.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Quote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sentence;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "BOOK_ID_FK", nullable = true)
	@JsonIgnore
	private Book book;
	
	public Quote() {}

	public Quote(Long id, String sentence, Book book) {
		super();
		this.id = id;
		this.sentence = sentence;
		this.book = book;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", sentence=" + sentence + ", book=" + book + "]";
	}
	
	
}
