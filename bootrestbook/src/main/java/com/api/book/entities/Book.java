package com.api.book.entities;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int id;
	
	private String bookName;
	
	private String title;
	
	//@Column(name = "authorBook_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
	//@Column(name = "pageBook_id")
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Page> pages;


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int id, String bookName, String title, Author author, Set<Page> pages) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	
}
