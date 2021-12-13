package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(12, "Java Complete Reference", "XYZ"));
		list.add(new Book(24, "Head First to Java", "ABC"));
		list.add(new Book(36, "Think in Java", "PQR"));
	}

	// get all books
	public List<Book> getAllBooks() {
		return list;
	}

	// get single book by ID
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			
		} catch (Exception e2) 
		{
			e2.printStackTrace();
		}
		
		return book;
	}

	// adding the book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

	// delete Book
	public void deleteBook(int bid) {
//		list.stream().filter(book->{
//			if (book.getId()!=bid) {
//				return true;
//			} else {
//				return false;
//			}
//		}).collect(Collectors.toList());

		list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());

	}
	
	//update the book
	public void updateBook(Book book,int bookId) {
		list.stream().map(b->{
			if (b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			} 
			return b;
		}).collect(Collectors.toList());
	}
}
