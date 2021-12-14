package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {
	
	//object come automatically when we add @Autowired annotation
	@Autowired
	private BookRepository bookRepository;

//	private static List<Book> list = new ArrayList<>();

//	static {
//		list.add(new Book(12, "Java Complete Reference", "XYZ"));
//		list.add(new Book(24, "Head First to Java", "ABC"));
//		list.add(new Book(36, "Think in Java", "PQR"));
//	}

	// get all books
	public List<Book> getAllBooks() {
		List<Book> list =(List<Book>) this.bookRepository.findAll(); //return iterable
		return list;
	}

	// get single book by ID
	public Book getBookById(int id) {
		Book book = null;
		try {
			//book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			book = this.bookRepository.findById(id);
			
		} catch (Exception e2) 
		{
			e2.printStackTrace();
		}
		
		return book;
	}

	// adding the book
	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
		return result;
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

		//list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
		bookRepository.deleteById(bid);

	}
	
	//update the book
	public void updateBook(Book book,int bookId) {
//		list.stream().map(b->{
//			if (b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			} 
//			return b;
//		}).collect(Collectors.toList());
		
		book.setId(bookId);
		bookRepository.save(book);
		
	}
}
